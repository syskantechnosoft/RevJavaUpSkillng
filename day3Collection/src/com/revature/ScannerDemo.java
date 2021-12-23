package com.revature;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str;

		System.out.println("Enter username :");
		str = input.nextLine();

		int a;
		System.out.println("Please Enter a number :");
		a = input.nextInt();
			
		String str1;
		System.out.println("Enter password :");
		str1 = input.nextLine();
		
//		input.r

		System.out.println("a =" + a);

		System.out.println("str = " + str);
		
		System.out.println("str1 = " + str1);

	}

}
