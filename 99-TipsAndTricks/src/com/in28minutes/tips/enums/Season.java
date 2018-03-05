package com.in28minutes.tips.enums;
public enum Season {
	SPRING(4), SUMMER(1), WINTER(2), FALL(3) ;
	
	private int value;
	
	private Season(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	
	//0,1,2,3
}
