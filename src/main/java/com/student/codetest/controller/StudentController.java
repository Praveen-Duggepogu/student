package com.student.codetest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.codetest.entity.Student;
import com.student.codetest.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student createdStudent = studentService.createStudent(student);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }

    @PutMapping("/{id}/marks")
    public ResponseEntity<Student> updateStudentMarks(
            @PathVariable Long id,
            @RequestParam Integer marks1,
            @RequestParam Integer marks2,
            @RequestParam Integer marks3
    ) {
        Student updatedStudent = studentService.updateStudentMarks(id, marks1, marks2, marks3);
        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }
}

