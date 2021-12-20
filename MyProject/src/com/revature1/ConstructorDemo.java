package com.revature1;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A();
		
		a.setId(100);
		a.setName("test");
		
		System.out.println(a);
		
		a.setName("different");
		
		System.out.println(a.hashCode());
		System.out.println(a);
	}

}

class A {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
