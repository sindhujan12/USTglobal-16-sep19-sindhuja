package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.LibrarianDAO;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.BookIssueBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.StudentBean;
@Service
public class LibrarianServiceImpl implements LibrarianService {

	@Autowired
	private LibrarianDAO dao;
	
	@Override
	public LibrarianBean login(String email, String password) {
		return dao.login(email, password);
	}
	
	@Override
	public boolean addBook(BookBean bean) {
		return dao.addBook(bean);
	}

	@Override
	public boolean updateBook(BookBean bean) {
		return dao.updateBook(bean);
	}

	@Override
	public boolean removeBook(int id) {
		return dao.removeBook(id);
	}

	@Override
	public List<BookIssueBean> requestedIssue() {
		return dao.requestedIssue();
	}

	@Override
	public List<BookIssueBean> requestedReturn() {
		return dao.requestedReturn();
	}

	@Override
	public boolean acceptBook(int sid,int bid) {
		return dao.acceptBook(sid,bid);
	}
	@Override
	public boolean acceptReturn(int sid, int bid) {
		return dao.acceptReturn(sid, bid);
	}
	
}
