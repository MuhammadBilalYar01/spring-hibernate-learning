package com.example.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloWorld-form";
    }
    @RequestMapping("processForm")
    public String processForm(@RequestParam("studentName") String theStudent, Model theModel){
        theModel.addAttribute("message","Student Name is : "+theStudent.toUpperCase());
        return "helloWorld";
    }
}
