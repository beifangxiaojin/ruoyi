package com.ruoyi.project.system.mapper;

import com.ruoyi.project.system.domain.EntCorporate;
import java.util.List;

/**
 * 企业公司管理Mapper接口
 * 
 * @author ruoyi
 * @date 2019-12-24
 */
public interface EntCorporateMapper 
{
    /**
     * 查询企业公司管理
     * 
     * @param id 企业公司管理ID
     * @return 企业公司管理
     */
    public EntCorporate selectEntCorporateById(Long id);

    /**
     * 查询企业公司管理列表
     * 
     * @param entCorporate 企业公司管理
     * @return 企业公司管理集合
     */
    public List<EntCorporate> selectEntCorporateList(EntCorporate entCorporate);

    /**
     * 新增企业公司管理
     * 
     * @param entCorporate 企业公司管理
     * @return 结果
     */
    public int insertEntCorporate(EntCorporate entCorporate);

    /**
     * 修改企业公司管理
     * 
     * @param entCorporate 企业公司管理
     * @return 结果
     */
    public int updateEntCorporate(EntCorporate entCorporate);

    /**
     * 删除企业公司管理
     * 
     * @param id 企业公司管理ID
     * @return 结果
     */
    public int deleteEntCorporateById(Long id);

    /**
     * 批量删除企业公司管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteEntCorporateByIds(Long[] ids);
}
