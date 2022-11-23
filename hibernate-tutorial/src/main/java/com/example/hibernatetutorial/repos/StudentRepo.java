package com.example.hibernatetutorial.repos;

import com.example.hibernatetutorial.entaties.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
}
