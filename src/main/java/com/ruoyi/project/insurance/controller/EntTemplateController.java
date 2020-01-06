package com.ruoyi.project.insurance.controller;

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
import com.ruoyi.project.insurance.domain.EntTemplate;
import com.ruoyi.project.insurance.service.IEntTemplateService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 模板添加Controller
 *
 * @author ruoyi
 * @date 2019-12-25
 */
@RestController
@RequestMapping("/ent_template/template")
public class EntTemplateController extends BaseController
{
    @Autowired
    private IEntTemplateService entTemplateService;

    /**
     * 查询模板添加列表4
     */
    @PreAuthorize("@ss.hasPermi('ent_template:template:list')")
    @GetMapping("/list")
    public TableDataInfo list(EntTemplate entTemplate)
    {
        startPage();
        List<EntTemplate> list = entTemplateService.selectEntTemplateList(entTemplate);
        return getDataTable(list);
    }

    /**
     * 导出模板添加列表
     */
    @PreAuthorize("@ss.hasPermi('ent_template:template:export')")
    @Log(title = "模板添加", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(EntTemplate entTemplate)
    {
        List<EntTemplate> list = entTemplateService.selectEntTemplateList(entTemplate);
        ExcelUtil<EntTemplate> util = new ExcelUtil<EntTemplate>(EntTemplate.class);
        return util.exportExcel(list, "template");
    }

    /**
     * 获取模板添加详细信息
     */
    @PreAuthorize("@ss.hasPermi('ent_template:template:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(entTemplateService.selectEntTemplateById(id));
    }

    /**
     * 新增模板添加
     */
    @PreAuthorize("@ss.hasPermi('ent_template:template:add')")
    @Log(title = "模板添加", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EntTemplate entTemplate)
    {
        return toAjax(entTemplateService.insertEntTemplate(entTemplate));
    }

    /**
     * 修改模板添加
     */
    @PreAuthorize("@ss.hasPermi('ent_template:template:edit')")
    @Log(title = "模板添加", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EntTemplate entTemplate)
    {
        return toAjax(entTemplateService.updateEntTemplate(entTemplate));
    }

    /**
     * 删除模板添加
     */
    @PreAuthorize("@ss.hasPermi('ent_template:template:remove')")
    @Log(title = "模板添加", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(entTemplateService.deleteEntTemplateByIds(ids));
    }
}
