package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getActivity() {
        return "Go play tennis with friend";
    }
}
