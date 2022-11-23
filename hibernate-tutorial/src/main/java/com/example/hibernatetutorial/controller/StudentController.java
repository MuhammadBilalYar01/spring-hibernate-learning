package com.example.hibernatetutorial.controller;

import com.example.hibernatetutorial.entaties.Student;
import com.example.hibernatetutorial.repos.StudentRepo;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentRepo repo;

    public StudentController(StudentRepo repo) {
        this.repo = repo;
    }

    @RequestMapping(value="", method={RequestMethod.POST})
    public Student post(@RequestBody Student student, Model model){
      return repo.save(student);
    }
}
