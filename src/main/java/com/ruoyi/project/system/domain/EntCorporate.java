package com.ruoyi.project.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 企业公司管理对象 ent_corporate
 * 
 * @author ruoyi
 * @date 2019-12-24
 */
public class EntCorporate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 企业编号 */
    private Long id;

    /** 企业名称 */
    @Excel(name = "企业名称")
    private String corporateName;

    /** 地址 */
    @Excel(name = "地址")
    private String site;

    /** 开户状态 */
    @Excel(name = "开户状态")
    private Long openAnAccountStatus;

    /** 开户时间 */
    @Excel(name = "开户时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date openAnAccountTime;

    /** 创建人 */
    @Excel(name = "创建人")
    private String founder;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCorporateName(String corporateName) 
    {
        this.corporateName = corporateName;
    }

    public String getCorporateName() 
    {
        return corporateName;
    }
    public void setSite(String site) 
    {
        this.site = site;
    }

    public String getSite() 
    {
        return site;
    }
    public void setOpenAnAccountStatus(Long openAnAccountStatus) 
    {
        this.openAnAccountStatus = openAnAccountStatus;
    }

    public Long getOpenAnAccountStatus() 
    {
        return openAnAccountStatus;
    }
    public void setOpenAnAccountTime(Date openAnAccountTime) 
    {
        this.openAnAccountTime = openAnAccountTime;
    }

    public Date getOpenAnAccountTime() 
    {
        return openAnAccountTime;
    }
    public void setFounder(String founder) 
    {
        this.founder = founder;
    }

    public String getFounder() 
    {
        return founder;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("corporateName", getCorporateName())
            .append("site", getSite())
            .append("openAnAccountStatus", getOpenAnAccountStatus())
            .append("openAnAccountTime", getOpenAnAccountTime())
            .append("founder", getFounder())
            .append("remark", getRemark())
            .toString();
    }
}
