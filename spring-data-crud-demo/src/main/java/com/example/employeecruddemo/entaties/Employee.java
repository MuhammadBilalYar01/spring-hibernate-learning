package com.example.employeecruddemo.entaties;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;

    public Employee(){}

    public Employee(String first_Name, String last_Name, String email) {
        this.firstName = first_Name;
        this.lastName = last_Name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_Name() {
        return firstName;
    }

    public void setFirst_Name(String first_Name) {
        this.firstName = first_Name;
    }

    public String getLast_Name() {
        return lastName;
    }

    public void setLast_Name(String last_Name) {
        this.lastName = last_Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_Name='" + firstName + '\'' +
                ", last_Name='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
