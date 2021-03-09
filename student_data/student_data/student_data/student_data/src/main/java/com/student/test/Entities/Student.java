package com.student.test.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_info")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long stu_id ; 
	private String fname ; 
	private String lname ; 
	private String stream ;
	
	
	public Student(Long stu_id, String fname, String lname, String stream) {
		super();
		this.stu_id = stu_id;
		this.fname = fname;
		this.lname = lname;
		this.stream = stream;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getStu_id() {
		return stu_id;
	}
	public void setStu_id(Long stu_id) {
		this.stu_id = stu_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", fname=" + fname + ", lname=" + lname + ", stream=" + stream + "]";
	} 
	
	
	
	
}
