package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class InsertWithTryResource {

	public static void main(String[] args) {
		try(FileReader reader=new FileReader("db.properties")){
			Properties prop=new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driver-class-name"));
			String url=prop.getProperty("url");
			String sql=prop.getProperty("insert1-query");

			try(Connection conn=DriverManager.getConnection(url,prop);
					Statement stmt=conn.createStatement()){
				int count=stmt.executeUpdate(sql);
				
				System.out.println(count+" rows inserted");
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
