package com.ustglobal.jdbcapp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class MyFirstJDBCWithProperties {
	
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		FileReader reader=null;
		
		try {
			reader=new FileReader("db.properties");
			Properties prop=new Properties();
			prop.load(reader);
			
			//step 1:loading the driver.
//			Driver driver=new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));
			
			
			
			//step 2:get connection.
			String url=prop.getProperty("url");
			conn=DriverManager.getConnection(url, prop);
			
			
			
			//step 3:issue the sql query.
			stmt=conn.createStatement();
			String sql=prop.getProperty("select-query");
			rs=stmt.executeQuery(sql);
			
			
			
			
			//step 4:read the result.
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int sal=rs.getInt("sal");
				String gender=rs.getString("gender");
				
				System.out.println("id : "+id);
				System.out.println("name : "+name);
				System.out.println("sal : "+sal);
				System.out.println("gender : "+gender);
				System.out.println("*******************************");
			}
		}
		catch(SQLException | ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		//step 5:close all jdbc objects.
		finally {
			
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
