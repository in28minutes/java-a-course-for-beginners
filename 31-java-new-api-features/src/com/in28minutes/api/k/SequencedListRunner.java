package com.in28minutes.api.k;

import java.util.ArrayList;

public class SequencedListRunner {
	public static void main(String[] args) {
		var courseDetails = new ArrayList<>();
		courseDetails.add("Spring Security");

		courseDetails.addFirst("Spring Boot");
		courseDetails.addLast("Spring Boot in AI");
		
		
		courseDetails.add("Cloud Computing with AWS");
		courseDetails.add("Cloud Computing with Azure");
		


		System.out.println("Remove First Element:: " + courseDetails.removeFirst());
		System.out.println("Remove Last Element:: " + courseDetails.removeLast());
		
		
		System.out.println("List:: "+courseDetails);

		System.out.println("First Element:: " + courseDetails.getFirst());
		System.out.println("Last Element:: " + courseDetails.getLast());


		var reverseCourseDetails = courseDetails.reversed();
		System.out.println("Reversed List:: "+reverseCourseDetails);
	}

}
