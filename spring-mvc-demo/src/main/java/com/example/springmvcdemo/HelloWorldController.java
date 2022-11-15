package com.example.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloWorld-form";
    }
    @RequestMapping("processForm")
    public String processForm(String studentName, Model theModel){
        theModel.addAttribute("message","Student Name is : "+studentName);
        return "helloWorld";
    }
}
