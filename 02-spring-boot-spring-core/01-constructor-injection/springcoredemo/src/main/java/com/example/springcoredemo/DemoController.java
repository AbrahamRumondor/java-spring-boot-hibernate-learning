package com.example.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//    define var to hold value
    Coach coach;

    @Autowired
    public DemoController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getMapping(){
        return coach.getActivity();
    }
}
