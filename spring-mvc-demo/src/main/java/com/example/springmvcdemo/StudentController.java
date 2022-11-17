package com.example.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.font.AttributeMap;

@Controller
@RequestMapping("student")
public class StudentController {


    @RequestMapping("/showForm")
    public String showForm(Model model)
    {
        model.addAttribute("student", new Student());
        return "show-student-form";
    }

    @RequestMapping(value = "/confirmation", method = {RequestMethod.POST})
    public String showConfirmation(@ModelAttribute Student student, Model model)
    {
        model.addAttribute("student", student);
        return "show-confirmation";
    }
}
