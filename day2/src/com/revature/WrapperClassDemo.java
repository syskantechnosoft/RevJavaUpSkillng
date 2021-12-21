package com.revature;

public class WrapperClassDemo {
	public static void main(String[] args) {
		int a = 10;
		
		System.out.println(a);
		
		Integer intObj = new Integer(20);
		
		System.out.println(intObj);  //auto unboxing
	}
}
