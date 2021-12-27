package com.revature;

 class Singleton {
	// Private static variable of the class' type
	private static Singleton instance;
	private int number;

	// Private Constructor
	private Singleton() {
		number = 0;
	}

	// Public static getInstance method
	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}

	// this method is called from an instance of the class.
	// However because there is only 1 instance, whenever this is called it will
	// affect all pointers to the instance.
	public void printer() {
		this.number++;
		System.out.println("printer has been called " + this.number + " times.");

	}
}

public class Main {
	public static void main(String[] args) {
		Singleton mySingle = Singleton.getInstance(); // When this is called the first time the singleton does not
														// exist, so it gets created.
		mySingle.printer(); // output: printer has been called 1 times
		Singleton yourSingle = Singleton.getInstance(); // This time when getInstance is called there already exists an
														// instance, so it just returns the reference to the singleton.
		yourSingle.printer(); // output: printer has been called 2 times
		System.out.println(mySingle == yourSingle); // This will output true, because mySingle points to the same object
													// as yourSingle
		
		System.out.println(mySingle.equals(yourSingle));
		
		
		System.out.println(mySingle.hashCode());
		System.out.println(yourSingle.hashCode());
	}
}
