package com.springstudent.cruddemo.dao;

import com.springstudent.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOimpl implements StudentDAO {

//    define field for entity manager
    EntityManager entityManager;

//    inject entity manager using constructor injection

    @Autowired
    public StudentDAOimpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //    implement save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {

//       query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName desc", Student.class);

//      return result
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName) {

//        set query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);

//        set param
        theQuery.setParameter("theData", theLastName);

//        return result
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {

//        get student
        Student theStudent = entityManager.find(Student.class, id);

//        delete student from database
        entityManager.remove(theStudent);
    }

    @Override
    @Transactional
    public int deleteAll() {
//        define the logic
        int deleteAllStudentCount = entityManager.createQuery("DELETE FROM Student").executeUpdate();

//        return deleted row count
        return deleteAllStudentCount;
    }
}