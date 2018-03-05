package com.in28minutes.concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();
		
		String str = "ABCD ABCD ABCD";

		for(char character:str.toCharArray()) {
			occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
		}
		
		System.out.println(occurances);
				

	}

	/*
	 		Map<Character, LongAdder> occurances = new Hashtable<>();
		
		String str = "ABCD ABCD ABCD";
		for(char character:str.toCharArray()) {
			LongAdder longAdder = occurances.get(character);
			if(longAdder == null) {
				longAdder = new LongAdder();
			}
			longAdder.increment();
			occurances.put(character, longAdder);
		}
		
		System.out.println(occurances);

	 */
}
