package day4io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamExample {

	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
			
			fout.write(65);
//			fout.write(66);
			fout.close();
			System.out.println("success...");
			
			FileInputStream fis =  new FileInputStream("D:\\testout.txt");
			int a = fis.read();
			System.out.println((char)a);
			fis.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
