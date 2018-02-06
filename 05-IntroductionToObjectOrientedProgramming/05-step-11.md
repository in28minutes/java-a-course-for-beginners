<!---
Current Directory : /in28Minutes/git/java-a-course-for-beginners/5-IntroductionToObjectOrientedProgramming
-->

## Complete Code Example


### /entireoutput-constructor-puzzles.txt

```
Last login: Mon Jan 29 10:33:44 on ttys000
Rangas-MacBook-Pro:~ rangaraokaranam$ jshell
|  Welcome to JShell -- Version 9.0.1
|  For an introduction type: /help intro

jshell> class Cart {
   ...> };
|  created class Cart

jshell> Cart cart1 = new Cart();
cart1 ==> Cart@3f49dace

jshell> class Cart {
   ...>     Cart() {
   ...>     }
   ...> };
|  replaced class Cart
|    update replaced variable cart1, reset to null

jshell> Cart cart1 = new Cart();
cart1 ==> Cart@59494225

jshell> class Cart {
   ...>     Cart() {
   ...>         System.out.println("Constructor is called");
   ...>     }
   ...> }
|  modified class Cart

jshell> Cart cart1 = new Cart();
Constructor is called
cart1 ==> Cart@6e1567f1

jshell> 
```
---

### /src/com/in28minutes/oops/Book.java

```java
package com.in28minutes.oops;

public class Book {
	
	private int noOfCopies;

	public Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0)
			this.noOfCopies = noOfCopies;
	}

	public void increaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}

	public void decreaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}

}
```
---

### /src/com/in28minutes/oops/BookRunner.java

```java
package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		// Create a new class called Book 
		// Create three instances
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(50);
		Book cleanCode = new Book(40);
		
		artOfComputerProgramming.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(50);
		cleanCode.setNoOfCopies(45);
	}

}
```
---

### /src/com/in28minutes/oops/MotorBike.java

```java
package com.in28minutes.oops;

public class MotorBike {
	//state
	private int speed; //member variable
	
	MotorBike() {
		this(5);
	}
	
	MotorBike(int speed) {
		this.speed = speed;
	}
			
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed > 0 )
			this.speed = speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
	
	void start() {
		System.out.println("Bike Started");
	}
}
```
---

### /src/com/in28minutes/oops/MotorBikeRunner.java

```java
package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		
		MotorBike ducati = new MotorBike(100);
		
		MotorBike honda = new MotorBike(200);
		
		MotorBike somethingElse = new MotorBike();
		
		System.out.println(ducati.getSpeed());
		
		System.out.println(honda.getSpeed());
		
		System.out.println(somethingElse.getSpeed());

		
		ducati.start();

		honda.start();
		
		//ducati.setSpeed(100);
		
		ducati.increaseSpeed(100);
				
		honda.increaseSpeed(100);
		
		ducati.decreaseSpeed(250);
		
		honda.decreaseSpeed(250);
		
		System.out.println(ducati.getSpeed());
		
		System.out.println(honda.getSpeed());
	}

}

// Create a new class called Book 
// Create three instances
// Art Of Computer Programming
// Effective Java
// Clean Code
```
---
