package com.restcontroller.demo.rest;

import com.restcontroller.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    ArrayList<Student> students;

    @PostConstruct
    public void loadData(){
        students = new ArrayList<>();

        students.add(new Student("Rai","Ron"));
        students.add(new Student("Ren","Di"));
        students.add(new Student("Dan","El"));
    }

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId){

//        student idx doesnt exist exception
        if(studentId < 0 || studentId >= students.size())
            throw new StudentNotFoundException("hi, sorry, we couldnt find student with the id of " + studentId);

        return students.get(studentId);
    }

}
