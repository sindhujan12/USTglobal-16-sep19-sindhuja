package com.ustglobal.jdbcapp;

import java.sql.*;

//import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {
	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="Select * from employee_info";

		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		try {
			//step 1:load the driver
//			Driver driver=new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2:get connection
			conn=DriverManager.getConnection(url);
			
			//step 3:issue the sql query
			pstmt=conn.prepareStatement(sql);
//			String empid=args[0];
//			int id=Integer.parseInt(empid);
//			pstmt.setInt(1, id);

			rs=pstmt.executeQuery();
			
			//step 4:read the result
			if(rs.next()) {
				int emp_id=rs.getInt("id");
				String name=rs.getString("name");
				int sal=rs.getInt("sal");
				String gender=rs.getString("gender");

				System.out.println("id : "+emp_id);
				System.out.println("name : "+name);
				System.out.println("sal : "+sal);
				System.out.println("gender : "+gender);
				System.out.println("*******************************");
			}
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
				if(rs!=null) {
					rs.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
