package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{


    @Override
    public String getActivity() {
        return "go play baseball";
    }
}
