package com.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

//    controller method to show initial form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

//    controller method to process html form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
//        read the request param from HTML
        String theName = request.getParameter("studentName");

//        convert the data to all caps
        theName = theName.toUpperCase();

//        create a message
        String result = "Yo! " + theName;

//        add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){
//        convert the data to all caps
        theName = theName.toUpperCase();

//        create a message
        String result = "Yo! " + theName;

//        add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

}
