package com.ganesh.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

import com.ganesh.entity.Student;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	
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
	
	
	@GetMapping("/student")
	public List<Student> getStudent() {
		
		  return List.of(new Student(1,"Ganesh",80.00),new Student(2,"Ram",90.00),new Student(3,"Shyam",70.00),new Student(4,"Hari",60.00));
	}
	
	
	
	
	
}
