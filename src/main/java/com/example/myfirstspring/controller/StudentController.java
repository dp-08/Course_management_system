package com.example.myfirstspring.controller;

import com.example.myfirstspring.model.Student;
import com.example.myfirstspring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/submitRegistration")
    public String submitRegistration(
            @RequestParam("name") String name,
            @RequestParam("registerNumber") String registerNumber,
            @RequestParam("program") String program,
            @RequestParam("selectedCourse") String selectedCourse,
            @RequestParam("email") String email,
            Model model
    ) {
        // Create a new student using setters
        Student student = new Student();
        student.setName(name);
        student.setRegisterNumber(registerNumber);
        student.setProgramme("Some value");

        student.setSelectedCourse(selectedCourse);
        student.setEmail(email);

        // Save the student to MongoDB
        studentRepository.save(student);

        // Add student details to the model to show in confirmation.jsp
        model.addAttribute("student", student);

        return "confirmation";
    }
}
