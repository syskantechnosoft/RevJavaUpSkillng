package com.revature;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.forEach(str -> System.out.println(str));
	}

}
