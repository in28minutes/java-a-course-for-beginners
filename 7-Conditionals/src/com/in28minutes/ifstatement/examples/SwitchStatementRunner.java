package com.in28minutes.ifstatement.examples;

public class SwitchStatementRunner {
	public static void main(String[] args) {
		puzzle4();
	}

	private static void puzzle1() {
		int number = 2;
		switch (number) {
		case 1:
			System.out.println(1);
		case 2:
			System.out.println(2);
		case 3:
			System.out.println(3);
		default:
			System.out.println("Default");
		}
	}

	private static void puzzle2() {
		int number = 2;
		switch (number) {
		case 1:
			System.out.println(1);
			break;
		case 2:
		case 3:
			System.out.println("Number is 2 or 3");
			break;
		default:
			System.out.println("Default");
			break;
		}
	}

	private static void puzzle3() {
		int number = 10;
		switch (number) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("Default");
			break;
		}
	}

	private static void puzzle4() {
		int number = 10;
		switch (number) {
		default:
			System.out.println("Default");
			break;
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		}
	}

	private static void puzzle5() {
		long l = 15;
		/*switch(l){
		
		}*/
	}

	private static void puzzle6() {
		int number = 10;
		int i = number * 2;
		switch (number) {
		 //case number>5: System.out.println("number>5");
		}
	}

}
