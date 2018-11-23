package com.hand.test.controller;

import com.hand.test.dto.Department;
import com.hand.test.dto.Employee;
import com.hand.test.service.DepartmentService;
import com.hand.test.service.EmployeeService;
import com.mysql.jdbc.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @ Author: xin
 * @ Date: 2018/10/10 10:42
 */
@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/departments",method = RequestMethod.POST)
    @ResponseBody
    public List<Department> getAllDepartment() throws SQLException {
        List<Department> departments=departmentService.selectAll();
        return departments;
    }

}
