package com.example.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements Coach{


    @Override
    public String getActivity() {
        return "go play baseball";
    }
}
