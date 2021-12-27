package com.revature;

import java.io.Serializable;

public class Student implements Serializable {

	int id;
	String name;
	transient int marks;

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

}
