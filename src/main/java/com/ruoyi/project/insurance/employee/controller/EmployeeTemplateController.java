package com.ruoyi.project.insurance.employee.controller;

import com.ruoyi.framework.interceptor.RepeatSubmitInterceptor;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.common.MessageConstant;
import com.ruoyi.project.common.Result;
import com.ruoyi.project.insurance.domain.EntTemplate;
import com.ruoyi.project.insurance.employee.domain.EmployeeTemplate;
import com.ruoyi.project.insurance.employee.service.EmployeeTemplateService;
import net.bytebuddy.description.NamedElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/insurance/employee")
public class EmployeeTemplateController extends BaseController {
    @Autowired
    private EmployeeTemplateService employeeTemplateService;

    @GetMapping("/findAll")
    public TableDataInfo list(EmployeeTemplate employeeTemplate) {
        startPage();
        List<EmployeeTemplate> list = employeeTemplateService.findAll(employeeTemplate);
        return getDataTable(list);
    }

    @GetMapping("/findById")
    public Result findById(Long id) {
        try {
            EmployeeTemplate employeeTemplate = employeeTemplateService.findById(id);
            return new Result(true, MessageConstant.QUERY_EMPLOYEE_SUCCESS, employeeTemplate);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.ADD_EMPLOYEE_FAIL);
        }

    }

    @GetMapping("/add")
    public Result add(@RequestBody EmployeeTemplate employeeTemplate, Long[] templateIds) {
        try {
            employeeTemplateService.add(employeeTemplate, templateIds);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.ADD_EMPLOYEE_FAIL);
        }

        return new Result(true, MessageConstant.QUERY_EMPLOYEE_SUCCESS);
    }

    @GetMapping("/edit")
    public Result edit(@RequestBody EmployeeTemplate employeeTemplate, Long[] templateIds) {
        try {
            employeeTemplateService.edit(employeeTemplate, templateIds);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(true, MessageConstant.EDIT_TEMPLATE_FAIL);
        }
        return new Result(false, MessageConstant.EDIT_TEMPLATE_SUCCESS);
    }
}
