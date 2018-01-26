package com.in28minutes.firstjavaproject;

public class MultiplicationTable {
	
	void print() {
		print(5);
	}
	
	void print(int table) {
		print(table, 1, 10);
	}
	
	void print(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d X %d = %d", table, i, table * i).println();
		}
	}
}
