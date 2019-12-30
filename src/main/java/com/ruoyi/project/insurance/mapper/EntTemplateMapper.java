package com.ruoyi.project.insurance.mapper;

import com.ruoyi.project.insurance.domain.EntTemplate;
import java.util.List;

/**
 * 模板添加Mapper接口
 * 
 * @author ruoyi
 * @date 2019-12-25
 */
public interface EntTemplateMapper 
{
    /**
     * 查询模板添加
     * 
     * @param id 模板添加ID
     * @return 模板添加
     */
    public EntTemplate selectEntTemplateById(Long id);

    /**
     * 查询模板添加列表
     * 
     * @param entTemplate 模板添加
     * @return 模板添加集合
     */
    public List<EntTemplate> selectEntTemplateList(EntTemplate entTemplate);

    /**
     * 新增模板添加
     * 
     * @param entTemplate 模板添加
     * @return 结果
     */
    public int insertEntTemplate(EntTemplate entTemplate);

    /**
     * 修改模板添加
     * 
     * @param entTemplate 模板添加
     * @return 结果
     */
    public int updateEntTemplate(EntTemplate entTemplate);

    /**
     * 删除模板添加
     * 
     * @param id 模板添加ID
     * @return 结果
     */
    public int deleteEntTemplateById(Long id);

    /**
     * 批量删除模板添加
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteEntTemplateByIds(Long[] ids);
}
