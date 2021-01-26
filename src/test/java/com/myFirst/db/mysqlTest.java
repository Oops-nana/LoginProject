package com.myFirst.db;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class mysqlTest {

	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/db";
	private String user = "root";
	private String pw = "1q2w3e4r";

	@Test
	public void test() throws Exception {
		Class.forName(driver);
		
		try {
			Connection con = DriverManager.getConnection(url, user, pw);
			System.out.println("success");
			System.out.println(con);
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}

}
