package com.example.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @PostConstruct
    public void getPostConstruct(){
        System.out.println("in constructor: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void getPreDestroy(){
        System.out.println("in constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getActivity() {
        return "Go play tennis with friend";
    }
}
