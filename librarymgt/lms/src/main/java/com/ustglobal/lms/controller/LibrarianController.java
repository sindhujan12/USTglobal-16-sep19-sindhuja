package com.ustglobal.lms.controller;

import java.util.Arrays;
import java.util.List;

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
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.BookIssueBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.LibraryResponse;
import com.ustglobal.lms.dto.StudentBean;
import com.ustglobal.lms.service.LibrarianService;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class LibrarianController {

	@Autowired
	private LibrarianService service;

	private final int successCode=201;

	private final int failCode=401;

	private final String success="Success";

	private final String failed="Failure";

	@PostMapping(path = "/librarianlogin/{email}/{password}",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse login(@PathVariable("email") String email,
			@PathVariable("password") String password,
			HttpServletRequest request) {
		LibraryResponse response=new LibraryResponse();

		LibrarianBean bean=service.login(email, password);
		if(bean!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("librarian", bean);
			response.setLibrarianBeans(Arrays.asList(bean));
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Login Success");
			return response;
		}else {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Login Failure");
			return response;
		}
	}
	
	@PutMapping(path = "/addBook",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse addBook(@RequestBody BookBean bean) {
		LibraryResponse response=new LibraryResponse();
		
		if(service.addBook(bean)) {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Book is added");
			return response;	
		}else {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Book is Not Added");
			return response;
		}
	}
	
	@GetMapping(path = "/updateBook",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse updateBook(@RequestBody BookBean bean) {
		LibraryResponse response=new LibraryResponse();
		if(service.updateBook(bean)) {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Book is Updated");
			return response;
		}else {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Book is Not Updated");
			return response;
		}
	}
	

	@DeleteMapping(path = "/removeBook/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse removeBook(@PathVariable("id") int id) {
		LibraryResponse response=new LibraryResponse();
		if(service.removeBook(id)) {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Book is Deleted");
			return response;
		}else {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Book is Not Deleted");
			return response;
		}
	}	

	@GetMapping(path = "/issueBook",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse requestedIssue() {
		LibraryResponse response=new LibraryResponse();
		List<BookIssueBean> beans=service.requestedIssue();
		if(beans!=null) {
			response.setBookIssueBeans(beans);
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("success");
			return response;
		}else {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("No one requested");
			return response;
		}
	}	

	@GetMapping(path = "/returnBook",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse requestedReturn() {
		LibraryResponse response=new LibraryResponse();
		List<BookIssueBean> beans=service.requestedReturn();
		if(beans!=null) {
			response.setBookIssueBeans(beans);
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("success");
			return response;
		}else {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("No one requested");
			return response;
		}
	}	
	

	@GetMapping(path = "/acceptIssue/{sid}/{bid}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse acceptBook(@PathVariable("sid") int sid,
			@PathVariable("bid") int bid) {
		LibraryResponse response=new LibraryResponse();
		if(service.acceptBook(sid,bid)) {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("success");
			return response;
		}else {
			response.setStatusCode(failCode);
			response.setMessage(failed);
			response.setDescription("Failed");
			return response;
		}
	}
	

	@GetMapping(path = "/acceptReturn/{sid}/{bid}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse acceptReturn(@PathVariable("sid") int sid,
			@PathVariable("bid") int bid) {
		LibraryResponse response=new LibraryResponse();
		if(service.acceptReturn(sid, bid)) {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("success");
			return response;
		}else {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Failed");
			return response;
		}
	}	
	
	

}