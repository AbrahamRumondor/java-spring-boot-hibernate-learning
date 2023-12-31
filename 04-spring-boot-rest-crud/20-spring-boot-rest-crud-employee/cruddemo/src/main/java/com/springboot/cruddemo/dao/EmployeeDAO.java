package com.springboot.cruddemo.dao;

import com.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(Integer theId);
    Employee save(Employee theEmployee);
    void deleteById(Integer theId);
}
