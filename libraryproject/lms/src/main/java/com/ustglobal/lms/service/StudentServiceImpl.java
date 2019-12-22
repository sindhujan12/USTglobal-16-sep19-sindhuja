package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.StudentDAO;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.BookIssueBean;
import com.ustglobal.lms.dto.StudentBean;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDAO dao;
	
	@Override
	public boolean returnBook(int sid, int bid) {
		return dao.returnBook(sid, bid);
	}
	
	@Override
	public List<BookIssueBean> myBooks(int sid) {
		return dao.myBooks(sid);
	}
@Override
	public BookBean searchById(int bid) {
		return dao.searchById(bid);
	}
	@Override
	public StudentBean login(String email, String password) {
		return dao.login(email, password);
	}

	@Override
	public BookBean search(String name) {
		return dao.search(name);
	}

	@Override
	public boolean request(int sid, int bid, String status) {
		return dao.request(sid,bid, status);
	}

	@Override
	public List<BookBean> getAll() {
		return dao.getAll();
	}
}
