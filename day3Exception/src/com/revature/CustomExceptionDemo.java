package com.revature;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		try {
			if (a <= 10) {
				throw new MyCheckedException();
			} else {
				throw new MyUnCheckedException();
			}
		} catch (MyCheckedException | MyUnCheckedException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Inside finally block!!!");
		}
		System.out.println("Program End!!!");
		
	}

}
