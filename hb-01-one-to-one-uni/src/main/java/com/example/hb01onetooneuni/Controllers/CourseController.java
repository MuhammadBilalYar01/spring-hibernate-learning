package com.example.hb01onetooneuni.Controllers;

import com.example.hb01onetooneuni.Repos.CourseRepo;
import com.example.hb01onetooneuni.Repos.InstructorRepo;
import com.example.hb01onetooneuni.entaties.Course;
import com.example.hb01onetooneuni.entaties.Instructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {
    private final CourseRepo repo;
    private final InstructorRepo instructorRepo;

    public CourseController(CourseRepo repo,InstructorRepo iRepo) {
        this.repo = repo;
        this.instructorRepo=iRepo;
    }
    @PostMapping
    public Course post(@RequestBody Course course, long instructorId){
       Instructor obj= this.instructorRepo.findById(instructorId).orElse(null);
       if(obj==null)
           return new Course();
       course.setInstructor(obj);
        Course data= this.repo.save(course);
        return data;
    }
}
