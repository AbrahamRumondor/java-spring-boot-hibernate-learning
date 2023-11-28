package com.example.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getActivity() {
        return "go run 5k";
    }
}
