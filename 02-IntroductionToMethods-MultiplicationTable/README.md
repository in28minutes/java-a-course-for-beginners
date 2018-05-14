# Breaking up Code into Methods

## Method Basics
- Print 5 Table
- Print 6 Table
> Isn't this too much work? Can we do this in an easier way?
- printMultiplicationTable(5);
- printMultiplicationTable(6);

Welcome to wonderful world of methods!

Let's start with a simple example to see why methods are needed. 

Let's say I want to print "Hello World" 2 times.

Basic Syntax 

ReturnType nameOfTheMethod() {
  //Body of the method
  //What do we want to do in the method?
}

- Method
   - Piece of code
   - Typically has a name!
   - Can have inputs
   - Can have output called return value

Notes
- ReturnType - What does the method return back? Some calculate value or nothing?
- nameOfTheMethod - should represent what the method does?
- Body of the method - Actual Logic

For printing hello world twice
- ReturnType - void - does not return anything. Isn't it so irresponsible?
- nameOfTheMethod - sayHelloWorldTwice
- Body of the Method - print Hello World twice

void sayHelloWorldTwice() {
     System.out.println("Hello World");
     System.out.println("Hello World");
 }
|  created method sayHelloWorldTwice()

> Do not worry about method vs function for now. Let's act as if they are both the same.

TIP - Creating a method does not execute it!

> Executing a method is called invocation or calling a method

sayHelloWorldTwice()
Hello World
Hello World

Congratulations Go and Celebrate!

Rules for Method Names are similar to that of variable names.

Exercises
- Create sayHelloWorldThrice() and execute it
- Create a method which prints four statements and execute it
  - I've created my first variable
  - I've created my first method
  - I've created my first loop
  - I'm excited to learn Java


## Important Tips regarding methods with JShell
- TIP - Methods are not saved in JShell - How to save?
- TIP - Editing a method in Jshell - Approach 2

## Method Arguments

Why do we need to create two different methods for sayHelloWorldTwice() and sayHelloWorldThrice()?  What if I need to sayHelloWorldFourTimes()?

> Banging my head!

sayHelloWorld(5), sayHelloWorld(2)

More Advanced Syntax 

ReturnType nameOfTheMethod(Type argumentName) {
  //Body of the method
  //What do we want to do in the method?
}

Notes
- Type argumentName - int numberOfTimes

void sayHelloWorld(int numberOfTimes) {
  System.out.println("Hello World");
}

void sayHelloWorld(int numberOfTimes) {
  System.out.println("Hello World");
  System.out.println(numberOfTimes);
}

void sayHelloWorld(int numberOfTimes) {
  for(int i=1; i<=numberOfTimes; i++)
    System.out.println("Hello World");
}

Exercises 
 - Create a method - printNumbers(int n) to print numbers from 1 to n!
 - Create a method - printSquaresOfNumbers(int n) to print squares of numbers from 1 to n!

Puzzles
  - sayHelloWorld()
  - sayHelloWorld("")
  - Parameters vs Arguments

## Getting back to the problem at hand

void printMultiplicationTable() {
    for(int i = 1;i <= 10;i++)
       System.out.printf("%d * %d = %d", 5 , i , 5 * i ).println();
}

void printMultiplicationTable(int number) {
    for(int i = 1;i <= 10;i++)
      System.out.printf("%d * %d = %d", number , i , number * i ).println();
}

Congratulations! You have achieved your aim of printing tables and making it more generic.


## Method - Multiple Parameters

Method to print Sum of two numbers

Exercises
- Method to print Sum of three numbers
- Given two angles, write a method to print The third angle in a triangle. Hint : Sum of angles in a triange is 180

Methods help us to organize code easily. So, they are very important part of programming. You can look at the name of the method and tell what it is doing. You do not need to read the code!

## Method - Return Value

- Syntax to return a value
- Sum of Two Numbers

What is advantage of a return value? Why should we always think of returning values from a method?

Exercises
-  Method to return Sum of three numbers
-  Given two angles, write a method to return the third angle in a triangle. Hint : Sum of angles in a triangle is 180. Think of what can go wrong with this method! Should we really use an int here?

## Revision of all terminology related to Methods
  - methods or method
     - defining, declaring
     - execution, calling, invoking
  - arguments or parameters
    - single 
    - multiple
  - return value
    - void
  - in built methods
    - Tip - Finding documentation using JShell
  
Congratulations!

# Introduction to Java Platform

Before JShell, you cannot execute a statement directly. You had to write a class -> compile it -> execute it. We will do the journey in this section and understand a little bit of what happens in the background when you install java and when your run java programs.

- Class
  - Compiling
  - Executing
- JDK
- JRE
- Platform Independence

## Introduction to Class and Objects

Before we can compile Java code, we need a class. 
- Class is a Template ex: Country
- Objects are instances of classes ex: India, USA, 
- Planet vs earth, mars, venus

In Java, all methods must be in a class. 
- Methods in JShell work a little different

class Planet {
}

Planet earth = new Planet();
Planet venus = new Planet();

Exercise
- Create a class Country and create two instances of your favorite countries

## Create a Method in a Class

class Planet {
            void revolve() {
                 System.out.println("Revolve");
            }
       }

- Create a class Country with a member method comingSoon() printing "Coming Soon!" to the console.

class Country {
          void comingSoon() {
             System.out.println("Coming Soon");
          }
       }


## Compiling a Java Class

## Executing Java Code outside JShell

## Understanding whats happening
  - Platform Independence

## Understanding what would you need to run what?
  - JDK vs JVM VS JRE
    - Computer understands 0 and 1.JVM converts Java Byte to 0's and 1's. Java Compiler converts Java Code into Byte Code.
  - Things you can do with Java
   * What happens in the background when we run the program?
   * Platform Independence  & JVM vs JRE vs JDK
   * How is stuff stored in memory? Pass by reference vs Pass by value?
- java & javac

# Using an IDE (Eclipse)


## Installing Eclipse

## Introduction to Eclipse

Hierarchy of WorkSpace > Project > Class > Method

Create and Run

## Editing Code with Eclipse

## Multiple Parameters for Multiplication Table

void printMultiplicationTable(int number) {
      for(int i = 1;i <= 10;i++)
          System.out.printf("%d * %d = %d", number , i , number * i).println();
      }

void printMultiplicationTable(int number, int from, int upto) {
      for(int i = from;i <= upto;i++)
   System.out.printf("%d * %d = %d", number , i , number * i).println();
      }

> This is called Method Overloading

## Programmers hate duplication!

We hate duplication of code. 

Think what is the problem with duplication of code?

void printMultiplicationTable(int number) {
  printMultiplicationTable(number, 1, 10);
}

void printMultiplicationTable(int number, int from, int upto) {
     for(int i = from;i <= upto;i++)
         System.out.printf("%d * %d = %d", number , i , number * i).println();
     }
}

Just like you can call System.out.printf, you call your own methods passing parameters.



## Debugging with Eclipse
- Debug above program with eclipse

- IDE vs JShell - which one to use!

# Eclipse IDE
- Tips
  - JShell vs Main method
    - Introduction to JShell
    - JShell prints the return value without asking!
  
## Program - Introduction to OOPS
- Concepts
    - A bunch of objects sending messages to each other.
  - Important Concepts are Object, Class, State (How do we represent state?) and Behavior
  - Object
    - Has a Type or Class
    - Made up of other objects
    - Has an interface
      - Defines what messages it can receive 
  - Basics of Encapsulation
  - Basics of Abstraction
- Approach
    - Move element by element to the method to introduce object oriented programming
    - Move logic step by step to OOPS approach!
- package
- java-course-2018-Introduction-To-OOPS.md
