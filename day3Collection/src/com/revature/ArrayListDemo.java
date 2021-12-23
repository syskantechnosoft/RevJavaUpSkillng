package com.revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List nameList = new ArrayList();
		
		int a[] = new int[10];
		List nameList = new LinkedList();
		
		nameList.add("abc");
		nameList.add("xyz");
		nameList.add("def");
		nameList.add(new String("xyz"));
		
		System.out.println(nameList);
		Collections.sort(nameList);
		System.out.println(nameList);
		
		nameList.remove(1);
		System.out.println(nameList);
		
		nameList.clear();
		
		
	}

}
