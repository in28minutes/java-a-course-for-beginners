## I Love Programming
- Fun
- Solving Problems


## Learning Programming
- Problem Solving Skills
- Concepts
- Language Specifics

## JShell

- Java REPL Read Eval Print Loop
- Type in one line of code (or multiple) and see output
- Makes learning Fun
- Introduced in Java 9

## Concepts
- JShell
- Statements
- Expressions
- Variables
- Literals
- If Statement
- For Loop
- Method/Function

## Multiplication Table
```
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
```
## Multiplication Table - Step By Step
- How to break it down?
- Where do we start?
- Calculate 5 * 5
- Print 5 * 5 = 25
- Do this 10 Times

## Naming a Variable/Method
- Combination of letters, numbers, $ and under-score(_)
- Cannot start with a number
- Cannot be a keyword
- No limit on length of identifier
- CamelCase

## Variables Types
- byte  b = 5;             //8  bits - 128 to 127
- short   s = 128;         //16 bits - 32,768 to 32,767 
- int     i = 40000;      //32 bits -  2,147,483,648 to 2,147,483,647
- long  l = 222222222; //64 bits -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
- float   f = 4.0f;          //32 bits NOT VERY PRECISE - don’t use for financials
- double  d = 67.0; //64 bits NOT VERY PRECISE - don’t use for financials
- char  c = 'A';             //16 bits '\u0000' to '\uffff'
- boolean isTrue = false;  //true or false

## Launch JShell

JShell
- [x] Java REPL Read Eval Print Loop
- [x] Type in one line of code (or multiple) and see output
- [x] Makes learning Fun
- [x] Introduced in Java 9

# What is Programming all about?

I Love Programming
- [x] Fun
- [x] Solving Problems

Why do you think I love programming? Because I think programming is a lot of fun. I love solving problems and I love having fun. And the combination is awesome.

In this course, we would want to help you to develop a love for programming. If you had bad experiences in learning programming earlier, forget about them. 
Start fresh and I promise - This will be an awesome roller coaster ride! 

Let's take a step back and think what are the important things that you would want to learn to be a great programmer

Learning Programming
- [x] Problem Solving Skills
- [x] Concepts
- [x] Language Specifics

As a programmer, you want to solve problems. You want to be able to get the computer to do things for you. To be able to do that you need problem solving skills. You would need to be able to look a problem and identify the approach to solve it - How to break the problem down? Which programming concepts to use? How to express them in the language you've chosen?

There are Three parts to learning programming
- Concepts - Programming Concepts like variables, methods, OOPS etc
- Syntax - Understanding programming constructs
- Solving Problems - Breaking them into sub problems and working towards a solution

While all this looks complex, we will make it easy for you by solving a variety of challenges. We will start with basic challenges like multiplication table and increase the difficulty level during the course.

Our focus in this course is on two things a)Have Fun b)Solve Problems.

First steps with programming are the most difficult ones. Its like learning to ride a bicycle. The learning curve is steep initially. Once you get hang of it, it becomes easier.

We would want to give you a holding hand during the initial stages of the course so that you make less mistakes and have help to fall back on if you have problems
- Attached is a 50(XXXXX) page pdf with this lecture. You can use that as a reference if you are unable to get something working.

## First Challenge

Our first challenge is to get the computer to print a multiplication table for us. Over the course of next few steps, we will work our way towards a simple multiplication program. 

```
for(int i=1;i<=10;i++) 
	System.out.printf("%d * %d = %d", 5 , i , 5 * i ).println();
```

```
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
```

At the end of these few steps, you will be able to write a simple program to do this and hopefully understand most parts of it!

Over the next few steps, you will learn 
- JShell
- statements
- expressions
- variables
- literals
- conditions
- if statement
- for loop
- methods or functions

## Launching JShell

Launch JShell

/exit to exit

Relaunch

## Multiplication Table - Step By Step
- [x] How to break it down?
- [x] Where do we start?
- [x] Calculate 5 * 5
- [x] Print 5 * 5 = 25
- [ ] Do this 10 Times

## First Java Expression

Next few videos, we assume that you are a beginner to programming. i.e. You wrote zero programs before! If you have a little bit of experience, you might find this a little slow but I'm sure with a little bit of patience you would love this. 


Let's get the computer to do a few calculations for us to get started.

> 10 + 5
15

> 10 * 5
50

> 10 - 5
5

> 10 - 5 * 2 //Think about this!

5

Terminology - operand, operator, literal
Numeric Operators -> + - / * /
What we are using are expressions to perform operations on numbers. +, *, - are operators.  The numbers are called Literals.

What we are using here is JShell.

A few puzzles
- 1 + 2 //Notice the spaces - Programming Languages do not worry about spaces - for the most part!
- 1+2//No spaces
- 5/2
- 5*2 + 2

Exercise
- Write an expression to calculate number of minutes in a day.
- Write an expression to calculate number of seconds in a day.

## More Operators and Precedence
- 1 + 5 * 2
- 5 % 2
- 5 / 2

Puzzles
- Basic Precedence of Operators * / > + - 
- Print a few complex expressions and see if you can work out how they work
- Use operator % 


## Printing output

Computer's cannot understand Human Languages. Computers have languages of their own - You are learn Java - which is one of the computer programming languages. For computers to understand you, we need to start understanding these programming languages. 

You can adjust the playspeed of the video if I'm speaking too fast. Look at the interface for the video player and you should find a speed icon!

How to write code to print something on the console or the output?

```
System.out.println("Welcome to Programming World");
```

Programming languages speak a different language - Rules are complex. These rules are called Syntax. Programming Languages don't like it when you don't follow the syntax. It's like your strict natural language instructor.

What can go wrong?
- JShell
- Case of the letters - Upper case and lower case
- Double Quotes
- Syntax of method - round brackets ()

Statement - An instruction to the computer. We instructed Java to print a text and it printed it.

Congratulations!

There are things we did not understand during our first statement. We will understand them now!

> Tip 1 - Using Arrows

### Method Call
System.out.println("Welcome to Programming World")
- This is a method call. We are calling a method. The syntax to call a method is method_name(value)
- In this example
	- method_name is System.out.println
	- value we want to print is "Welcome to Programming World"
- System.out.println is an inbuilt method provide by Java. It prints the value passed to it to the console i.e. the screen in JShell!

### Double Quotes
Any thing in double quote is considered as text. This is called a String Literal.

System.out.println(Welcome to Programming World)

System.out.println("Welcome to Programming World")

Puzzles
- Different Case - System.out.println("welcome to programming world")

Exercises
- Print "Hello World"
- Print "5 * 3"

## Text vs Expression

Let's make the computer do a few calculations for us.

System.out.println("5 * 6");//Doesn't work

System.out.println(5 * 6);//30 

Anything between quotes is taken as is. It is not computed. 

System.out.println(5 + 6);
System.out.println(5 - 6);
System.out.println(5 / 6); // Why is this Zero? Later

Awesome isn't it? We have the computer doing some work for us. That's what programmers are supposed to do. Get the computer to do something useful for us.

Do you know? 
- You have successfully executed more than 10 Java Statements in a very short span of time. That's because of the magic of a new Java 9 Feature - JShell.  Without JShell, getting started would've been more difficult

Tip
- Programming is all about understand what, why and how of what we do. It is not sufficient to say it works. You should be able to explain How it works? Why it works? To do this, start questioning everything. I mean E V E R Y T H I N G!


Exercise
- Try to print a simple math table executing individual statements
  	- System.out.println(5 * 1)
  	- System.out.println(5 * 2)
  	- System.out.println(5 * 3)

## More advanced System.out.println

I want to print 5 table in this format 
5 * 1 = 5

We have to write - System.out.println("5 * 1 = 5")

This is not fun. Computer is not calculating it for us! How to get it to calculate and print the value for us?

We will use a new function printf.

However printf has a few constraints
- System.out.printf("5 * 1 = 5") //No new line
- System.out.printf("5 * 1 = 5") //It returns a value
- System.out.printf("5 * 1 = 5").println() //Avoids all complication around it - This is called chaining of calls. Don't worry about it for now!

You can ask - why are we using printf? Because, it has an additional feature.

System.out.printf("5 * 1 = %d", 5 * 1).println();
System.out.printf("5 * 2 = %d", 5 * 2).println();

Now we got the computer do some calculations for us! That's cool.

Each of the values we send to printf are called parameters.

How about replacing the other things in the String (Any text within quotes is called a String) with a variable too?
System.out.printf("%d %d %d", 1 , 2 , 3 ).println();

System.out.printf("%d * %d = %d", 5 , 6 , 5 * 6 ).println();
System.out.printf("%d * %d = %d", 5 , 7 , 5 * 7 ).println();

Let's do a quick review
- In built method
- Literal
- Passing Parameters

Exercise
- Adding three numbers 5 + 6 + 7 = 18

## Variables

Our end objective is to print the complete 5 tables. We need to execute 10 statements to get this done right now.

System.out.printf("%d * %d = %d", 5 , 1 , 5 * 1 ).println();
...
System.out.printf("%d * %d = %d", 5 , 6 , 5 * 6 ).println();
...
...
System.out.printf("%d * %d = %d", 5 , 7 , 5 * 7 ).println();

How do we make this even simpler. Think what is changing between each of these statements.

Each time I want to print a new table value, I have to change the constants/literals being passed.

Can we avoid it? 

Welcome variables!

5, 6, 7 are constants (literals). Their values will not change. 

Variables are those thing whose values can change during the execution of a program!

Variables have a name, type and value.

Name gives us a way to refer to the variable.

Java is a Strongly Typed Language. That means, you need to tell Java what kind of values you want to store in the variable.

There are two types of literals we looked at until now
- Strings - "Welcome to Programming"
- Numbers - Specifically integers - 5 , 6, 7

Before creating a variable, I need to tell Java what kind of values a variable will store. For now, lets now create a number variable.

int i = 0;

Declaration is give a variable a name and type.

Think about this 
- name of variable is i
- type of variable is int. int stands for integer. integer can hold a wide range of numbers.
- the initial value of i is 0

> In the background a memory location is allocated to the variable. Value 0 is stored in the memory location.

i = 6; //This is called assignment. 

We are changing the value in the memory location to 6. The way we look at assignment should be different from the way we look at is equal to in mathemetics. We will discuss this in depth later. For now, the value on the right hand side gets copied to the variable on the left hand side.

System.out.printf("%d * %d = %d", 5 , 6 , 5 * 6 ).println();

Let's use i in the above printf.

jshell> System.out.printf("%d * %d = %d", 5 , i , 5 * i ).println();
5 * 6 = 30

jshell> i = 7
i ==> 7

jshell> System.out.printf("%d * %d = %d", 5 , i , 5 * i ).println();
5 * 7 = 35

Isn't this fun! We have made the same line of code do different things based on the value of the variable. The value of a variable can change from time to time and the statement prints the multiple of 5 based on the value of the variable.

Puzzles
- Try using variables without declaring them
  - j = 2;
- Try using undeclared variables in expressions
- Try using un initialized variables in expressions
- Try assigning a character value to an integer variable

Exercises
- Create three variables a,b,c and create a statement for printing sum of three variables
- Think - How can you print the 5 table from 1 to 10 right now?

## Variables in Depth
- [x] Variables & Memory
- [x] Naming a Variable
- [x] Variable Types
- [x] Assignment Operators


## Assignment in Depth

int goals = 0;

What happens in the background? Think about it.

goals = 2;
This is not the same as 
2 = goals;

Why? 

This is not mathematics.

Important thing to understand is that you need to have a identifier on the Left Hand Side.

goals = 5;

Let's now create a couple of variables

int firstNumber = 5;
int secondNumber = 6;

firstNumber = secondNumber; 

What would happen?

firstNumber = 5;

secondNumber = 6;

How do you calculate the sum and assign it to a variable sum?

int number = 5;

number = number + 1; //What does this do?
number++; //what does this do?

number = number - 1; //What does this do?
number--;

Puzzles
- Compound Assignment Operators
  - Examples : +=, -=, *= 

```
int a = 5;
a += 5; //similar to a = a + 5;
a *= 10;//similar to a = a * 10;
a -= 5;//similar to a = a - 5;
a /= 5;//similar to a = a / 5;
```

Exercise
- Create three variables thirdNumber, fourthNumber and fifthNumber. Assign 3 values to these variables. Calculate sum of these three numbers and assign it to sumOfThreeNumbers variable.
- Have a variable to contain the number of days. Use it to calculate the total number of hours and total number of seconds in those days.

## Naming Variables

Name given to a variable is called an identifier. Typically we use camel case for variable names in Java. First letter would be smaller case.

int numberOfGoals = 2;
int successfulAttempts = 1;
int failedAttempts = 5;

Programmers like rules. Actually, we hate rules. Because, there are so many syntax rules that we need to adhere to, we hate rules outside.

Let's look at rules for legal Identifier Names
- Combination of letters, numbers, $ and under-score(_)
- Cannot start with a number
- Cannot be a keyword - we will talk about these later!
- No limit on length of identifier

int 1test = 5;
int test! = 5;

int Test = 5; //allowed but starting with capital letter not recommended for variable name

int test1, test2; //multiple variables of same type allowed but not considered best practice

Exercise
- Think of a few more valid identifier names and declare variables with those names
- Try to think of variable names not matching the rules and see what happens!

## Basic If Condition

- int team1Goals = 5;
- int team2Goals = 7;

Let's try and write a few conditions.

jshell> team1Goals > team2Goals
$47 ==> false

jshell> team1Goals < team2Goals
$48 ==> true

Let's try to conditionally execute statements.

jshell> if(true)
   ...>  System.out.println("Test");
Test

jshell> if(false)
   ...>  System.out.println("Test");

Syntax
if(condition)
	statement;

Let's now try to print 

jshell> if(team1Goals > team2Goals) 
   ...> System.out.println("Team 1 wins");

jshell> if(team2Goals > team1Goals) 
   ...> System.out.println("Team 2 wins");
Team 2 wins

Let's now to print which number is greater

jshell> int number1 = 6;
number1 ==> 6

jshell> int number2 = 7;
number2 ==> 7

jshell> if(number1 > number2)
   ...>   System.out.println("Number1 is greater than number2");

jshell> if(number1 >= number2)
   ...>   System.out.println("Number1 is greater than number2");

jshell> if(number2 > number1)
   ...>   System.out.println("Number2 is greater than number1");
Number2 is greater than number1

jshell> if(number2 >= number1)
   ...>   System.out.println("Number2 is greater than number1");
Number2 is greater than number1

Now change the values of number1 and number2 and execute the same statements.

Exercise
- [ ] Have four variables a,b,c,d and create an if statement to print if a + b is greater than c + d.
- [ ] Have three angles of a triangle stored in three variables angle1, angle2, angle3. Create an if statement to state if the three angles can form a triangle. Hint : angle1 + angle2 + angle3 = 180
- [ ] Have a variable called number. Create an if statement to find if it is even number. Hint : % operator.

We will return with a number of other variations of if - if else and logical operators later in the course.

## For Loop - Printing 5 Table from 1 to 10

This is not a lot of fun

int i = 0;

i = 1;
System.out.printf("%d * %d = %d", 5 , i , 5 * i ).println();

i = 2;
System.out.printf("%d * %d = %d", 5 , i , 5 * i ).println();

i = 3;
System.out.printf("%d * %d = %d", 5 , i , 5 * i ).println();

i = 4;
System.out.printf("%d * %d = %d", 5 , i , 5 * i ).println();

Can we do better?

int i = 0;
i = i + 1;
System.out.printf("%d * %d = %d", 5 , i , 5 * i ).println();

i = i + 1;
System.out.printf("%d * %d = %d", 5 , i , 5 * i ).println();

i = i + 1;
System.out.printf("%d * %d = %d", 5 , i , 5 * i ).println();

i = i + 1;
System.out.printf("%d * %d = %d", 5 , i , 5 * i ).println();

This is cool! Isn't it? We have got the same statements executing multiple times and we get desired result.

How do we execute same statement again and again and again?

What we want to be able to say is 

for the value of i from 1 to 10
	execute the statement - System.out.printf("%d * %d = %d", 5 , i , 5 * i ).println();

How do we do that? How do we repeat the same statement again and again 10 times? How do i use different values of i?

That's where loops come in

Syntax of a for loop is 

for(initialization;condition;update)
	statement;

Logic
- initialization - the initial value. We want to start from i = 1;
- update - we want to increment the value of i by 1 each time
- condition - we want to run i has a value of 10 

For Loop Example 1
```
for (int i = 0; i < 10; i++) {
    System.out.print(i);
}
//Output - 0123456789
```
Syntax - For loop statement has 3 parts
- Initialization => int i=0. Initialization happens the first time a for loop is run.
- Condition => i<10. Condition is checked every time before the loop is executed.
- Update (Increment or Decrement usually) => i++. Operation is invoked at the start of every loop (except for first time).


Code
- initialization - int i = 1
- increment - i = i + 1 or even better i++
- condition - i <= 10
- statement - System.out.printf("%d * %d = %d", 5 , i , 5 * i ).println();

for(initialization;condition;increment)
	statement;

Video Tip : What can possibly go wrong?
Pause and check the exact syntax on

Now we want to print our 5 table
for(int i = 1;i <= 10;i++)
	System.out.printf("%d * %d = %d", 5 , i , 5 * i ).println();

```
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
```

Video Tip : What can possibly go wrong?
Pause and check the exact syntax on

Congratulations on taking a big step in your programming career. You have written a for loop!

We will return with a number of other variations of for loop - if else and logical operators later in the course.

## Quick Revision of what we did until now
We have to do a lot of work to print the 5 table!
- Revision of all terminology
  - literal
  - variable
  - in built method
  - parameters
  - syntax
  - condition
  - if statement
  - for loop
  - block

Exercise
- Do the whole thing again for 7 table. Kill JShell. Kill Eclipse. Repeat. Rinse. Start Again. Good Luck.
- Print 6 and 10 Tables!
- Print numbers from 1 to 10
- Print numbers from 10 to 1
- Print squares of First 10 Numbers
- Print squares of First 10 Even Numbers
- Print squares of First 10 Odd Numbers