package com.hand.test.mapper;

import com.hand.test.dto.Employee;

import java.util.List;

/**
 * @ Author: xin
 * @ Date: 2018/10/10 10:31
 */
public interface EmployeeMapper {
    // list
    List<Employee> selectAll();

    // add
    void addEmployee(Employee employee);

    // update
    void updateEmployee(Employee employee);

    // select
    Employee selectById(String id);

    // delete
    void deleteEmployee(String id);
}
