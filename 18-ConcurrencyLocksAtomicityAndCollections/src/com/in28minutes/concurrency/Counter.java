package com.in28minutes.concurrency;

public class Counter {
	private int i = 0;
	
	synchronized public void increment() {
		i++; 
		//get i
		//increment  
		//set i
	}

	public int getI() {
		return i;
	}
}
