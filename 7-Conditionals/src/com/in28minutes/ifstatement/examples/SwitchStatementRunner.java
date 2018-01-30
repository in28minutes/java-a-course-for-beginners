package com.in28minutes.ifstatement.examples;

public class SwitchStatementRunner {
	public static void main(String[] args) {

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
		/*switch(l){//COMPILER ERROR. Not allowed.
		}*/
	}

	private static void puzzle6() {
		//Should be constant.
		//Cannot have a Condition
	}

	private static void puzzle7() {
	}

	private static void puzzle8() {
	}

	private static void puzzle9() {
	}

	private static void puzzle10() {
	}

}
