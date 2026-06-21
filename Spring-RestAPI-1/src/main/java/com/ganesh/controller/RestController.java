package com.ganesh.controller;

import com.ganesh.SpringRestApi1Application;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ganesh.entity.Student;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	
	private final SpringRestApi1Application springRestApi1Application;


	RestController(SpringRestApi1Application springRestApi1Application) {
		this.springRestApi1Application = springRestApi1Application;
	}


	@GetMapping("/welcome")
	public String welcome() {
		
		return "Welcome To My Application";
	}
	
	
	@GetMapping("/user")
	public Map<String, String> getUser() {
		
		Map<String, String> map=new HashMap<>();
		
		map.put("Ram", "Student");
		map.put("Shyam", "Developer");
		
		return map;
	}
	
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable Integer id) {
		
		List<Student> of = List.of(new Student(1,"Ganesh",80.00),new Student(2,"Ram",90.00),new Student(3,"Shyam",70.00),new Student(4,"Hari",60.00));
		
		for (Student student : of) {
			
			if (student.getId() == id) {
				
				return student;
			}
		}
		   
	    throw new StudentNotFoundException("Student Not Found With Id = "+id);
	}
	
	
	
	
	
}
