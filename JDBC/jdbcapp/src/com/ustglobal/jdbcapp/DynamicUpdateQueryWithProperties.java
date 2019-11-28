package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class DynamicUpdateQueryWithProperties {
	public static void main(String[] args) {
		

		
		Connection conn=null;
		PreparedStatement pstmt=null;
		FileReader reader=null;
		
		try {
			reader=new FileReader("db.properties");
			Properties prop=new Properties();
			prop.load(reader);
			
			String url=prop.getProperty("url");
			String sql=prop.getProperty("update-query");
			
			//step 1:load the driver
//			Driver driver=new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));
			
			//step 2:get connection
			conn=DriverManager.getConnection(url, prop);
			
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
		catch(Exception e) {
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
