package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController("/")
public class HomeController {
    private  TennisCoach tennisCoach;
    public HomeController(TennisCoach theTennisCoach){
        tennisCoach = theTennisCoach;
    }
    @GetMapping
    public String getHome(){
        return  tennisCoach.getDailyFortune();
    }
    @GetMapping("/help")
    public String getHelp(){
        return  "This is help page";
    }
}
*/

@Controller

public class HomeController {
    @RequestMapping("/")
    public String showPage() {
        return "home";
    }
}