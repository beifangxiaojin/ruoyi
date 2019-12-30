package com.ruoyi.project.insurance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.insurance.mapper.EntTemplateMapper;
import com.ruoyi.project.insurance.domain.EntTemplate;
import com.ruoyi.project.insurance.service.IEntTemplateService;

/**
 * 模板添加Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-12-25
 */
@Service
public class EntTemplateServiceImpl implements IEntTemplateService 
{
    @Autowired
    private EntTemplateMapper entTemplateMapper;

    /**
     * 查询模板添加
     * 
     * @param id 模板添加ID
     * @return 模板添加
     */
    @Override
    public EntTemplate selectEntTemplateById(Long id)
    {
        return entTemplateMapper.selectEntTemplateById(id);
    }

    /**
     * 查询模板添加列表
     * 
     * @param entTemplate 模板添加
     * @return 模板添加
     */
    @Override
    public List<EntTemplate> selectEntTemplateList(EntTemplate entTemplate)
    {
        return entTemplateMapper.selectEntTemplateList(entTemplate);
    }

    /**
     * 新增模板添加
     * 
     * @param entTemplate 模板添加
     * @return 结果
     */
    @Override
    public int insertEntTemplate(EntTemplate entTemplate)
    {
        return entTemplateMapper.insertEntTemplate(entTemplate);
    }

    /**
     * 修改模板添加
     * 
     * @param entTemplate 模板添加
     * @return 结果
     */
    @Override
    public int updateEntTemplate(EntTemplate entTemplate)
    {
        return entTemplateMapper.updateEntTemplate(entTemplate);
    }

    /**
     * 批量删除模板添加
     * 
     * @param ids 需要删除的模板添加ID
     * @return 结果
     */
    @Override
    public int deleteEntTemplateByIds(Long[] ids)
    {
        return entTemplateMapper.deleteEntTemplateByIds(ids);
    }

    /**
     * 删除模板添加信息
     * 
     * @param id 模板添加ID
     * @return 结果
     */
    @Override
    public int deleteEntTemplateById(Long id)
    {
        return entTemplateMapper.deleteEntTemplateById(id);
    }
}
