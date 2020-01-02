package com.ruoyi.project.insurance.employee.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.Data;

import java.util.Date;
@Data
public class Template extends BaseEntity {
    private static final long serialVersionUID = 1L;
    /**
     * 保险id
     */
    private Long Id;
    /**
     * 保险模板编号
     */
    @Excel(name = "保险组编号",cellType = Excel.ColumnType.NUMERIC)
    private Long serialNumber;
    /**
     * 保险组名称
     */
    @Excel(name = "保险组名称")
    private String pageName;
    @Excel(name = "保险组详情")
    private String templateCombination;
    @Excel(name = "创建人")
    private String creator;
    @Excel(name = "创建时间")
    private Date creattonTime;
    @Excel(name = "备注")
    private String remark;
    /**
     * 人员组
     */
    private Long[] employeeId;
}
