package com.in28minutes.oops.level2.inheritance;

public class Student extends Person {
	private String collegeName;
	private int year;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
