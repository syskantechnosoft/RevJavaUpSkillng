package com.revature;

public class VarargsExample {
	public static void someMethod(int a, int... manyInts) {
		System.out.println("First argument: " + a);
		System.out.println("Next argument: ");
		for (int i = 0; i < manyInts.length; i++) {
			System.out.println(manyInts[i]);
		}
	}

	public static void main(String[] args) {
		VarargsExample.someMethod(1, 3, 4,87, 98);
		// First argument: 1
		// Next argument:
		// 3
		// 4
		// 5
		// 6
	}
}