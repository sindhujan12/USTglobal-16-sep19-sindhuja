package com.ustglobal.lms.service;

import com.ustglobal.lms.dto.AdminBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.StudentBean;

public interface AdminService {
	public AdminBean login(int id, String password);
	
	public boolean registerLibrarian(LibrarianBean bean);
	
	public boolean deleteLibrarian(int id);
	public boolean registerStudent(StudentBean bean);
	public boolean deleteStudent(int id);
}
