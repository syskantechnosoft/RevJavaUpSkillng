package com.revature;

public class WrapperClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a  = 5;
		Integer intObj = new Integer(50);
		
		System.out.println(a);
		System.out.println(intObj);
		
		
		String str = "abc";
		char c= str.charAt(1);
//		int strVal = Integer.parseInt(str);
		System.out.println(c);
		
		
		String str1 = "45.879f";
		float f= Float.parseFloat(str1);
		System.out.println(f);
	}

}
