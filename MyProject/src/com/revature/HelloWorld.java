package com.revature;

import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to JAVA world!!!");
		
		Date today = new Date();
		
		System.out.println(today);
		
		java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());

		System.out.println(sqlDate);
		Employee emp; // creating an employee reference variable
		emp = new Employee(); // creating employee object by calling the default constructor

		int a = 10; // primitive declaration & initialization

		Employee emp1 = new Employee();

		emp.display();

		System.out.println(emp1.display(a));

		Employee emp2 = null;

		//emp2.display();
		
		com.revature1.Employee emp3= new com.revature1.Employee();

	}

}
