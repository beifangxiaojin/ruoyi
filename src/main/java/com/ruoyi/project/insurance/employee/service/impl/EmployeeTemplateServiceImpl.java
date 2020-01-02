package com.ruoyi.project.insurance.employee.service.impl;

import com.github.pagehelper.Page;
import com.ruoyi.project.insurance.employee.domain.EmployeeTemplate;
import com.ruoyi.project.insurance.employee.mapper.EmployeeTemplateMapper;
import com.ruoyi.project.insurance.employee.service.EmployeeTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class EmployeeTemplateServiceImpl implements EmployeeTemplateService {
    @Autowired
    private EmployeeTemplateMapper employeeTemplateMapper;
   // private EmployeeTemplateMapper employeeTemplateMapper;



    @Override
    public void add(EmployeeTemplate employeeTemplate, Long[] templateIds) {
        employeeTemplateMapper.add(employeeTemplate, templateIds);
        Long employeeTemplateId = employeeTemplate.getId();
        this.setEmployeeAndTemplate(employeeTemplateId, templateIds);
    }


    @Override
    public void setEmployeeAndTemplate(Map map) {

    }

   /* @Override
    public Page<EmployeeTemplate> findByCondition(String queryString) {
        return null;
    }*/

    @Override
    public EmployeeTemplate findById(Long id) {
        return employeeTemplateMapper.findById(id);
    }

    @Override
    public List<Long> findEmployeeIdsByTemplateId(Long id) {
        return employeeTemplateMapper.findEmployeeIdsByTemplateId(id);
    }

    @Override
    public void edit(EmployeeTemplate employeeTemplate,Long[] templateIds) {
    employeeTemplateMapper.edit(employeeTemplate,templateIds);
        Long employeeTemplateId = employeeTemplate.getId();
        this.setEmployeeAndTemplate(employeeTemplateId,templateIds);
    }

   @Override
    public List<EmployeeTemplate> findAll(EmployeeTemplate employeeTemplate) {
        return employeeTemplateMapper.findAll(employeeTemplate);
    }

    public void setEmployeeAndTemplate(Long employeeTemplateId, Long[] templateIds) {
        if (templateIds != null && templateIds.length > 0){
            for (Long templateId : templateIds) {
                Map<String, Long> map = new HashMap<>();
                map.put("employeeId",employeeTemplateId);
                map.put("templateId",templateId);
                employeeTemplateMapper.setEmployeeAndTemplate(map);
            }
        }
    }
/*    @Override
    public EmployeeTemplate add(EmployeeTemplate employeeTemplate,Long [] templateIds) {
return employeeTemplateMapper.add(employeeTemplate,templateIds);
    }

    @Override
    public void setEmployeeAndTemplate(Map map) {

    }

    @Override
    public Page<EmployeeTemplate> findByCondition(String queryString) {
        return employeeTemplateMapper.findByCondition(queryString);
    }

    @Override
    public EmployeeTemplate findById(Long id) {
        return employeeTemplateMapper.findById(id);
    }

    @Override
    public List<Long> findEmployeeIdsByTemplateId(Long id) {
        return employeeTemplateMapper.findEmployeeIdsByTemplateId(id);
    }

    @Override
    public EmployeeTemplate edit(EmployeeTemplate entTemplate, Long[] templateIds) {
        return employeeTemplateMapper.edit(entTemplate,templateIds);
    }


    @Override
    public List<EmployeeTemplate> findAll(EmployeeTemplate employeeTemplate) {
        return employeeTemplateMapper.findAll(employeeTemplate);
    }*/
}
