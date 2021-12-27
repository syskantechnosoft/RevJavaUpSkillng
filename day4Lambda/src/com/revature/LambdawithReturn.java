package com.revature;

public class LambdawithReturn {
	public static void main(String[] args) {
		Sayable s = () -> { return  "I have nothing to say.";};
		Sayable s1 = () -> "I have nothing to say.";
		System.out.println(s1.say());
	}

}

interface Sayable {
	public String say();
}
