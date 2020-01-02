package com.ruoyi.project.insurance.employee.service.impl;

import com.ruoyi.project.insurance.domain.EntTemplate;
import com.ruoyi.project.insurance.employee.mapper.EmAndTemMapper;
import com.ruoyi.project.insurance.employee.service.EmAndTemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmAndTemServiceImpl implements EmAndTemService {
    @Autowired
    private EmAndTemMapper emAndTemMapper;

    @Override
    public int coutEmAndTem(Long employeeId) {
        return emAndTemMapper.coutEmAndTem(employeeId);
    }

    @Override
    public int batchEmAndTem(List<EntTemplate> EmAnTem) {
        return emAndTemMapper.batchEmAndTem(EmAnTem);
    }
}
