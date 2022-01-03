package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		// Step 1: Loading and Registering the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/revature";
		String user ="root";
		String password = "root";
				
		//Step 2: Establishing the connection
		Connection conn = DriverManager.getConnection(url, user, password);
		
		//Step 3: Create & Execute the query 
		String query = "select * from employee";
		Statement stmt = conn.createStatement();
		
		//Step 4: Storing & Processing the result
		ResultSet rs = stmt.executeQuery(query);
		System.out.println("ID \t Name \t\t Email ");
		while(rs.next()) {
			System.out.println(rs.getInt(1) +" \t " + rs.getString("name")+" \t "+rs.getString(3));
		}
		
		//Step 5: Close Resources
		rs.close();
		stmt.close();
		conn.close();
		
	}

}
