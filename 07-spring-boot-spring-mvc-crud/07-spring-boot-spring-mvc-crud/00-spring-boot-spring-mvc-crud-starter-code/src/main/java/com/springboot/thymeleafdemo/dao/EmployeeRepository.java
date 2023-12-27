package com.luv2code.springboot.thymeleafdemo.dao;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

    // add a method to sort by last name
    public List<Employee> findAllByOrderByLastNameAsc();
    /* ABOUT THIS FUNCTION
    * findAllBy is a default syntax provided by jpa to get all
    * then we can also add additional command such as
    * "OrderByLastNameAsc"
    * this command will act similarly to "From Employee order by lastName asc"
    * */
}
