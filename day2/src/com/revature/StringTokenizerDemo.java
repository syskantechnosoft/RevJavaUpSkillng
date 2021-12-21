package com.revature;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer tokens = new StringTokenizer("This is, a small example, for tokenizer",",");
		
		System.out.println(tokens.countTokens());
		
		while(tokens.hasMoreTokens()) {
			System.out.print(tokens.nextToken(","));
		}
	}

}
