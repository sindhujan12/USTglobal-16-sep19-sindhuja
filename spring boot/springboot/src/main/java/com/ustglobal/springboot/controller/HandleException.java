package com.ustglobal.springboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springboot.dto.EmployeeResponse;

//@ControllerAdvice----->we will use in spring mvc.
@RestControllerAdvice
public class HandleException {
	
	@ExceptionHandler(Exception.class)
	public EmployeeResponse getException() {
		EmployeeResponse response=new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("error in code");
		response.setDescription("got an exception");
		return response;
	}
}
