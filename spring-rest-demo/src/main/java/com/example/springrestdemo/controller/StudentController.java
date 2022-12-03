package com.example.springrestdemo.controller;

import com.example.springrestdemo.entaties.Student;
import com.example.springrestdemo.exceptions.StudentErrorResponse;
import com.example.springrestdemo.exceptions.StudentNotFoundException;
import org.hibernate.annotations.Parameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/")
public class StudentController {

    private List<Student> myStudent;
    @PostConstruct
    public  void  loadData(){
        myStudent=new ArrayList<Student>();
        myStudent.add(new Student("Muhammad","Ali"));
        myStudent.add(new Student("Muhammad","Waqar"));
        myStudent.add(new Student("Muhammad","Asad"));
    }
    @GetMapping("students")
    public List<Student> getStudents(){
        return myStudent;
    }

    @GetMapping("student/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        if(studentId>=myStudent.size()||studentId<0 ){
            throw new StudentNotFoundException("Student id not found - "+studentId);
        }
        return myStudent.get(studentId);
    }
}
