package com.ustglobal.lms.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.lms.dto.LibraryResponse;

@RestControllerAdvice
public class HandlingException {
	
	@ExceptionHandler(Exception.class)
	public LibraryResponse getException() {
		LibraryResponse response=new LibraryResponse();
		response.setStatusCode(501);
		response.setMessage("Error in Code");
		response.setDescription("Got Exception");
		return response;
	}
}