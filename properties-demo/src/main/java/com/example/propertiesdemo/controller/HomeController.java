package com.example.propertiesdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
    @GetMapping("/")
    public String get(){
        return "Welcome to spring";
    }

    @GetMapping("/properties")
    public String properties(){
        return "Coach Name : " + coachName + ", Team Name: " + teamName;
    }
}
