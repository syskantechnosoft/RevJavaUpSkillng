package com.revature;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder strBuild = new StringBuilder(25);
		strBuild.append("welcome to the java world!!!! This is StringBuilder demo program!!!");
		System.out.println(strBuild);
		
		strBuild.append(" new data");
		System.out.println(strBuild);
		StringBuilderDemo demo = new StringBuilderDemo();
		System.out.println(demo);
		
		
		
		System.out.println(strBuild.capacity());
		
		System.out.println(strBuild.length());
	}

}
