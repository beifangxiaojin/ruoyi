package com.ruoyi.project.insurance.employee.controller;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.insurance.employee.domain.Template;
import com.ruoyi.project.insurance.employee.service.TemplateService;
import org.aspectj.weaver.loadtime.Aj;
import org.hibernate.validator.constraints.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee/template")

public class TemplateController extends BaseController {
    @Autowired
    private TemplateService templateService;

    @GetMapping("/list")
    public TableDataInfo list(Template template) {
        startPage();
        List<Template> list = templateService.selectTemplateList(template);
        return getDataTable(list);
    }

    @Log(title = "保险组管理", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Template template) {
        List<Template> list = templateService.selectTemplateList(template);
        ExcelUtil<Template> util = new ExcelUtil<Template>(Template.class);
        return util.exportExcel(list, "保险组信息");

    }

    @GetMapping(value = "/{Id}")
    public AjaxResult getInfo(@PathVariable Long Id) {
        return AjaxResult.success(templateService.selecttemplateById(Id));
    }

    @Log(title = "保险组管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody Template template) {
        if (UserConstants.NOT_UNIQUE.equals(templateService.checkTemplateNameUnique(template.getPageName()))) {
            return AjaxResult.error("新增保险组'" + template.getPageName() + "'失败，角色名称已经存在！");

        }
        template.setCreator(SecurityUtils.getUsername());
        return toAjax(templateService.insertTemplate(template));
    }

    @Log(title = "保险组管理", businessType = BusinessType.UPDATE)
    public AjaxResult edit(@Validated @RequestBody Template template) {
        if (UserConstants.NOT_UNIQUE.equals(templateService.checkTemplateNameUnique(template.getPageName()))) {
            return AjaxResult.error("修改保险组'" + template.getPageName() + "'失败，角色名称已存在");

        }
        return toAjax(templateService.updateTemplate(template));

    }

    @GetMapping("/optionselect")
    public AjaxResult optionSelect() {
        return AjaxResult.success(templateService.selectTemplateAll());
    }
}
