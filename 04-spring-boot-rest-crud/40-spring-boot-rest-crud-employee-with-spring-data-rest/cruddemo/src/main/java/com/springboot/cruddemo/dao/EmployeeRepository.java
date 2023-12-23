package com.springboot.cruddemo.dao;

import com.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

//@RepositoryRestResource(path = "members") --> change from /employees to /members
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
