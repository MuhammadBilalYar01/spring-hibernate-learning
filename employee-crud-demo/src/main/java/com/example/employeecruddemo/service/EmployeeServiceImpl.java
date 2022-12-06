package com.example.employeecruddemo.service;

import com.example.employeecruddemo.doa.EmployeeDOA;
import com.example.employeecruddemo.entaties.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    private EmployeeDOA employeeDOA;

    public EmployeeServiceImpl(EmployeeDOA employeeDOA) {
        this.employeeDOA = employeeDOA;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDOA.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int id) {
        return employeeDOA.findById(id);
    }

    @Override
    @Transactional
    public void save(Employee employee) {
     employeeDOA.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        employeeDOA.deleteById(id);
    }
}
