package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getActivity() {
        return "Go run and take the ball PLSSS";
    }
}
