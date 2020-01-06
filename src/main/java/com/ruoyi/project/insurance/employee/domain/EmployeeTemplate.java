package com.ruoyi.project.insurance.employee.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.project.insurance.domain.EntTemplate;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
public class EmployeeTemplate extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @Excel(name = "编号")
    private Long Id;
    @Excel(name = "姓名")
    private String empName;
    @Excel(name = "性别")
    private String sex;
    @Excel(name = "出生日期")
    private Date empBirthday;
    @Excel(name = "身份证号")
    @Size(max = 18,min = 0,message = "身份证号码最多11位")
    private String cardNumber;
    @Excel(name = "电话号码")
    @Size(max = 11,min = 0,message = "手机号最多11位")
    private String phoneNumber;
    @Excel(name = "住址")
    private String empAddress;
    @Excel(name = "岗位")
    private String empPost;
    @Excel(name = "缴费状态",readConverterExp = "0=已缴费,1=未缴费")
    private String payStatus;
    private List<EntTemplate> templateList;
}
