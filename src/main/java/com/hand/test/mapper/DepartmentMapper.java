package com.hand.test.mapper;

import com.hand.test.dto.Department;
import com.hand.test.dto.Employee;

import java.util.List;

/**
 * @ Author: xin
 * @ Date: 2018/10/10 10:31
 */
public interface DepartmentMapper {
    // List
    List<Department> selectAll();

}
