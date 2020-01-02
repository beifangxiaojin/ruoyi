package com.ruoyi.project.insurance.employee.mapper;

import com.ruoyi.project.insurance.domain.EntTemplate;
import org.hibernate.validator.constraints.Currency;

import java.util.List;

public interface EmAndTemMapper {
    /**
     * 通过员工ID查询保险模板数量
     * @param employeeId
     * @return
     */
    int coutEmAndTem(Long employeeId);

    /**
     * 批量新增员工保险信息
     * @param EmAnTem
     * @return
     */
    int batchEmAndTem(List<EntTemplate> EmAnTem);
}
