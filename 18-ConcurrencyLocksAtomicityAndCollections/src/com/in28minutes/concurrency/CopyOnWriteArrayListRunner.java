package com.in28minutes.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {
	
	//add - copy
	//get

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		
		//Threads - 3
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");
		
		//Threads - 10000
		for(String element:list) {
			System.out.println(element);
		}
		
		// TODO Auto-generated method stub

	}

}
