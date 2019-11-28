package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="delete from employee_info where id=?";

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

			String empid=args[0];
			int id=Integer.parseInt(empid);
			pstmt.setInt(1, id);

			//step 4:read the result
			int count=pstmt.executeUpdate();

			System.out.println(count+" rows deleted");
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
