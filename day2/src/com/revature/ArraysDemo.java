package com.revature;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = new int[10];
		
		char options[] = {'a','c','d','a','f'};
		marks[0]=10;
		marks[1]=35;
		marks[5]=27;
		
		for (int m : marks) {
			System.out.println(m);
		}
		System.out.println(marks);
		
		System.out.println(options);
		
		
		//Heterogeneous arrays
		Object []objArray = new Object[10];
		objArray[0]='a';  // auto boxing - converting from primitive to it's object
		objArray[1] = 56;
		objArray[2] = true;
		objArray[3] = 67.56f;
		objArray[4] = 12435.980994;
		objArray[5] = 987867453417l;
		objArray[6] = new Employee();
		objArray[7] = new Car();
		
		for (Object obj : objArray) {
			System.out.println(obj);
		}
		
		
		Employee emp[] = new Employee[5];
		emp[0] = new Employee();
//		emp[1] = new Car();
		
		
	}

}
