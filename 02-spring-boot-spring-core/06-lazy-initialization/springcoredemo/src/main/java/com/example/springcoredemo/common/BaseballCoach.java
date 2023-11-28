package com.example.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseballCoach implements Coach{
    public BaseballCoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());

    }

    @Override
    public String getActivity() {
        return "go play baseball";
    }
}
