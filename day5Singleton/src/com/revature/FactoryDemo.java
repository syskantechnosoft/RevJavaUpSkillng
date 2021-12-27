package com.revature;

public class FactoryDemo {

	public static void main(String[] args) {
		Dessert d1 = FactoryPatternDemo.getDessert("cake");
		Dessert d2 = FactoryPatternDemo.getDessert("sandwich");
		Dessert d3 = FactoryPatternDemo.getDessert("ice cream");
		Dessert d4 = FactoryPatternDemo.getDessert("candy"); // Throws DessertNotFoundException
	}
}
