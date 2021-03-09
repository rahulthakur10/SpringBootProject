package com.student.test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.student.test.Entities.Student;
import com.student.test.Repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository ;
	
	
	public StudentServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//FETCH STUDENTS
	
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	
	@Override
	public Optional<Student> getOneStudent1(@PathVariable long studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId);
	}
	
	
	public List<Student> getStudentName(String sname) {
		// TODO Auto-generated method stub
		return (List<Student>) studentRepository.findByfname(sname);
	}
	
	
	//ADD STUDENTS
	
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		return student; 
	}
	
	public List<Student> addmultiStudent(List<Student> student) {
		// TODO Auto-generated method stub
		studentRepository.saveAll(student);
		return  student; 
	}
	
	
	
	
	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student) ;
		return student;
	}
	
	@Override
	public void deleteStudent(long studentId) {
		// TODO Auto-generated method stub
		Student s1 = studentRepository.getOne(studentId);
		studentRepository.delete(s1);
		
	}
		


}
