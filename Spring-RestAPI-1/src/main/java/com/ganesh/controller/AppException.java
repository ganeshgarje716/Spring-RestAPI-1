package com.ganesh.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class AppException {
	
	
	@ExceptionHandler(value = StudentNotFoundException.class)
	public String handalStudentNotFoundException(Exception e) {
		
		return e.getMessage();
	}

}
