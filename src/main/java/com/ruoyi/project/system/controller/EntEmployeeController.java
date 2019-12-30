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
import com.ruoyi.project.system.domain.EntEmployee;
import com.ruoyi.project.system.service.IEntEmployeeService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 企业雇员管理Controller
 * 
 * @author ruoyi
 * @date 2019-12-24
 */
@RestController
@RequestMapping("/system/employee")
public class EntEmployeeController extends BaseController
{
    @Autowired
    private IEntEmployeeService entEmployeeService;

    /**
     * 查询企业雇员管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:employee:list')")
    @GetMapping("/list")
    public TableDataInfo list(EntEmployee entEmployee)
    {
        startPage();
        List<EntEmployee> list = entEmployeeService.selectEntEmployeeList(entEmployee);
        return getDataTable(list);
    }

    /**
     * 导出企业雇员管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:employee:export')")
    @Log(title = "企业雇员管理", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(EntEmployee entEmployee)
    {
        List<EntEmployee> list = entEmployeeService.selectEntEmployeeList(entEmployee);
        ExcelUtil<EntEmployee> util = new ExcelUtil<EntEmployee>(EntEmployee.class);
        return util.exportExcel(list, "employee");
    }

    /**
     * 获取企业雇员管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:employee:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(entEmployeeService.selectEntEmployeeById(id));
    }

    /**
     * 新增企业雇员管理
     */
    @PreAuthorize("@ss.hasPermi('system:employee:add')")
    @Log(title = "企业雇员管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EntEmployee entEmployee)
    {
        return toAjax(entEmployeeService.insertEntEmployee(entEmployee));
    }

    /**
     * 修改企业雇员管理
     */
    @PreAuthorize("@ss.hasPermi('system:employee:edit')")
    @Log(title = "企业雇员管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EntEmployee entEmployee)
    {
        return toAjax(entEmployeeService.updateEntEmployee(entEmployee));
    }

    /**
     * 删除企业雇员管理
     */
    @PreAuthorize("@ss.hasPermi('system:employee:remove')")
    @Log(title = "企业雇员管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(entEmployeeService.deleteEntEmployeeByIds(ids));
    }
}
