package com.example.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach{
    public CricketCoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());

    }

    @Override
    public String getActivity() {
        return "Go run and take the ball PLSSS";
    }
}
