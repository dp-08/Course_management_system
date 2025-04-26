package com.example.myfirstspring.repository;

import com.example.myfirstspring.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}