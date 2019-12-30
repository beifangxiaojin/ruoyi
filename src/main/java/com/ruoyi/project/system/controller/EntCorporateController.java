package com.ruoyi.project.system.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.domain.EntCorporate;
import com.ruoyi.project.system.service.IEntCorporateService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 企业公司管理Controller
 * 
 * @author ruoyi
 * @date 2019-12-24
 */
@RestController
@RequestMapping("/system/corporate")
public class EntCorporateController extends BaseController
{
    @Autowired
    private IEntCorporateService entCorporateService;

    /**
     * 查询企业公司管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:corporate:list')")
    @GetMapping("/list")
    public TableDataInfo list(EntCorporate entCorporate)
    {
        startPage();
        List<EntCorporate> list = entCorporateService.selectEntCorporateList(entCorporate);
        return getDataTable(list);
    }

    /**
     * 导出企业公司管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:corporate:export')")
    @Log(title = "企业公司管理", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(EntCorporate entCorporate)
    {
        List<EntCorporate> list = entCorporateService.selectEntCorporateList(entCorporate);
        ExcelUtil<EntCorporate> util = new ExcelUtil<EntCorporate>(EntCorporate.class);
        return util.exportExcel(list, "corporate");
    }

    /**
     * 获取企业公司管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:corporate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(entCorporateService.selectEntCorporateById(id));
    }

    /**
     * 新增企业公司管理
     */
    @PreAuthorize("@ss.hasPermi('system:corporate:add')")
    @Log(title = "企业公司管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EntCorporate entCorporate)
    {
        return toAjax(entCorporateService.insertEntCorporate(entCorporate));
    }

    /**
     * 修改企业公司管理
     */
    @PreAuthorize("@ss.hasPermi('system:corporate:edit')")
    @Log(title = "企业公司管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EntCorporate entCorporate)
    {
        return toAjax(entCorporateService.updateEntCorporate(entCorporate));
    }

    /**
     * 删除企业公司管理
     */
    @PreAuthorize("@ss.hasPermi('system:corporate:remove')")
    @Log(title = "企业公司管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(entCorporateService.deleteEntCorporateByIds(ids));
    }
}
