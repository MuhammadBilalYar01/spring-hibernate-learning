package com.example.springcrmrestdemo.entity;

public class Student {
    private  String id;

    private String fullName;

    private String program;

    public Student(){
        id = "MC210200052";
        fullName = "Um e Habiba";
        program = "MCS";
    }
    public Student(String i, String name, String p) throws Exception {

        if(i.substring(0,2).equals(p.substring(0, 2)))
            id = i;
        else
            throw new Exception("Your program does not match your student Id");
        fullName = name;
        program = p;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        fullName = fullName;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        program = program;
    }

    public void PrintStudent() {
        System.out.println("Id: "+getId()+", Full Name: "+getFullName()+", Program: "+getProgram());
    }
}