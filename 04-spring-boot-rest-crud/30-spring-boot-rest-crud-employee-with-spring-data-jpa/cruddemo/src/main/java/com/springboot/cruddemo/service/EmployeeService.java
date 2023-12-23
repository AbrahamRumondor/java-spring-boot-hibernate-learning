package com.springboot.cruddemo.service;

import com.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(Integer theId);
    Employee save(Employee theEmployee);
    void deleteById(Integer theId);
}
