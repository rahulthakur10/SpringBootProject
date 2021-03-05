package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokExampleApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");

		Student s1 = new Student();
		s1.setFname("Rahul");
		s1.setLname("Thakur");
		s1.setId(123221L);
		s1.setPhone("942211334");
		System.out.println(s1);


	}
}
