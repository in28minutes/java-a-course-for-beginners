package com.in28minutes.ifstatement.examples;

public class SwitchExercisesRunner {

	public static void main(String[] args) {
		System.out.println(isWeekDay(5));
	}

	public static boolean isWeekDay(int dayNumber) {
		switch(dayNumber) {
		//case 0 :
		//case 6 : return false;
		case 1 : 
		case 2 :
		case 3 :
		case 4 :
		case 5 : return true;
		}

		return false;
	}
	
	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		}

		return "Invalid_day";
	}
}
