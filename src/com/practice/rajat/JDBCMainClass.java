package com.practice.rajat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCMainClass {
	
	private static String url = "jdbc:mysql://localhost:3306/AirDb";
	private static String uname = "root";
	private static String pwd = "Garima@16";

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pwd);
		
		String sql = "select * from Student";		
		Statement st = con.createStatement(); 
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("Name : " + rs.getString(2));
		}
		
		st.close();
		con.close();

	}

}
