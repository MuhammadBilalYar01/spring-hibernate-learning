package com.example.hb01onetooneuni.Controllers;

import com.example.hb01onetooneuni.Repos.InstructorRepo;
import com.example.hb01onetooneuni.entaties.Instructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/instructor")
public class InstructorController {
    private final InstructorRepo repo;

    public InstructorController(InstructorRepo repo) {
        this.repo = repo;
    }

    @GetMapping
    public Instructor getById(){
       return this.repo.findById(2l).orElse(null);
    }

    @GetMapping("/{id}")
    public Instructor getById(@PathVariable long id){
       return this.repo.findById(id).orElse(null);
    }
    @PostMapping
    public Instructor post(@RequestBody Instructor instructor){
       return this.repo.save(instructor);
    }
}
