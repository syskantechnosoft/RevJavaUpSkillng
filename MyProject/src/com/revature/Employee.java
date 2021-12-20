package com.revature;

public class Employee {

	private int id; // property (32 bits)
	private String name; // property (16 bits* n)

	// Single line comment

	/*
	 * Multi line comment
	 */

	/**
	 * Documentation multi line comment
	 */

	public void display() {
		System.out.println("inside display method");
	}

	public Employee() {
		super();
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int display(int a) {
		System.out.println("inside display method --- a is =" + a);
		return a * a;
	}

}
