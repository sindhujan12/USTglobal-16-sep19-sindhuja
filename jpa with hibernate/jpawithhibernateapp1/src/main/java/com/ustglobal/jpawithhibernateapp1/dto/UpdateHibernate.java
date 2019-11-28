package com.ustglobal.jpawithhibernateapp1.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class UpdateHibernate {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {
			//step 1
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step 2
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//step 3

			String sql = "update employee_info set name='',sal=,gender='' where id =  ";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);

			//step 4

			System.out.println(count + " Row(s) updated ");

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//step 5
			try {
				if(conn!=null) {
					conn.close();
				}if(stmt!=null) {
					stmt.close();
				}


			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
