package com.hand.test.service.impl;

import com.hand.test.dto.Employee;
import com.hand.test.mapper.EmployeeMapper;
import com.hand.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author: xin
 * @ Date: 2018/10/10 10:29
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> selectAll() {
        return employeeMapper.selectAll();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeMapper.addEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

    @Override
    public Employee selectById(String id) {
        return employeeMapper.selectById(id);
    }

    @Override
    public void deleteEmployee(String id) {
        employeeMapper.deleteEmployee(id);
    }
}
