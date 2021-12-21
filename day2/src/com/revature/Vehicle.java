package com.revature;

public interface Vehicle {
	
	int speed =0;
	
	public void accelerate(); //method declaration
	
	public void applyBreak();
	
	
	public static void display() {
		System.out.println("Interface static Display method");
	}
	
	default void show() {
		System.out.println("Interface default show method");
	}

}
