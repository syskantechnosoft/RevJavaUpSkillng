package com.revature;

public class DynamicPolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.display();
		
		Child c = new Child();
		c.display();
		
		//compile time error
//		Child c1 = new Parent();
		
		Parent p1 = new Child();
		p1.display();
	}

}


class Parent {
	
	public void display() {
		System.out.println("Parent class method");
	}
	
}

class Child extends Parent{
	//redefining parent class method in sub class with out changing the signature
	//method overriding or dynamic polymorphism
	public void display() {
		System.out.println("Child class method");
	}
	
}
