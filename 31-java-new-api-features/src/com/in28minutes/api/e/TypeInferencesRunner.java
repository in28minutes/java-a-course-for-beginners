package com.in28minutes.api.e;

import java.util.List;
import java.util.stream.Stream;

public class TypeInferencesRunner {
	
	public static void main(String[] args) {
		var names1 = List.of("Ranga", "Ravi");
		var names2 = List.of("John", "Adam");
		var var = "";
		
		final var names = List.of(names1,names2);
		
		names.stream().forEach(System.out::println);
		
		for(var name:names1)
			System.out.println(name);
		
		var filter = List.of("Ranga", "Ravi").stream().filter(s -> s.length()<5);
		filter.forEach(System.out::println);
		
		
		
	}

}
