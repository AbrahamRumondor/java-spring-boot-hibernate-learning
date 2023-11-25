package com.springboot.overview.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${pengguna.name}")
    private String user;

    @Value("${hobby.name}")
    private String hobby;

    @GetMapping("/user")
    public String getUser(){
        return "User: " + user + "Hobby: " + hobby;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }

//    @GetMapping("/fortune")
//    public String getDailyFortune(){
//        return "Today is your lucky day";
//    }


}
