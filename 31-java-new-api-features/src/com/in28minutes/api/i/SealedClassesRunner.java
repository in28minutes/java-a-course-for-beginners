package com.in28minutes.api.i;

public class SealedClassesRunner {
	
	//sealed class Vehicle permits Car, Truck, Bike {}
	sealed class Vehicle permits Car, Truck, Bike {}

	//final, sealed, or non-sealed
	final class Car extends Vehicle {}
	
	//class Dummy extends Car{}
	
	//final, sealed, or non-sealed
	non-sealed class Truck extends Vehicle {}
	
	class Dummy1 extends Truck{}
	class Dummy2 extends Truck{}
	
	//final, sealed, or non-sealed
	sealed class Bike extends Vehicle permits SuperBike{}
	
	final class SuperBike extends Bike{}
	
	//class Dummy extends Vehicle {}
	
	
	public static void main(String[] args) {
		
	}

}
