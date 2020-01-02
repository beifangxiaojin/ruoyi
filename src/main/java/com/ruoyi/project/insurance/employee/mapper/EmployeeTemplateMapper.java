package com.ruoyi.project.insurance.employee.mapper;

import com.github.pagehelper.Page;
import com.ruoyi.project.insurance.employee.domain.EmployeeTemplate;
import com.ruoyi.project.insurance.domain.EntTemplate;

import java.util.List;
import java.util.Map;

public interface EmployeeTemplateMapper {

    /**
     * 添加员工信息
     * @param employeeTemplate
     */
    public void add(EmployeeTemplate employeeTemplate,Long[] templateIds);

    /**
     * 设置人员和模板
     * @param map
     */
    public void setEmployeeAndTemplate(Map map);



    /**
     * 查询人员根据id
     * @param id
     * @return
     */
    public EmployeeTemplate findById(Long id);

    /**
     * 根据人员id查询模板id
     * @param id
     * @return
     */
    public List<Long> findEmployeeIdsByTemplateId(Long id);

    /**
     * 编辑人员
     * @param entTemplate
     */
    public void edit(EmployeeTemplate employeeTemplate,Long[]teplateIds);

    /**
     * 查询所有人员
     * @return
     */
    public List<EmployeeTemplate> findAll(EmployeeTemplate employeeTemplate);
}
