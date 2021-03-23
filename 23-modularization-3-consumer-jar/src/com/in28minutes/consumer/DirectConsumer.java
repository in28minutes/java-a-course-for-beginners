package com.in28minutes.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.in28minutes.sorting.algorithm.BubbleSort;

public class DirectConsumer {
	
	private static Logger logger = 
			Logger.getLogger(DirectConsumer.class.getName());
	
	public static void main(String[] args) {
		BubbleSort util = new BubbleSort();
		List<String> sorted 
			= util.sort(List.of("Ranga", "Ravi", "Sathish", "Adam","Eve"));
		logger.info(sorted.toString());
	}

}
