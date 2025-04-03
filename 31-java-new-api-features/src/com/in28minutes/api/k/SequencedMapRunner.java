package com.in28minutes.api.k;

import java.util.LinkedHashMap;

public class SequencedMapRunner {
	public static void main(String[] args) {
		
		var courseDetails = new LinkedHashMap<>();
		courseDetails.put(1, "Spring");
		courseDetails.put(2, "Spring Boot");
		courseDetails.put(3, "Spring AI");
		System.out.println("Map::" + courseDetails);        

		System.out.println("Adding Elements");
		courseDetails.putFirst(10, "Spring Security");
		courseDetails.putLast(20, "Spring Cloud");
		System.out.println("Map::" + courseDetails);
		System.out.println("First Entry:: " + courseDetails.firstEntry());
		System.out.println("Last Entry:: " + courseDetails.lastEntry());
		System.out.println("First Entry:: " + courseDetails.firstEntry());
		System.out.println("Last Entry:: " + courseDetails.lastEntry());
		
		System.out.println("sequencedKeySet:: " + courseDetails.sequencedKeySet());
		System.out.println("sequencedValues:: " + courseDetails.sequencedValues());
		System.out.println("sequencedEntrySet:: " + courseDetails.sequencedEntrySet());

		System.out.println("First Poll Entry:: " + courseDetails.pollFirstEntry());
		System.out.println("Map::" + courseDetails);
		System.out.println("Last Poll Entry:: " + courseDetails.pollLastEntry());
		System.out.println("Map::" + courseDetails);

		System.out.println("Reversed:: " + courseDetails.reversed());
		System.out.println("Map::" + courseDetails);
		
	}

}
