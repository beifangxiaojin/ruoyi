package com.ruoyi.project.insurance.employee.service;

import com.ruoyi.project.insurance.domain.EntTemplate;

import java.util.List;

public interface EmAndTemService {
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
