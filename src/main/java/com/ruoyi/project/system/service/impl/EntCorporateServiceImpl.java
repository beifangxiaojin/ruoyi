package com.ruoyi.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.mapper.EntCorporateMapper;
import com.ruoyi.project.system.domain.EntCorporate;
import com.ruoyi.project.system.service.IEntCorporateService;

/**
 * 企业公司管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-12-24
 */
@Service
public class EntCorporateServiceImpl implements IEntCorporateService 
{
    @Autowired
    private EntCorporateMapper entCorporateMapper;

    /**
     * 查询企业公司管理
     * 
     * @param id 企业公司管理ID
     * @return 企业公司管理
     */
    @Override
    public EntCorporate selectEntCorporateById(Long id)
    {
        return entCorporateMapper.selectEntCorporateById(id);
    }

    /**
     * 查询企业公司管理列表
     * 
     * @param entCorporate 企业公司管理
     * @return 企业公司管理
     */
    @Override
    public List<EntCorporate> selectEntCorporateList(EntCorporate entCorporate)
    {
        return entCorporateMapper.selectEntCorporateList(entCorporate);
    }

    /**
     * 新增企业公司管理
     * 
     * @param entCorporate 企业公司管理
     * @return 结果
     */
    @Override
    public int insertEntCorporate(EntCorporate entCorporate)
    {
        return entCorporateMapper.insertEntCorporate(entCorporate);
    }

    /**
     * 修改企业公司管理
     * 
     * @param entCorporate 企业公司管理
     * @return 结果
     */
    @Override
    public int updateEntCorporate(EntCorporate entCorporate)
    {
        return entCorporateMapper.updateEntCorporate(entCorporate);
    }

    /**
     * 批量删除企业公司管理
     * 
     * @param ids 需要删除的企业公司管理ID
     * @return 结果
     */
    @Override
    public int deleteEntCorporateByIds(Long[] ids)
    {
        return entCorporateMapper.deleteEntCorporateByIds(ids);
    }

    /**
     * 删除企业公司管理信息
     * 
     * @param id 企业公司管理ID
     * @return 结果
     */
    @Override
    public int deleteEntCorporateById(Long id)
    {
        return entCorporateMapper.deleteEntCorporateById(id);
    }
}
