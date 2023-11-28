package com.example.springcoredemo.common;

public class SwimCoach implements Coach {
    //    this class will act as a third party class,
    //      so we didnt put the @Component on purpose


    public SwimCoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getActivity() {
        return "Swim through the sea";
    }



}
