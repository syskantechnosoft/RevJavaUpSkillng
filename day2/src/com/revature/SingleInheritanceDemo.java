package com.revature;

public class SingleInheritanceDemo {
	public static void main(String[] args) {
		A a = new A();
		a.show();
		B b = new B();
		
		b.id = 5;
		b.name = "child property";
		b.size = 25;
		b.show();
		
	}
}

//parent class
class A {
	int id;
	String name;

	public void show() {
		System.out.println("id :" + id + " name :" + name);
	}
}

//child class
class B extends A {
	int size;

	public void show() {
		super.show();
		System.out.println("size :" + size);
	}
}
