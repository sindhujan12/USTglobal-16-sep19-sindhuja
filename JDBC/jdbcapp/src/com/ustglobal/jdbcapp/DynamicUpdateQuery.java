package com.ustglobal.jdbcapp;

import java.sql.*;

//import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery {
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="update employee_info set name=?,sal=?,gender=? where id=?";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			//step 1:load the driver
//			Driver driver=new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2:get connection
			conn=DriverManager.getConnection(url);
			
			//step 3:issue sql query
			pstmt=conn.prepareStatement(sql);
			
			String name=args[0];
			pstmt.setString(1, name);
			
			String empsal=args[1];
			int sal=Integer.parseInt(empsal);
			pstmt.setInt(2, sal);
			
			String gender=args[2];
			pstmt.setString(3, gender);
			
			String empid=args[3];
			int id=Integer.parseInt(empid);
			pstmt.setInt(4, id);
			
			//step 4:read the result
			int count=pstmt.executeUpdate();
			
			System.out.println(count+" rows updated");
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		finally {
			//step 5:close all jdbc objects
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
