package com.mydbcu.sis.controller;

import com.mydbcu.sis.student;
import com.mydbcu.sis.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "http://localhost:5500")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }

    @PostMapping
    public student addStudent(@RequestBody student student) {
        return studentRepository.save(student);
    }
}

