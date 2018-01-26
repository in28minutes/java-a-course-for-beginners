package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		
		MotorBike ducati = new MotorBike();
		
		MotorBike honda = new MotorBike();
		
		ducati.start();
		honda.start();
		
		ducati.setSpeed(100);
		
		ducati.increaseSpeed(100);
				
		honda.increaseSpeed(100);
		
		ducati.decreaseSpeed(250);
		
		honda.decreaseSpeed(250);
		
		System.out.println(ducati.getSpeed());
		
		System.out.println(honda.getSpeed());
	}

}

// Create a new class called Book 
// Create three instances
// Art Of Computer Programming
// Effective Java
// Clean Code