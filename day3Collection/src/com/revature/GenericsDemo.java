package com.revature;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(5);
		int a =20;
		numberList.add(a); //autoboxing 
		
		numberList.add(17);
		
		System.out.println(numberList); //auto unboxing
		
		
		
	}

}
