package com.example.employeeapi.repos;

import com.example.employeeapi.entaties.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
}
