package com.student.test.services;


import java.util.List;
import java.util.Optional;


import com.student.test.Entities.Student;

public interface StudentService {

public List<Student>getStudents();
	
	public Optional<Student> getOneStudent1(long studentId);
	
	public List<Student> getStudentName(String sname);
	
	public Student addStudent(Student student);
	
	public List<Student> addmultiStudent(List<Student> student);
	
	public Student updateStudent(Student student);
}
