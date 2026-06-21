package com.ganesh.entity;

import lombok.Data;

@Data
public class Student {
	
	
	int id;
	
	String name;
	
	double marks;

	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	
	
	

}
