package com.in28minutes.api.m;

import java.util.stream.Gatherers;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGathererRunner {
	
	private static void fold() {
		//1 to 20
		Stream<Integer> numbers = IntStream.rangeClosed(1, 20).boxed();
		
		numbers.gather(Gatherers.fold(()->0, 
						(sum,i)->sum+i))
			   .forEach(System.out::println);
		
	}

	private static void mapConcurrent() {
		//1 to 20
		Stream<Integer> numbers = IntStream.rangeClosed(1, 20).boxed();
		
		numbers.gather(Gatherers.mapConcurrent(20, 
						i -> i * i))
			   .forEach(System.out::println);
		
	}

	private static void windowFixed() {
		//1 to 20
		Stream<Integer> numbers = IntStream.rangeClosed(1, 20).boxed();
		
		numbers.gather(Gatherers.windowFixed(3))
			   .forEach(System.out::println);
		
	}

	private static void windowSliding() {
		//1 to 20
		Stream<Integer> numbers = IntStream.rangeClosed(1, 20).boxed();
		
		numbers.gather(Gatherers.windowSliding(3))
			   .forEach(System.out::println);
		
	}

	
	public static void main(String[] args) {
		windowSliding();
	
	}

}
