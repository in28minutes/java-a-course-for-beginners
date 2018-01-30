package com.in28minutes.primitive.datatypes;

import java.util.Scanner;

public class BasicMenu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number1: ");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter Number2: ");
		int number2 = scanner.nextInt();
		
		
		
		System.out.println("Add: 1");
		System.out.println("Subtract: 2");
		System.out.println("Choose Operation: ");
		int choice = scanner.nextInt();
		
		int result = 0;
		if(choice==1) {
			result = number1 + number2;
		} else if(choice == 2) {
			result = number1 - number2;
		}
		
		System.out.println(result);
	}

}
