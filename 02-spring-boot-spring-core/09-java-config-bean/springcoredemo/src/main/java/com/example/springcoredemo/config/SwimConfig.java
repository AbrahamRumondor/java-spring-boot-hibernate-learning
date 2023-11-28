package com.example.springcoredemo.config;

import com.example.springcoredemo.common.Coach;
import com.example.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwimConfig {

//    @Bean
    @Bean("aquaticc") // use this if you wan to specify the bean id, or you can just use @Bean. it will set the bean id as your method name.
    public Coach swimCoach(){
        return new SwimCoach();
    }

}
