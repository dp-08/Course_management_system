package com.example.myfirstspring.controller;

import com.example.myfirstspring.model.Student;
import com.example.myfirstspring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class RestStudentController {

    @Autowired
    private StudentRepository studentRepository;

    // CREATE - Add a new student
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    // READ ALL - Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // READ BY ID - Get a student by ID
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable String id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // UPDATE - Update a student by ID
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable String id, @RequestBody Student updatedStudent) {
        return studentRepository.findById(id)
                .map(existingStudent -> {
                    // Update fields
                    existingStudent.setName(updatedStudent.getName());
                    existingStudent.setEmail(updatedStudent.getEmail());
                    existingStudent.setRegisterNumber(updatedStudent.getRegisterNumber());
                    existingStudent.setProgramme(updatedStudent.getProgramme());
                    existingStudent.setSelectedCourse(updatedStudent.getSelectedCourse());
                    studentRepository.save(existingStudent);
                    return ResponseEntity.ok(existingStudent);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // DELETE - Delete a student by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable String id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
