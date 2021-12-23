package com.revature;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		int c[] = { 7, 10, 21, 73, 42, 3, 9 };

		File f = new File("c://users//test.txt");
		
		try (FileInputStream fis = new FileInputStream(f)) {
			
			fis.read();
			System.out.println(c[6]);
			System.out.println(a / b);

		} catch (ArithmeticException | IOException e) {
			// TODO: handle exception
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException | IllegalArgumentException  e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("inside finally!!! ");
			
		}

		System.out.println("Program Ends Here!!!");
	}

}
