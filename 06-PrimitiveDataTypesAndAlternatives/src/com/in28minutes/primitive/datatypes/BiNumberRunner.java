package com.in28minutes.primitive.datatypes;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2, 3);
		
		System.out.println(numbers.add());//2+3
		System.out.println(numbers.multiply());//2*3
		
		numbers.doubleValue();//Double both numbers 
		
		System.out.println(numbers.getNumber1());//4
		System.out.println(numbers.getNumber2());//6
	}

}
