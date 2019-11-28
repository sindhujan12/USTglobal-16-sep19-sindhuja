package com.ustglobal.jpawithhibernateapp1.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstHibernate {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");

				System.out.println("Id : "+id);
				System.out.println("Name : "+name);
				System.out.println("Salary : "+sal);
				System.out.println("Gender : "+gender);
				System.out.println("***************************************");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {

				if(conn!= null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}

			} catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
