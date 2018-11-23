package com.hand.test.service.impl;

import com.hand.test.dto.Department;
import com.hand.test.dto.Employee;
import com.hand.test.mapper.DepartmentMapper;
import com.hand.test.mapper.EmployeeMapper;
import com.hand.test.service.DepartmentService;
import com.hand.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author: xin
 * @ Date: 2018/10/10 10:29
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> selectAll() {
        return departmentMapper.selectAll();
    }

}
