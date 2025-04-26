package com.example.myfirstspring.repository;

import com.example.myfirstspring.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {
}