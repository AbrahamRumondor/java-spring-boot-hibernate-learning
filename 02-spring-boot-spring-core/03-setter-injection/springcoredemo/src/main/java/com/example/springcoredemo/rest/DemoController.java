package com.example.springcoredemo.rest;

import com.example.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//    define var to hold value
    Coach coach;

//    @Autowired
//    public DemoController(Coach coach) {
//        this.coach = coach;
//    }

//    define setter injection
    @Autowired
    public void setCoach(Coach theCoach){
        this.coach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getMapping(){
        return coach.getActivity();
    }
}
