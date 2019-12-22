package com.ustglobal.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.AdminDAO;
import com.ustglobal.lms.dto.AdminBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.StudentBean;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO dao;
	
	@Override
	public AdminBean login(int id, String password) {
		return dao.login(id, password);
	}

	

	@Override
	public boolean registerLibrarian(LibrarianBean bean) {
		return dao.registerLibrarian(bean);
	}

	

	@Override
	public boolean deleteLibrarian(int id) {
		return dao.deleteLibrarian(id);
	}
	
	@Override
	public boolean registerStudent(StudentBean bean) {
	
		return dao.registerStudent(bean);
	}
	@Override
	public boolean deleteStudent(int id) {
		return dao.deleteStudent(id);
	}

}
