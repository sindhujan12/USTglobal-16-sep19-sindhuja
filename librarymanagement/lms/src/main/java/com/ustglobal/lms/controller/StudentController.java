package com.ustglobal.lms.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.LibraryResponse;
import com.ustglobal.lms.dto.StudentBean;
import com.ustglobal.lms.service.StudentService;


@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class StudentController {

	private final int successCode=201;
	
	private final int failCode=401;
	
	private final String success="Success";
	
	private final String failed="Failure";
	
	@Autowired
	private StudentService service;	
	
	@PostMapping(path = "/studentLogin/{email}/{password}",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse login(@PathVariable("email") String email,
			@PathVariable("password") String password,
			HttpServletRequest request) {
		LibraryResponse response=new LibraryResponse();
		StudentBean bean=service.login(email, password);
		if(bean!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("studentBean", bean);;
			response.setStudentBeans(Arrays.asList(bean));
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

	@GetMapping(path = "/searchBook",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse search(@RequestParam("name")String name) {
		LibraryResponse response=new LibraryResponse();
		BookBean bean=service.search(name);
		if(bean!=null) {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Book Found");
			response.setBookBeans(Arrays.asList(bean));
			return response;
		}else {
			response.setStatusCode(failCode);
			response.setMessage(failed);
			response.setDescription("Book not found");
			return response;
		}
	}
	
	@PutMapping(path = "/request/{sid}/{bid}/{status}",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse request(@PathVariable("bid") int bid,
			@PathVariable("status") String status,@PathVariable("sid") int sid)
//			@SessionAttribute(name = "studentBean" ,required = false) StudentBean bean)
	{
		LibraryResponse response=new LibraryResponse();
//		if(bean!=null) {
//			int sid=bean.getSid();
		if(service.request(sid,bid, status)) {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Request Sent wait for Approve");
			return response;
		}else {
			response.setStatusCode(failCode);
			response.setMessage(failed);
			response.setDescription("Book already Taken by someone");
			return response;
		}
//		}else {
//			response.setStatusCode(failCode);
//			response.setMessage(failed);
//			response.setDescription("Login First!!");
//			return response;
//		}
	}
	@GetMapping(path = "getAllBook",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getAll() {
		LibraryResponse response=new LibraryResponse();
		if(service.getAll()!=null) {
			response.setBookBeans(service.getAll());
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("success");
			return response;
		}else {
			response.setStatusCode(failCode);
			response.setMessage(failed);
			response.setDescription("No boooks");
			return response;
		}
	}
	

	@GetMapping(path = "getMyBooks/{sid}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse myBooks(@PathVariable("sid") int sid) {
		LibraryResponse response=new LibraryResponse();
		if(service.myBooks(sid)!=null) {
			response.setBookIssueBeans(service.myBooks(sid));
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("success");
			return response;
		}else {
			response.setStatusCode(failCode);
			response.setMessage(failed);
			response.setDescription("No boooks");
			return response;
		}
	}
	
	@GetMapping(path = "searchById/{bid}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse searchById(@PathVariable("bid") int bid) {
		LibraryResponse response=new LibraryResponse();
		if(service.searchById(bid)!=null) {
			response.setBookBeans(Arrays.asList(service.searchById(bid)));
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("success");
			return response;
		}else {
			response.setStatusCode(failCode);
			response.setMessage(failed);
			response.setDescription("No boooks");
			return response;
		}
	}
	
	@PutMapping(path = "returnBook/{sid}/{bid}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse returnBook(@PathVariable("sid") int sid,
			@PathVariable("bid") int bid) {
		LibraryResponse response=new LibraryResponse();
		if(service.returnBook(sid, bid)) {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("Requested for return Book");
			return response;
		}else {
			response.setStatusCode(failCode);
			response.setMessage(failed);
			response.setDescription("Failed to return Book");
			return response;
		}
	}
	
}