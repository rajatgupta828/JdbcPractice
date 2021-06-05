package com.practice.rajat.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	
	private final String url = "jdbc:mysql://localhost:3306/AirDb";
	private final String uname = "root";
	private final String pwd = "Garima@16";
	
	
	public Student getStudent(int id) {
		Student s = new Student();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			s.Id = id;
			Connection conn = DriverManager.getConnection(url,uname,pwd);
			
			String generatedQuery = "Select Name from Student where id = " + id;
			
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(generatedQuery);
			rs.next();
			
			String fetchedName = rs.getString("Name");
			
			s.Name = fetchedName;
			return s;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s;
	}
}
