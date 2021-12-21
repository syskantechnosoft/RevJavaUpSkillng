package com.revature;

import java.io.Serializable;

public class ElectricCar extends Car  implements Vehicle, Serializable, Cloneable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricCar ec =  new ElectricCar();
		
		Vehicle.display();
		
		Vehicle v = new ElectricCar();
		v.show();
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyBreak() {
		// TODO Auto-generated method stub
		
	}

}
