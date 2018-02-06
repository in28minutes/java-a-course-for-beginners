# Big Picture - Thinking Objects
- We are used to thinking about things in the real world perspective. When we think about a flight that I would need to take from Hyderabad to NewYork, I would start thinking about what are all things that are involved! Tickets, Airport, Airlines, Check-In Counter, Flights, Passengers, AirHostess etc!
- We think a little differently when we used to design structured programs with C or Pascal. We think about things that we need to do, the data that we need to them and organize them into methods. Focus is on identifying the methods.
    
    //Thinking in terms of structured programming - methods
    fly() {

      //All data is here
      
      travelToAirport();
      findCheckInCounter();
      checkIn();
      passSecurityCheck();
      waitForBoardingCall();
      boardTheFlight();
      wishTheAirHostess();
      takeOff();
      haveFun();
      landing();
    }

  - Object Oriented Programming 
    - You start thinking in terms of objects

    CabService
        bookCab()
    
    Cab
        on()
        off()
        drive()
        reverse()
    
    SecurityCheck
      execute()
    

# Aim
Build a Motor Bike class with capabilities to adjust speed and gears.  We would want to create two objects honda and ducati and play with them. 
- Understand concepts of Class, Object, State, Behavior

Person is a class. Mahatma Gandhi and Nelson Madela are instances of a Class - objects.

- Concepts
  - Object Oriented Program is a bunch of objects sending messages to each other.
  - Important Concepts are Object, Class, State (How do we represent state?) and Behavior
  - Object
    - Has a Type or Class
    - Made up of other objects
    - Has an interface
      - Defines what messages it can receive 

> Instead of Bike, directly create MotorBike.

> Create seperate Runner classes where possible.

\com\in28minutes\program1\Planet.java
```
package com.in28minutes.program1;

//Question Answered : What is Class? What is Object?

public class Planet 
{
	// name
	// distance from sun

	public static void main(String[] args) {
		Planet earth = new Planet();
		Planet mars = new Planet();
		Planet venus = new Planet();
	}
}

public class MotorBike {

}

MotorBike ducati = new MotorBike();
MotorBike honda = new MotorBike();

Exercises 
- Create another instance of Planet.
- Create another instance of MotorBike.
- Create a new class called Book and create three instances
	- Art Of Computer Programming
	- Effective Java
	- Clean Code

```
\com\in28minutes\program2\Aeroplane.java
```
package com.in28minutes.program2;

//Learning : What is state of object? Each object has individual State.

public class Aeroplane {

	int currentSpeed;

	public static void main(String[] args) {
		Aeroplane aeroplane1 = new Aeroplane();
		aeroplane1.currentSpeed = 500;

		Aeroplane aeroplane2 = new Aeroplane();
		aeroplane2.currentSpeed = 0;

		Aeroplane aeroplane3 = new Aeroplane();
		aeroplane3.currentSpeed = 600;

		aeroplane2.currentSpeed = 300;
	}
}

// int currentSpeed

// Exercise 1 -> Create another instance of Aeroplane.
// Exercise 2 -> Change the speed of aeroplane3 to 1000?
- Create a new attribute name for a  Book and create three instances with right names.
// Debug and see the values
// We are breaking a few good programming principles!!!

```
\com\in28minutes\program3\Bike.java
```
package com.in28minutes.program3;

//Learning : What is state of object? Each object has individual State.
//Learning : We use methods to change state of object. Behavior.
public class Bike {
	int currentSpeed;

	void increaseSpeed() {
		currentSpeed = currentSpeed + 10;
	}

	public static void main(String[] args) {
		Bike bike1 = new Bike();
		bike1.currentSpeed = 500;

		Bike bike2 = new Bike();
		bike2.currentSpeed = 600;

		bike1.increaseSpeed();

		bike2.increaseSpeed();
	}
}

// Focus on Assignment Operator
// What is void?
// Debug and see the values
// We are breaking a few good programming principles!!!
// Exercise 1 -> Create a new method in bike to decrease speed.
// We are going a little slow
```
\com\in28minutes\program4\MotorBike.java
```
package com.in28minutes.program4;

//Learning : Creating this class from scratch. From Zero
//Learning : Creating more methods and more variables 
//Learning : Print current state of an object
public class MotorBike {
	int currentSpeed;
	int currentGear;

	void increaseSpeed() {
		currentSpeed = currentSpeed + 10;
	}

	void decreaseSpeed() {
		currentSpeed = currentSpeed - 10;
	}

	void nextGear() {
		currentGear = currentGear + 1;
	}

	@Override
	public String toString() {
		return "MotorBike [currentSpeed=" + currentSpeed + ", currentGear=" + currentGear + "]";
	}

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		ducati.currentSpeed = 500;

		MotorBike honda = new MotorBike();
		honda.currentSpeed = 600;

		ducati.increaseSpeed();
		honda.increaseSpeed();
		ducati.nextGear();
		System.out.println(ducati);
	}

}

// Debug and see the values
// We are breaking a few good programming principles!!!
// State of an object should be changed only by a method on the object
// We do not have limits on Speed or Gears!!! We will get there soon!
// Exercise 1 -> Create the prevGear method
```
\com\in28minutes\program5\MotorBike.java
```
package com.in28minutes.program5;

//Learning : Special Method => Constructor
//Learning : Better Encapsulation
public class MotorBike {
	int currentSpeed;
	int currentGear;

	public MotorBike(int currentSpeed) {
		// currentSpeed is called parameter
		// this is a special reference variable to access
		// values from current object
		this.currentSpeed = currentSpeed;
	}

	void increaseSpeed() {
		currentSpeed = currentSpeed + 10;
	}

	void decreaseSpeed() {
		currentSpeed = currentSpeed - 10;
	}

	void nextGear() {
		currentGear = currentGear + 1;
	}

	void prevGear() {
		currentGear = currentGear - 1;
	}

	@Override
	public String toString() {
		return "MotorBike [currentSpeed=" + currentSpeed + ", currentGear=" + currentGear + "]";
	}

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(500);
		MotorBike honda = new MotorBike(600);
		ducati.increaseSpeed();
		honda.increaseSpeed();
	}
}

// How is constructor different from a normal method?
// Default value for a object member variable
// This is the first program that we created with good encapsulation!
// There are still minor things that need to fixed! We will discuss them next!
// add 500 to line 30 and show how eclipse can do magic
// Exercise 1 -> Create a constructor with both current speed and current gear!
// Exercise 2 -> Enhance earlier examples with constructors and use them!
```
\com\in28minutes\program6\MotorBike.java
```
package com.in28minutes.program6;

public class MotorBike {
	int currentSpeed;
	int currentGear;

	public MotorBike(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	void increaseSpeed() {
		currentSpeed = currentSpeed + 10;
	}

	void decreaseSpeed() {
		currentSpeed = currentSpeed - 10;
	}

	void nextGear() {
		currentGear = currentGear + 1;
	}

	void prevGear() {
		currentGear = currentGear - 1;
	}

	@Override
	public String toString() {
		return "MotorBike [currentSpeed=" + currentSpeed + ", currentGear=" + currentGear + "]";
	}

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(500);
		MotorBike honda = new MotorBike(600);
		ducati.increaseSpeed();
		honda.increaseSpeed();
		ducati.currentSpeed = ducati.currentSpeed + 10;
	}
}
```

- Make int private
//Introduce If Condition
- Minimum Speed
- Maximum Speed
- Maximum Gear
- Minimum Gear
- Parameterize Constructor with maximum speed, minimum speed, maximum gear, minimum gear

Revise all important concepts
- Object
- Class
- State
- Behavior
- Encapsulation
- Constructors

Puzzles

- Primitives vs Reference Variables
   - comparison
   - initialization
   - null