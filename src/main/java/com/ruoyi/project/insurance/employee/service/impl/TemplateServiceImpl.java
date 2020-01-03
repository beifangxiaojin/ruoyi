package com.ruoyi.project.insurance.employee.service.impl;


import com.ruoyi.project.insurance.employee.domain.Template;
import com.ruoyi.project.insurance.employee.mapper.TemplateMapper;
import com.ruoyi.project.insurance.employee.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateServiceImpl implements TemplateService{
    @Autowired
    private TemplateMapper templateMapper;

    @Override
    public List<Template> selectTemplateList(Template template) {
        return templateMapper.selectTemplateList(template);
    }

    @Override
    public List<Template> selectTemplatePermissionByEmployeeId(Long EmployeeId) {
        return templateMapper.selectTemplatePermissionByEmployeeId(EmployeeId);
    }

    @Override
    public List<Template> selectTemplateAll() {
        return templateMapper.selectTemplateAll();
    }

    @Override
    public List<Integer> selectTemplateListByEmployeeId(Long EmployeeId) {
        return templateMapper.selectTemplateListByEmployeeId(EmployeeId);
    }

    @Override
    public Template selecttemplateById(Long templateId) {
        return templateMapper.selecttemplateById(templateId);
    }

    @Override
    public List<Template> selectTemplateByUserName(String empName) {
        return templateMapper.selectTemplateByUserName(empName);
    }

    @Override
    public Template checkTemplateNameUnique(String TemplateName) {
        return templateMapper.checkTemplateNameUnique(TemplateName);
    }

    @Override
    public int updateTemplate(Template template) {
        return templateMapper.updateTemplate(template);
    }

    @Override
    public int insertTemplate(Template template) {
        return templateMapper.insertTemplate(template);
    }
}
