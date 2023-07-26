package com.student.codetest.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.codetest.entity.Student;
import com.student.codetest.repo.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student updateStudentMarks(Long id, Integer marks1, Integer marks2, Integer marks3) {

		Optional<Student> optionalStudent = studentRepository.findById(id);
		if (optionalStudent.isPresent()) {

			Student student = optionalStudent.get();

			student.setMarks1(marks1);
			student.setMarks2(marks2);
			student.setMarks3(marks3);

			return studentRepository.save(student);
		} else {
			throw new IllegalArgumentException("Student not found with ID: " + id);
		}
	}
}





