package com.ustglobal.lms.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.lms.dto.AdminBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.LibraryResponse;
import com.ustglobal.lms.dto.StudentBean;
import com.ustglobal.lms.service.AdminService;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class AdminController {

	private final int successCode=201;
	
	private final int failCode=401;
	
	private final String success="Success";
	
	private final String failed="Failure";
	
	@Autowired
	private AdminService service;
	
	@PostMapping(path = "/adminlogin/{id}/{password}",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse login(@PathVariable("id") int id,
			@PathVariable("password") String password,
			HttpServletRequest request) {
		LibraryResponse response=new LibraryResponse();
		
		AdminBean bean=service.login(id, password);
		if(bean!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("admin", bean);
			response.setAdminBeans(Arrays.asList(bean));
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Login Success");
			return response;
		}else {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Login Success");
			return response;
		}
	}
	

	@PutMapping(path = "/registerLibrarian",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse registerLibrarian(@RequestBody LibrarianBean bean) {
		LibraryResponse response=new LibraryResponse();
		if(service.registerLibrarian(bean)) {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Student Added");
			return response;
		}else {
			response.setStatusCode(failCode);
			response.setMessage(failed);
			response.setDescription("Student not Added");
			return response;
		}
	}
	
	
	@DeleteMapping(path = "/deleteLibrarian/{id}",	produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteLibrarian(@PathVariable("id") int id) {
		LibraryResponse response=new LibraryResponse();
		
		if(service.deleteLibrarian(id)) {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Librarian Removed ffrom DB");
			return response;
		}else {
			response.setStatusCode(failCode);
			response.setMessage(failed);
			response.setDescription("Librarian Not Exist");
			return response;
		}
	}
	@PostMapping(path = "/registerStudent",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse register(@RequestBody StudentBean bean) {
		LibraryResponse response=new LibraryResponse();
		if(service.registerStudent(bean)) {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Student Added");
			return response;
		}else {
			response.setStatusCode(failCode);
			response.setMessage(failed);
			response.setDescription("Student not Added");
			return response;
		}
	}
	@DeleteMapping(path = "/deleteStudent/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteStudent(@PathVariable("id") int id) {
		LibraryResponse response=new LibraryResponse();
		
		if(service.deleteStudent(id)) {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Student Removed ffrom DB");
			return response;
		}else {
			response.setStatusCode(failCode);
			response.setMessage(failed);
			response.setDescription("Student Not Exist");
			return response;
		}
	}
}