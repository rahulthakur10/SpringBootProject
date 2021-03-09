package com.student.test.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.test.Entities.Student;
import com.student.test.Repositories.StudentRepository;
import com.student.test.exception.ResourceNotFoundException;
import com.student.test.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	//private StudentRepository studentRepository ;
	private StudentService studentservice ;
	
	@RequestMapping("/student")
	public String home() {
	
		return " Welcome to Student Portal ";
	}
	
	//GET LIST OF STUDENTS
	
	@GetMapping("/getAllstudents")
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return this.studentservice.getStudents();
	}
	
	//GET SINGLE STUDENT
	
		@GetMapping("/getstudentById/{studentid}")
		public Optional<Student> getOneStudent1(@PathVariable("studentid") Long studentid) {
			// TODO Auto-generated method stub
			return Optional.of(this.studentservice.getOneStudent1(studentid)
					.orElseThrow(()-> new ResourceNotFoundException(" Student Details Not found with id : " +studentid)));
					
		}
		
		
		@GetMapping("/getstudentByName/{sname}")
		public List<Student> getStudentName(@PathVariable("sname") String fname) {
			return (List<Student>) this.studentservice.getStudentName(fname);
			
		}
		
	//ADD STUDENT
	
	@PostMapping("/studentsave")
	public Student addStudent(@RequestBody Student student) {
		// TODO Auto-generated method stub
		return this.studentservice.addStudent(student);
	}
	
	@PostMapping("/multistudentsave")
	public List<Student> addmultiStudent(@RequestBody List<Student> student) {
		return this.studentservice.addmultiStudent(student);
	}
	
	//UPDATE STUDENT INFO
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		// TODO Auto-generated method stub
			return this.studentservice.updateStudent(student) ;
	}
	

	//DELETE THE STUDENT
	
	@DeleteMapping("/students/{stu_id}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String studentId){
		try 
		{
		this.studentservice.deleteStudent(Long.parseLong(studentId));
		return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		// TODO Auto-generated method stub
		
}
//	
}
