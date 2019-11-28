package com.ustglobal.jdbcapp;

import java.sql.*;

//import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery {
	public static void main(String[] args) {

		Connection conn=null;
		Statement stmt=null;

		try {
			//step 1:load the driver.
//			Driver driver=new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");

			//step 2:get connection.
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn=DriverManager.getConnection(url);

			//step 3:
			String sql="delete from employee_info where id=6";
			stmt=conn.createStatement();
			int count=stmt.executeUpdate(sql);
			
			//step 4:read the data.
			System.out.println(count+" rows deleted");
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
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
