package com.in28minutes.concurrency;

public class BiCounter {
	private int i = 0;
	private int j = 0;
	
	synchronized public void incrementI() {
		i++; 
		//get i
		//increment  
		//set i
	}

	public int getI() {
		return i;
	}
	
	synchronized public void incrementJ() {
		j++; 
		//get j
		//increment  
		//set j
	}

	public int getJ() {
		return j;
	}

}
