package com.ruoyi.project.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 企业雇员管理对象 ent_employee
 *
 * @author ruoyi
 * @date 2019-12-24
 */
public class EntEmployee extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 雇员编号 */
    private Long id;

    /** 雇员名称 */
    @Excel(name = "雇员名称")
    private String empName;

    /** 雇员性别 */
    @Excel(name = "雇员性别")
    private String sex;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date empBrithday;

    /** 身份证号码 */
    @Excel(name = "身份证号码")
    private String cardNumber;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phoneNumber;

    /** 住址 */
    @Excel(name = "住址")
    private String empAddress;

    /** 岗位 */
    @Excel(name = "岗位")
    private String empPost;

    /** 缴费状态 */
    @Excel(name = "缴费状态")
    private Long payStatus;


   public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    public String getEmpName()
    {
        return empName;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }
    public void setEmpBrithday(Date empBrithday)
    {
        this.empBrithday = empBrithday;
    }

    public Date getEmpBrithday()
    {
        return empBrithday;
    }
    public void setCardNumber(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber()
    {
        return cardNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setEmpAddress(String empAddress)
    {
        this.empAddress = empAddress;
    }

    public String getEmpAddress()
    {
        return empAddress;
    }
    public void setEmpPost(String empPost)
    {
        this.empPost = empPost;
    }

    public String getEmpPost()
    {
        return empPost;
    }
    public void setPayStatus(Long payStatus)
    {
        this.payStatus = payStatus;
    }

    public Long getPayStatus()
    {
        return payStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("empName", getEmpName())
            .append("sex", getSex())
            .append("empBrithday", getEmpBrithday())
            .append("cardNumber", getCardNumber())
            .append("phoneNumber", getPhoneNumber())
            .append("empAddress", getEmpAddress())
            .append("empPost", getEmpPost())
            .append("payStatus", getPayStatus())
            .toString();
    }
}
