package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number%2 == 0;
	}
	
}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}
	
}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		return number * number;
	}
	
}

public class LambdaBehindTheScreensRunner {
	
	

	public static void main(String[] args) {

		List.of(23,43,34,45,36,48).stream()
		.filter(n -> n%2 ==0)
		.map(n -> n * n)
		.forEach(e -> System.out.println(e));

		List.of(23,43,34,45,36,48).stream()
		.filter(new EvenNumberPredicate())
		.map(new NumberSquareMapper())
		.forEach(new SystemOutConsumer());

		//.map(n -> n * n)
		//<R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// R apply(T t);
		
		//.filter(new EvenNumberPredicate())
		//Stream<T> filter(Predicate<? super T> predicate);
		//boolean test(T t);
		
		//.forEach(e -> System.out.println(e));
		//Consumer<? super T> action
		//void accept(T t);
		
		//1.Storing functions in variables
		//2.Passing functions to methods <=
		//3.Returning functions from methods
		
		Predicate<? super Integer> evenPredicate = createEvenPredicate();
		Predicate<? super Integer> oddPredicate = n -> n%2 ==1;
		
		List.of(23,43,34,45,36,48).stream()
				.filter(evenPredicate)
				.map(n -> n * n)
				.forEach(e -> System.out.println(e));
	}

	private static Predicate<? super Integer> createEvenPredicate() {
		return n -> n%2 ==0;
	}

}
