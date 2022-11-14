package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Autowired
    private FortuneService fortuneService;
    /* Not required
    @Autowired
    public TennisCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }*/
    /*
    @Autowired
    public void setFortuneService(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "getDailyWorkout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
