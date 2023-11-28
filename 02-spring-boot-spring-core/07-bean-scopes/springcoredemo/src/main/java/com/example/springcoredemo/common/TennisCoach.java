package com.example.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) --> by default bean scope is singleton, so turn this on for new object for every initiation.
public class TennisCoach implements Coach{
    @Override
    public String getActivity() {
        return "Go play tennis with friend";
    }
}
