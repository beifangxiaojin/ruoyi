package com.ruoyi.project.insurance.domain;

import lombok.Data;
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
@Data
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

    private String delStatus;

}
