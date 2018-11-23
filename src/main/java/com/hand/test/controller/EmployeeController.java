package com.hand.test.controller;

import com.hand.test.dto.Employee;
import com.hand.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ Author: xin
 * @ Date: 2018/10/10 10:42
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employees",method = RequestMethod.POST)
    @ResponseBody
    public List<Employee> getAllEmplyees(){
        List<Employee> employees=employeeService.selectAll();
        return employees;
    }

    @RequestMapping(value = "/addOrUpdate",method = RequestMethod.POST)
    public String addEmployee(@RequestParam(value = "id",required = false) String id, Employee employee){
        if(id==null){
            employeeService.addEmployee(employee);
        }
        else{
            employeeService.updateEmployee(employee);
        }
        return "employee";
    }

    @RequestMapping(value = "/selectEmployee",method = RequestMethod.POST)
    @ResponseBody
    public Employee selectById(String id){
        Employee employee=employeeService.selectById(id);
        return employee;
    }

    @RequestMapping(value = "/deleteEmployee",method = RequestMethod.POST)
    public String deleteEmployee(String id){
        employeeService.deleteEmployee(id);
        return "employee";
    }
}
