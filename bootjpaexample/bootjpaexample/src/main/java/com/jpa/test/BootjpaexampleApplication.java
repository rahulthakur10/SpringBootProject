package com.jpa.test;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jca.cci.object.MappingCommAreaOperation;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;


@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
	
UserRepository userRepository	= context.getBean(UserRepository.class);
	
//CREATE USER ENTRY
	User user = new User() ;
	user.setName("Rahul Thakur");
	user.setCity("Kullu");
	user.setStatus("MCA Student");
	
	User user2 = new User() ;
	user2.setName("Rohit Thakur");
	user2.setCity("Ani");
	user2.setStatus("BTech Student");
	
	User user3 = new User() ;
	user3.setName("Neeraj Chauhan");
	user3.setCity("Delhi");
	user3.setStatus("MTech Student");
	
 	//SAVE ALL ENTRIES
	ArrayList <User> users = new ArrayList<User>();
	users.add(user);
	users.add(user2);
	users.add(user3);
	userRepository.saveAll(users);
	User user1 = userRepository.save(user);
	System.out.println(user1);
	
	
	//UPDATE THE USER BY ID
	
	Optional<User> optional = userRepository.findById(4);
	User u1 = optional.get();
	u1.setStatus("MCA Student");
	User result = userRepository.save(u1);
	
	System.out.println(result);
	
	
	//DELETE THE USER 
	
	userRepository.deleteById(2);
	userRepository.deleteById(3);
	userRepository.deleteById(4);
	userRepository.deleteById(5);
	
	System.out.println("deleted");
	
	
	
	
	
	}

	
	
	
	
	
}
