package com.in28minutes.oops.level2;

public class Fan {
	
	//state
	private String make;
	private double radius;
	private String color;

	private boolean isOn;
	private byte speed; //0 to 5
	
	//creation
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}
	
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte)5);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte)0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	
	//print the state
	public String toString() {
		return String.format("make - %s, radius - %f , color - %s , isOn - %b , speed - %d", 
				make, radius, color, isOn, speed);
	}
	
}
