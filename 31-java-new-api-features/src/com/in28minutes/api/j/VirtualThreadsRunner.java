package com.in28minutes.api.j;

public class VirtualThreadsRunner {

	public static void main(String[] args) {
		
		for (int i = 0; i < 1_000_000; i++) {
			System.out.println(i);
			//new Thread(new SleepingThread()).start();
			Thread.startVirtualThread(new SleepingThread());
			//Thread.ofVirtual().start(new SleepingThread());
		}

	}
}
