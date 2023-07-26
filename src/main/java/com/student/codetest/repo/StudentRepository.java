package com.student.codetest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.student.codetest.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	


}
