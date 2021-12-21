package com.revature;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short a = 45;

		int b = 750;
		a = (short) b;

		System.out.println(a);

		b = a; // (widening)
		System.out.println(b);

	}

}
