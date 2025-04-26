package com.example.myfirstspring;

import com.example.myfirstspring.model.Course;
import com.example.myfirstspring.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyfirstspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstspringApplication.class, args);
	}

	// This will insert initial course data when the app starts
	@Bean
	CommandLineRunner initCourses(CourseRepository courseRepository) {
		return args -> {
			if (courseRepository.count() == 0) { // Only insert if collection is empty
				courseRepository.save(new Course(null, "C", "Introduction to C programming", null));
				courseRepository.save(new Course(null, "C++", "Object-oriented programming with C++", null));
				courseRepository.save(new Course(null, "Python", "Beginner to advanced Python programming", null));
				courseRepository.save(new Course(null, "Java", "Comprehensive Java development course", null));
				System.out.println("✅ Courses inserted into MongoDB!");
			} else {
				System.out.println("ℹ️ Courses already exist in the database.");
			}
		};
	}
}
