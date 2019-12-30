package com.ruoyi.project.system.mapper;

import com.ruoyi.project.system.domain.EntEmployee;
import java.util.List;

/**
 * 企业雇员管理Mapper接口
 * 
 * @author ruoyi
 * @date 2019-12-24
 */
public interface EntEmployeeMapper 
{
    /**
     * 查询企业雇员管理
     * 
     * @param id 企业雇员管理ID
     * @return 企业雇员管理
     */
    public EntEmployee selectEntEmployeeById(Long id);

    /**
     * 查询企业雇员管理列表
     * 
     * @param entEmployee 企业雇员管理
     * @return 企业雇员管理集合
     */
    public List<EntEmployee> selectEntEmployeeList(EntEmployee entEmployee);

    /**
     * 新增企业雇员管理
     * 
     * @param entEmployee 企业雇员管理
     * @return 结果
     */
    public int insertEntEmployee(EntEmployee entEmployee);

    /**
     * 修改企业雇员管理
     * 
     * @param entEmployee 企业雇员管理
     * @return 结果
     */
    public int updateEntEmployee(EntEmployee entEmployee);

    /**
     * 删除企业雇员管理
     * 
     * @param id 企业雇员管理ID
     * @return 结果
     */
    public int deleteEntEmployeeById(Long id);

    /**
     * 批量删除企业雇员管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteEntEmployeeByIds(Long[] ids);
}
