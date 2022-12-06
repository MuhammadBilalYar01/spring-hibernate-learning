package com.example.springcrmrestdemo.entity;

public class Test {
    public static void main(String[] args){
        Student[] students=new Student[4];

        try {
            students[0] = new Student();
            students[1] = new Student("MC12123", "Muhammad Bilal", "MCS");
            students[2] = new Student("MC79546", "Muhammad WAQAR", "MCS");
            students[3] = new Student("BS12123", "Muhammad ASAD", "BSCS");

            // Error
            Student error= new Student("MC12123", "Muhammad Noor", "BSCS");
        }
        catch (Exception ex){
            System.out.println("=> ERROR: " +ex.getMessage());
        }
        System.out.println("\n============Display Students=============\n");
        for (int i = 0 ; i < 5 ; i++){
            try {
                Student student = students[i];
                student.PrintStudent();
            }catch (Exception ex){
                System.out.println("=> ERROR: " +ex.getMessage());
            }
        }
        System.out.println("Completed");
    }
}
