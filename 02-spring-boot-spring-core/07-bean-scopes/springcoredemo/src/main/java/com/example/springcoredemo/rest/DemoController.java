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
    Coach anotherCoach;

    @Autowired
    public DemoController(
            @Qualifier("tennisCoach") Coach coach,
            @Qualifier("tennisCoach") Coach otherCoach
    ) {
        this.coach = coach;
        this.anotherCoach = otherCoach;
    }


    @GetMapping("/dailyworkout")
    public String getMapping(){
        return coach.getActivity();
    }

    @GetMapping("/check")
    public String getCheck(){
        return "Comparing coach == anotherCoach: " + (coach == anotherCoach);
    }
}
