package com.springboot.cruddemo.dao;

import com.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


//repository dipakai untuk membantu kalau kita pakai JPA
//dia juga sedia misal @Transaction untuk membuat operasi database konsisten dan terintegrasi
//intinya dia punya banyak fungsi yang bantu hal-hal terkait koneksi java-database
@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

//    define entity manager
//    bawaan dari JPA.
    EntityManager entityManager;

    //    define constructor
//    autowired untuk dependency injection
//    jadi spring bakal langsung buatkan implementasinya,
//    kita ga perlu pusing pusing pikir implementasinya (kyk buat new new lagi)
//    kecuali klo emg kita ada lempar obj khusus ke paramnya.
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = entityManager.createQuery(
                "from Employee", Employee.class
        );
        List<Employee> employees = theQuery.getResultList();
        return employees;
    }

    @Override
    public Employee findById(Integer theId) {
        Employee employee = entityManager.find(Employee.class, theId);
        return employee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        Employee employee = entityManager.merge(theEmployee);
        return employee;
    }

    @Override
    public void deleteById(Integer theId) {
        Employee employee = entityManager.find(Employee.class, theId);
        entityManager.remove(employee);
    }
}
