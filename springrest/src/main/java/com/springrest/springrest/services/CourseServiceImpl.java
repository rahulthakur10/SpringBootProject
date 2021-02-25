package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service 
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDao courseDao ;
	
	//List<Course> list ;
	 public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(125,"Spring Boot Core","Basic of Spring boot"));// TODO Auto-generated constructor stub
//		list.add(new Course(145,"Java Core","Basic of Java"));
//	
		 }
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(long courseId) {
		
//		Course c = null ;
//		for(Course course : list)
//		{
//			if(course.getId()==courseId)
//			{
//				c =course ;
//				break ;
//			}
//		}
		
		return courseDao.getOne(courseId) ;
	}

	@Override
	public Course addCourse(Course course) {
		
//		list.add(course);// TODO Auto-generated method stub
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});// TODO Auto-generated method stub
		
		courseDao.save(course) ;
		return course;
	}

}
