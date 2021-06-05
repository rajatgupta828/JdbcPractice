package com.practice.rajat.DAO;

public class JDBCDaoDemo {
	
	
	
	public static void main(String[] args) {
		StudentDao sDao = new StudentDao();
		
		Student fetchedStudent = sDao.getStudent(11);
		
		System.out.println(fetchedStudent.Name);

	}

}
