package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class DynamicDeleteQueryWithProperties {
	public static void main(String[] args) {
		

		Connection conn=null;
		PreparedStatement pstmt=null;
		FileReader reader=null;

		try {
			reader=new FileReader("db.properties");
			Properties prop=new Properties();
			prop.load(reader);
			
			String url=prop.getProperty("url");
			String sql=prop.getProperty("delete-query");
			
			//step 1:load the driver
//			Driver driver=new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));

			//step 2:get connection
			conn=DriverManager.getConnection(url, prop);

			//step 3:issue sql query
			pstmt=conn.prepareStatement(sql);

			String empid=args[0];
			int id=Integer.parseInt(empid);
			pstmt.setInt(1, id);

			//step 4:read the result
			int count=pstmt.executeUpdate();

			System.out.println(count+" rows deleted");
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
