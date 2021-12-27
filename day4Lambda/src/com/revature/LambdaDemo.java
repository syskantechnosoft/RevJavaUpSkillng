package com.revature;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d = new Drawable() {
			
			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("annonymous draw method definition");
			}
		};
		
		d.draw();
		
		//functional programming
		//using lambda
		Drawable d1 = ()->System.out.println("Lambda draw method definition!!!");
		d1.draw();
	}

}

@FunctionalInterface
interface Drawable {
	void draw();	
}
