package com.example.myfirstspring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "courses")
public class Course {

    @Id
    private String id;
    private String name;
    private String description;
    private List<String> students; // Optional: list of student IDs or names

    // No-args constructor (required by Spring Data)
    public Course() {
    }

    // All-args constructor (used in CommandLineRunner)
    public Course(String id, String name, String description, List<String> students) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.students = students;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    // Optional: toString method for debugging
    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", students=" + students +
                '}';
    }
}
