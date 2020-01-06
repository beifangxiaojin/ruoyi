package com.ruoyi.project.insurance.employee.service;

import com.ruoyi.project.insurance.employee.domain.Template;

import java.util.List;

public interface TemplateService {



        /**
         * 根据条件分页查询保险组数据
         *
         * @param template 保险组信息
         * @return 保险组数据集合信息
         */
        public List<Template> selectTemplateList(com.ruoyi.project.insurance.employee.domain.Template template);

        /**
         * 根据用户ID查询保险组
         *
         * @param EmployeeId 员工ID
         * @return 保险组列表
         */
        public List<com.ruoyi.project.insurance.employee.domain.Template> selectTemplatePermissionByEmployeeId(Long EmployeeId);

        /**
         * 查询所有保险组
         *
         * @return 保险组列表
         */
        public List<com.ruoyi.project.insurance.employee.domain.Template> selectTemplateAll();

        /**
         * 根据员工ID获取保险组选择框列表
         *
         * @param EmployeeId 用户ID
         * @return 选中保险组ID列表
         */
        public List<Integer> selectTemplateListByEmployeeId(Long EmployeeId);

        /**
         * 通过保险组ID查询保险组
         *
         * @param templateId 保险组ID
         * @return 保险组对象信息
         */
        public com.ruoyi.project.insurance.employee.domain.Template selecttemplateById(Long templateId);

        /**
         * 根据员工ID查询保险组
         *
         * @param userName 用户名
         * @return 保险组列表
         */
        public List<com.ruoyi.project.insurance.employee.domain.Template> selectTemplateByUserName(String userName);

        /**
         * 校验保险组名称是否唯一
         *
         * @param TemplateName 保险组名称
         * @return 保险组信息
         */
        public com.ruoyi.project.insurance.employee.domain.Template checkTemplateNameUnique(String TemplateName);
        /*
         *//**
         * 校验角色权限是否唯一
         *
         * @param roleKey 角色权限
         * @return 角色信息
         *//*
    public SysRole checkRoleKeyUnique(String roleKey);*/

        /**
         * 修改保险组信息
         *
         * @param template 保险组信息
         * @return 结果
         */
        public int updateTemplate(com.ruoyi.project.insurance.employee.domain.Template template);

        /**
         * 新增保险组信息
         *
         * @param template 保险组信息
         * @return 结果
         */
        public int insertTemplate(com.ruoyi.project.insurance.employee.domain.Template template);
    }


