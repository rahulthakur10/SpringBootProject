package com.student.test.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.test.Entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	
	public List<Student> findByfname(String sname);
	
}
