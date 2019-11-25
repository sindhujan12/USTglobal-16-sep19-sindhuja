package com.ustglobal.phoneapp.util;

import com.ustglobal.phoneapp.dao.MobileDAO;
import com.ustglobal.phoneapp.dao.MobileDAOImpl;

public class MobileManager {

	private MobileManager() {
		
	}
	
	public static MobileDAO getInstance() {
		return new MobileDAOImpl();
	}
	
}
