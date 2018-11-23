package com.hand.test.service;

import com.hand.test.dto.Employee;
import org.w3c.dom.ls.LSException;

import java.util.List;

/**
 * @ Author: xin
 * @ Date: 2018/10/10 10:29
 */
public interface EmployeeService {
    // List
    List<Employee> selectAll();

    // add
    void addEmployee(Employee employee);

    // update
    void updateEmployee(Employee employee);

    //select
    Employee selectById(String id);

    // delete
    void deleteEmployee(String id);
}
