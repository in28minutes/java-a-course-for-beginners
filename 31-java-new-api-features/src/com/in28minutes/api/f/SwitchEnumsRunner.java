package com.in28minutes.api.f;

import java.time.DayOfWeek;

public class SwitchEnumsRunner {

	public static void main(String[] args) {
		
		DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
		
		String str = switch(dayOfWeek) {
		case MONDAY -> "First Day Of the work week!";
		case TUESDAY, WEDNESDAY, THURSDAY -> "Middle Of the Work Week";
		case FRIDAY -> "Last Day of the work week!";
		case SATURDAY, SUNDAY -> "Weekend";
		};
		
		System.out.println(str);

	}

}
