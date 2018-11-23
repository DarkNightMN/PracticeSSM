package com.hand.test.dto;

import java.io.Serializable;

/**
 * @ Author: xin
 * @ Date: 2018/10/10 10:14
 */
public class Employee implements Serializable {
    private String id;
    private String name;
    private String age;
    private Double salary;
    private Department department;

    public Employee() {
    }

    public Employee(String id,String name){
        this.id=id;
        this.name=name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
