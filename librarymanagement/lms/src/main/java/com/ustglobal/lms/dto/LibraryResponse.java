package com.ustglobal.lms.dto;

import java.util.List;

public class LibraryResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<StudentBean> studentBeans;
	private List<BookBean> bookBeans;
	private List<BookIssueBean> bookIssueBeans;
	private List<LibrarianBean> librarianBeans;
	private List<AdminBean> adminBeans;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<StudentBean> getStudentBeans() {
		return studentBeans;
	}
	public void setStudentBeans(List<StudentBean> studentBeans) {
		this.studentBeans = studentBeans;
	}
	public List<BookBean> getBookBeans() {
		return bookBeans;
	}
	public void setBookBeans(List<BookBean> bookBeans) {
		this.bookBeans = bookBeans;
	}
	public List<BookIssueBean> getBookIssueBeans() {
		return bookIssueBeans;
	}
	public void setBookIssueBeans(List<BookIssueBean> bookIssueBeans) {
		this.bookIssueBeans = bookIssueBeans;
	}
	public List<LibrarianBean> getLibrarianBeans() {
		return librarianBeans;
	}
	public void setLibrarianBeans(List<LibrarianBean> librarianBeans) {
		this.librarianBeans = librarianBeans;
	}
	public List<AdminBean> getAdminBeans() {
		return adminBeans;
	}
	public void setAdminBeans(List<AdminBean> adminBeans) {
		this.adminBeans = adminBeans;
	}
	
	
}
