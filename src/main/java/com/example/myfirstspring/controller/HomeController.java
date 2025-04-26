package com.example.myfirstspring.controller;

import com.example.myfirstspring.model.Course;
import com.example.myfirstspring.model.Student;
import com.example.myfirstspring.repository.CourseRepository;
import com.example.myfirstspring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public String showWelcomePage() {
        return "index"; // Display welcome page
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Show login form
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String name, @RequestParam String email, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        List<Course> courses = courseRepository.findAll();
        model.addAttribute("courses", courses);
        return "registration";
    }

    @PostMapping("/register")
    public String submitRegistration(@RequestParam String name,
                                     @RequestParam String registerNumber,
                                     @RequestParam String programme,
                                     @RequestParam String selectedCourse,
                                     @RequestParam String email,
                                     Model model) {

        // Use the new constructor with all five parameters
        Student student = new Student(name, email, registerNumber, programme, selectedCourse);
        studentRepository.save(student);

        model.addAttribute("student", student);
        return "confirmation";
    }
}
