package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getActivity() {
        return "go run 5k";
    }
}
