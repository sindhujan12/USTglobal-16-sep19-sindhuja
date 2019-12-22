package com.ustglobal.lms.dao;

import java.util.List;

import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.BookIssueBean;
import com.ustglobal.lms.dto.StudentBean;

public interface StudentDAO {
	public StudentBean login(String email,String password);
	public boolean returnBook(int sid,int bid);
	public BookBean search(String name);
	public BookBean searchById(int bid);
	public boolean request(int sid, int bid,String status);
	public List<BookIssueBean> myBooks(int sid);
	public List<BookBean> getAll();
}
