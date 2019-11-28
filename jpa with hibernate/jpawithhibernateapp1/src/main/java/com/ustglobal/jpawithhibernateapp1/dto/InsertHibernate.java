package com.ustglobal.jpawithhibernateapp1.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertHibernate {
	public static void main(String[] args) {
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;

		try {
			//step 1
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			//or
			Class.forName("com.mysql.jdbc.Driver");

			//step 2
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//step 3

			String sql = "insert into employee_info values(?,?,?,?)";
//			stmt = conn.createStatement();
//			int count = stmt.executeUpdate(sql);
			
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			//OR
			//pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1,Integer.parseInt(args[0] );
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();

			//step 4

			System.out.println(count + " Row(s) inserted ");

		}catch(Exception e) {
			e.printStackTrace();
		}finally {

			//step 5
			try {
				if(conn!=null) {
					conn.close();
//				}if(stmt!=null) {
//					stmt.close();
//				}
					if(pstmt!=null) {
						pstmt.close();
					}

				}}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		}
	}

	//end of main()



