package com.example.hb01onetomany.Repos;

import com.example.hb01onetooneuni.entaties.Instructor;
import org.springframework.data.repository.CrudRepository;

public interface InstructorRepo extends CrudRepository<Instructor, Long> {
}
