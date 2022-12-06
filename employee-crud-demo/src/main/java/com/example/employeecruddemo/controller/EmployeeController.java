package com.example.employeecruddemo.controller;

import com.example.employeecruddemo.entaties.Employee;
import com.example.employeecruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private EmployeeService service;

    public EmployeeController(EmployeeService emp) {
        this.service = emp;
    }

    @GetMapping("employees")
    public List<Employee> get(){
     return    this.service.findAll();
    }

    @PostMapping("employees")
    public Employee post(@RequestBody Employee employee){
        employee.setId(0);

        service.save(employee);

        return  employee;
    }
    @GetMapping("employees/{employeeId}")
    public Employee getById(@PathVariable int employeeId){
        Employee employee = this.service.findById(employeeId);
        if(null ==employee)
            throw  new RuntimeException("Employee id not found" + employeeId);

        return  employee;
    }

    @PutMapping("employees")
    public Employee updateById(@RequestBody Employee employee){
       this.service.save(employee);

        return  employee;
    }

    @DeleteMapping("employees/{employeeId}")
    public String deleteById(@PathVariable int employeeId){
        Employee employee = this.service.findById(employeeId);
        if(null ==employee)
            throw  new RuntimeException("Employee id not found" + employeeId);

        this.service.deleteById(employeeId);
        return "Employee delete with id "+ employeeId;
    }
}
