package com.revature;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		Set nameList = new TreeSet();

		nameList.add("abc");
		nameList.add("xyz");
		nameList.add("def");
		nameList.add(new String("xyz"));

		System.out.println(nameList);
//		Collections.sort(nameList);
		System.out.println(nameList);

//		nameList.remove(1);
		System.out.println(nameList);

		nameList.clear();
	}

}
