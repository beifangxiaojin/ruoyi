package com.ruoyi.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.mapper.EntEmployeeMapper;
import com.ruoyi.project.system.domain.EntEmployee;
import com.ruoyi.project.system.service.IEntEmployeeService;

/**
 * 企业雇员管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-12-24
 */
@Service
public class EntEmployeeServiceImpl implements IEntEmployeeService 
{
    @Autowired
    private EntEmployeeMapper entEmployeeMapper;

    /**
     * 查询企业雇员管理
     * 
     * @param id 企业雇员管理ID
     * @return 企业雇员管理
     */
    @Override
    public EntEmployee selectEntEmployeeById(Long id)
    {
        return entEmployeeMapper.selectEntEmployeeById(id);
    }

    /**
     * 查询企业雇员管理列表
     * 
     * @param entEmployee 企业雇员管理
     * @return 企业雇员管理
     */
    @Override
    public List<EntEmployee> selectEntEmployeeList(EntEmployee entEmployee)
    {
        return entEmployeeMapper.selectEntEmployeeList(entEmployee);
    }

    /**
     * 新增企业雇员管理
     * 
     * @param entEmployee 企业雇员管理
     * @return 结果
     */
    @Override
    public int insertEntEmployee(EntEmployee entEmployee)
    {
        return entEmployeeMapper.insertEntEmployee(entEmployee);
    }

    /**
     * 修改企业雇员管理
     * 
     * @param entEmployee 企业雇员管理
     * @return 结果
     */
    @Override
    public int updateEntEmployee(EntEmployee entEmployee)
    {
        return entEmployeeMapper.updateEntEmployee(entEmployee);
    }

    /**
     * 批量删除企业雇员管理
     * 
     * @param ids 需要删除的企业雇员管理ID
     * @return 结果
     */
    @Override
    public int deleteEntEmployeeByIds(Long[] ids)
    {
        return entEmployeeMapper.deleteEntEmployeeByIds(ids);
    }

    /**
     * 删除企业雇员管理信息
     * 
     * @param id 企业雇员管理ID
     * @return 结果
     */
    @Override
    public int deleteEntEmployeeById(Long id)
    {
        return entEmployeeMapper.deleteEntEmployeeById(id);
    }
}
