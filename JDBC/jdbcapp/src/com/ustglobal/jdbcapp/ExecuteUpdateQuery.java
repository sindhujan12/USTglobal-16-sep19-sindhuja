package com.ustglobal.jdbcapp;

import java.sql.*;

//import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;

		try {
			//step 1:load the driver.
//			Driver driver=new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");

			//step 2:get connection
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn=DriverManager.getConnection(url);

			//step 3:issue sql query.
			String sql="update employee_info set name='abc',sal=50,gender='o' where id=6";
			stmt=conn.createStatement();
			int count=stmt.executeUpdate(sql);

			//step 4:read the result
			System.out.println(count+" rows updated");
		}
		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//step 5:close all jdbc objects
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
