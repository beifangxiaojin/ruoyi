package com.ruoyi.project.insurance.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 模板添加对象 ent_template
 * 
 * @author ruoyi
 * @date 2019-12-25
 */
public class EntTemplate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 模板编号 */
    @Excel(name = "模板编号")
    private Long serialNumber;

    /** 模板名称 */
    @Excel(name = "模板名称")
    private String pagename;

    /** 保险组合 */
    @Excel(name = "保险组合")
    private String templateCombination;

    /** 创建者 */
    @Excel(name = "创建者")
    private String creator;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creationTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSerialNumber(Long serialNumber) 
    {
        this.serialNumber = serialNumber;
    }

    public Long getSerialNumber() 
    {
        return serialNumber;
    }
    public void setPagename(String pagename) 
    {
        this.pagename = pagename;
    }

    public String getPagename() 
    {
        return pagename;
    }
    public void setTemplateCombination(String templateCombination) 
    {
        this.templateCombination = templateCombination;
    }

    public String getTemplateCombination() 
    {
        return templateCombination;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }
    public void setCreationTime(Date creationTime) 
    {
        this.creationTime = creationTime;
    }

    public Date getCreationTime() 
    {
        return creationTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("serialNumber", getSerialNumber())
            .append("pagename", getPagename())
            .append("templateCombination", getTemplateCombination())
            .append("creator", getCreator())
            .append("creationTime", getCreationTime())
            .append("remark", getRemark())
            .toString();
    }
}
