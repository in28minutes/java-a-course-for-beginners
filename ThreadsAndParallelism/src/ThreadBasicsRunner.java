//extends Thread
//implements Runnable

class Task1 extends Thread {
	
	public void run() { //SIGNATURE
		System.out.print("\nTask1 Started");
		
		for(int i=101;i<=199; i++) 
			System.out.print(i + " ");
		
		System.out.print("\nTask1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.print("\nTask2 Started");
		
		for(int i=201;i<=299; i++) 
			System.out.print(i + " ");
		
		System.out.print("\nTask2 Done");
		
		
	}
	
}


public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {

		//• NEW;
		//• RUNNABLE;
		//• RUNNING;
		//• BLOCKED/WAITING;
		//• TERMINATED/DEAD;
		
		//Task1 - 101 to 199
		System.out.print("\nTask1 Kicked Off");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start(); //task1.run();
		
		System.out.print("\nTask2 Kicked Off");
		
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();	
	
		task1.join();
		task2Thread.join();
		
		System.out.print("\nTask3 Kicked Off");
		
		//Task3
		for(int i=301;i<=399; i++) 
			System.out.print(i + " ");
		
		System.out.print("\nTask3 Done");
		
		System.out.print("\nMain Done");
	}
}
