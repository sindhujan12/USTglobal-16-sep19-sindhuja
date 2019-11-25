package com.ustglobal.phoneapp.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.phoneapp.dto.MobileBean;

public class MobileDAOImpl implements MobileDAO{

	String url = "jdbc:mysql://localhost:3306/contactfiles?user=root&password=root";
	Connection conn=null;
	Statement stmt=null;
	PreparedStatement pstmt=null;
    ResultSet rs=null;
	
	@Override
	public List<MobileBean> allDetails() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			stmt=conn.createStatement();
		    String sql ="select * from contact";
		    rs=stmt.executeQuery(sql);
		    ArrayList<MobileBean> result = new ArrayList<MobileBean>();
		    while(rs.next()) {
		    	MobileBean mb1 = new MobileBean();
		    	mb1.setName(rs.getString("name"));
		    	mb1.setNumber(rs.getInt("number"));
		    	mb1.setGrup(rs.getString("grup"));
		    	result.add(mb1);
		    	
		    	
		    }//end of while
			return result;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
			if(conn!=null) conn.close();
			if(stmt!=null)  stmt.close();
			if(rs!=null)    rs.close(); 
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}//end of allDetails()

	@Override
	public MobileBean searchContact(String s) {
	
try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			String sql="select * from contact where name=?";
			
	        pstmt=conn.prepareStatement(sql);
	        pstmt.setString(1, s);
      		rs=pstmt.executeQuery();
      		if(rs.next()) {
      			MobileBean mb2 =new MobileBean();
      			mb2.setName(rs.getString("name"));
      			mb2.setNumber(rs.getInt("number"));
      			mb2.setGrup(rs.getString("grup"));
      			return mb2;
      		}else {
      			return null;
      		}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
			if(conn!=null) conn.close();
			if(pstmt!=null)  pstmt.close();
			if(rs!=null)    rs.close(); 
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	
		
	}//end of search 

	@Override
	public int insertContact(MobileBean m) {
try {
			String name =m.getName();
			long num =m.getNumber();
			String group=m.getGrup();
					
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			String sql ="insert into contact values(?,?,?)";
			 pstmt=conn.prepareStatement(sql);
	         
			pstmt.setString(1, name);
			pstmt.setLong(2, num);
			pstmt.setString(3, group);
			int c = pstmt.executeUpdate();
			return c;
			
			
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}finally {
			try {
			if(conn!=null) conn.close();
			if(pstmt!=null)  pstmt.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	
		
	}

	@Override
	public int updateContact(MobileBean m) {
try {
			
	String name =m.getName();
	long num =m.getNumber();
	String group=m.getGrup();
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			
			String sql ="update contact set number=?, grup=? where name=?";
			 pstmt=conn.prepareStatement(sql);
	         
			pstmt.setString(3, name);
			pstmt.setLong(1, num);
			pstmt.setString(2, group);
			int c = pstmt.executeUpdate();
			return c;
			
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}finally {
			try {
			if(conn!=null) conn.close();
			if(pstmt!=null)  pstmt.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	
		
	}

	@Override
	public int deleteContact(MobileBean m) {
try {
			String s = m.getName();
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			String sql = "delete from contact where name=?";
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, s);
			int c1 = pstmt.executeUpdate();
			return c1;
			
			
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}finally {
			try {
			if(conn!=null) conn.close();
			if(stmt!=null)  stmt.close();
			 
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	
		
	}

	
}
