package com.in28minutes.api.j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceVirtualThreadsRunner {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
		
		for (int i = 0; i < 1_000_000; i++) {
			System.out.println(i);
			//Thread.startVirtualThread(new SleepingThread());
			executor.execute(new SleepingThread());
		}
		
		executor.shutdown();
		
	}
}
