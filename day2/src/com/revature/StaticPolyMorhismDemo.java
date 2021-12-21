package com.revature;

public class StaticPolyMorhismDemo {
	
	
	public void add(int a, int b) {
		System.out.println("result=" + (a+b));
	}
	
	//overloaded method with a different signature
	public void add(int a, float b) {
		System.out.println("result=" + (a+b));
	}
	
	public void add(float a, float b) {
		System.out.println("result=" + (a+b));
	}
	
	public void add(float a, int b) {
		System.out.println("result=" + (a+b));
	}
	
	public void add(int a, int b,int c) {
		System.out.println("result=" + (a+b+c));
	}
	
	public float add(int a, int b, float c) {
		return (a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticPolyMorhismDemo obj = new StaticPolyMorhismDemo();
		
		obj.add(5.7f, 8.9f);
		obj.add(5.7f, 10);
		obj.add(25, 8.9f);
		obj.add(75, 65);
		obj.add(2,4,8);
	}

}
