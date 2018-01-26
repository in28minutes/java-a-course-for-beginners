package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		// Create a new class called Book 
		// Create three instances
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();
		
		artOfComputerProgramming.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(50);
		cleanCode.setNoOfCopies(45);
	}

}
