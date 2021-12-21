package com.revature;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World"; // Literal Initialization

		int a = 10; // integer variable declaration & initialization

		String str1 = new String("Hello World"); // Object initialization

		// both str & str1 are reference variables

		System.out.println(str.charAt(4));

		// String stores each character in a array

		System.out.println(str.length());

		// Strings are immutable in java

		String str2 = "my string";
		System.out.println(str2.concat(" is the best!"));
		System.out.println(str2);
	}

}
