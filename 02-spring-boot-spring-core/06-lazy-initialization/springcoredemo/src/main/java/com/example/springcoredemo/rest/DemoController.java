package com.example.springcoredemo.rest;

import com.example.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//    define var to hold value
    Coach coach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach) {
        System.out.println("in constructor: " + getClass().getSimpleName());

        this.coach = coach;
    }


    @GetMapping("/dailyworkout")
    public String getMapping(){
        return coach.getActivity();
    }
}
