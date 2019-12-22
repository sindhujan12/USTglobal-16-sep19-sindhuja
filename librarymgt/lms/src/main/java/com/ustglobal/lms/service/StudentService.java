package com.ustglobal.lms.service;

import java.util.List;

import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.BookIssueBean;
import com.ustglobal.lms.dto.StudentBean;

public interface StudentService {
	public StudentBean login(String email,String password);
	public BookBean search(String name);

	public boolean returnBook(int sid,int bid);
	public BookBean searchById(int bid);
	public List<BookIssueBean> myBooks(int sid);
	public boolean request(int sid, int bid,String status);
	public List<BookBean> getAll();
}
