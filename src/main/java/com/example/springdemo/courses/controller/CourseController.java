package com.example.springdemo.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.courses.bean.Course;

@RestController
public class CourseController {

	//http://localhost:8090/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course(1,"A","B"),new Course(2,"C","DEE"));
	}
	
	//http://localhost:8090/courses/1
	@GetMapping("/courses/2")
	public Course getCourseDetails(){
		return new Course(2,"C","DEE");
	}
}
