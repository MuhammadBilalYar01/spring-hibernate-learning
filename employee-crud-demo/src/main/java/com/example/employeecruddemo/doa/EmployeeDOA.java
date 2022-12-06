package com.example.employeecruddemo.doa;

import com.example.employeecruddemo.entaties.Employee;

import java.util.List;

public interface EmployeeDOA {
    public List<Employee> findAll();
    public Employee findById(int id);
    public  void save(Employee employee);
    public void deleteById(int id);
}
