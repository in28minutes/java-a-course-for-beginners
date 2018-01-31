## Playing with Conditionals
Designing a menu
- Accepting input from user
- Puzzles 
  - IfStatementTest, SwitchStatementTest, 
  - if, if/else
      - is n a leap year?
      - Sum of digits for a 2 digit number
      - Sum of digits for a 3 digit number
      - Is it a good triangle? With sides. Length of two sides should always be greater than the third side.
- Approach
  - Getting input from user
  - Start with 2 menu options
  //if 1 followed by //if 2
  - Use if else  - Add options 3, 4, 5
  - Use Switch
- Exercises
  - Find Larger Number of two numbers input by user
  - Largest of three numbers input by user
  - introduce Math class and check out the API
  - Blocks of Code
  - Switch
    - public String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
    - switch (month) case 1: result = "January";
    - switch (month)
      - case 1: System.out.println("January"); break;
      - case 2: System.out.println("February"); break;
    - switch (day)
        - case 0: System.out.print("Sunday"); break;
        - case 1: System.out.print("Monday"); break;
  - Comments
  - How are objects stored in memory? Reference vs Primitives?

## A Quick Whirl wind Tour of Java Features

# Fundamentals of Java Platform with Small Examples

Overview
  - Choosing Variable Types
  - Operators

Details
- Introduce all integer data types and floating point data types
  - Data Types & Literals
    - Number (all int types), Boolean
  - All data types
    -  double,  float
  - Range of Data Types
  - Playing with Booleans
    - Basic comparisons
    - == vs =
    - Storing them into a variable
    - Using them in If statements
    - Boolean Operators
- Return values from method
- Introduce String class and basic methods
  - Adding numbers vs Adding Strings
    - STring + Number
    - "SomeString".length
  - String is a class in its own right!
- Operators
- Keywords

## Playing with Loops - With Small Examples
-  Is a number Prime? Hint : 5 => true, 7 => true, 11 => true, 6 => false
-  Sum of numbers upto n? 1 + 2 + 3 + 4 + 5 + 6

- For Loop
  - Method to Print odd numbers from 1 to 100
  - Method to Print even numbers from 1 to 100
  - Print all prime numbers upto n
- While Loop
  - Print all squares of numbers less than 100.
  - Print all cubes of numbers less than 100.
Exercise
  - loop in loop
    - Print this loop
        - 1
        - 1 2
        - 1 2 3
        - 1 2 3 4 
        - 1 2 3 4 5
- Check out these test files - DoWhileLoopTest, WhileLoopTest, ForLoopTest, Enhanced For Loop Test
- Loops deep dive
  - Sum of digits for a number
  - Reverse a Number
  - Sum of divisors
  - Perfect Number - A positive integer is called a perfect number if it is equal to the sum of all of its positive divisors, excluding itself. For example, 6 is the first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1.  Find all the four perfect numbers less than 10,000.
- Do While 
   - do{System.out.print("Do you want to play again (yes/no)? "); playAgain = usersConsole.nextLine();
   - } while ("yes".equals(playAgain));
    - Accepting a Menu from a User
      - 1 - action1
      - 2 - action2
      - 3 - action3
      - 4 - action4
      - 5 - quit
- While, Do While and For Loop
  - Count 1 to 100
  - Count 100 to 1

# Playing with Arrays
- Arrays 
  - Why do we need an Array?
  - sum of elements, max of elements, Print array backwards, delete an element from an array! Add an element to an array.
  - Tips and Tricks - arrayoutofbounds, default values in array - new int[5];, Arrays.fill, Sort an array
  - String is a Char Arrays
    - find first char of an array
- Programs
  - Student
    - ExamScore
      - subject
      - marks
  - Array of student scores and all the operations (sum, min, max, average) on them.
- Array of Objects
   - String name;
   - int grade;
   - Student[] students = new Student[4];
- Return Type Array from a method
  - Multiply all numbers in an array by 10
  - Double every element in an array
  - Sum of all even numbers in an array
  - Count of odd numbers in an array
  - Search an array for an element
  - Remove element from array
  - Remove duplicates in a sorted array
  - Merge two sorted arrays
  - Count of a specific character in a String - Char Array
  - 2 D Array and 2 D loops
- Enhanced For Loop

Enhanced for loop can be used to loop around array's or List's.
```
int[] numbers = {1,2,3,4,5};

for(int number:numbers){
    System.out.print(number);
}
//Output - 12345

## A Simple Project To Test our Learning

Generate an addition quiz of 10 questions at random. Ask the questions and evaluate the quizzer.

# Playing with Text and Arrays

- From Java 6, String can be used as the switch argument.

Aim - Introduce String, String methods, Char and Arrays
- Cryptographic Program to Split a Sentence into individual words, swap first and last characters of each sentence and reverse the string. 
   - Exercise to write the decrypting logic

Topics and Examples to Cover (also look at Java Cheat Sheet)
- String
 - Array of Characters
    - Find unique vowels in a String
    - Find repeating vowels in a String
    - Find number of vowels in a String
    - First Character
    - Last Character
    - REverse a Name
    - Remove a Specific Character
    - display lower case characters
        - for(char ch='a';ch<='z';ch++){ System.out.print(ch + " ");}
    - display upper case characters
    - Copy every character K times
    - Reverse each word in a String
- Char 
  - Print All ascii chars from 1 to 256 and have some fun with it..
    - Switch with Char
        - Is a Vowel or Not - create a switch statement testing for A, E, I, O, U
  - calculateGrade
   - char mySymbol = '\u00AE';
   - System.out.println("mySymbol = " + mySymbol);
    - (Find the Unicode of a character) Write a program that receives a character and displays its Unicode.
    - Generate a random alphabet
      - Capital Alphabet
      - Small Alphabet

- Switch
  - Switch with Strings


Exercise
- public class Fan (Has different data types)
  - private int speed;
  - private boolean isOn;
  - private double radius;
  - private String color;

# Basic concepts depending on OOPS
 - String Buffer & String Builder
 - Wrapper Classes
   - Creation - valueOf vs Constructor
      - Look at the code of Integer.valueOf
   - Reasons why we need Wrapper Classes
      - • null is a possible value
      - • use it in a Collection
      - • Methods that support Object like creation from other types.. like String Integernumber2=newInteger("55");//String
   - Autoboxing
      - Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.Auto Boxing helps in saving memory by reusing already created Wrapper objects. Auto Boxing uses the static valueOf methods.                
 - Primitives vs Reference Variables
 - Arrays of Objects
 - Built in Objects in Java to play with
 - ArrayList

Questions and a variety of questions - TextQuestion > MultipleChoiceQuestion > SingleAnswerQuestion

A Simple Quiz Platform
  - With a variety of questions

# A Theory Break
- Playing with Currency values - BigDecimal
- Printing Text and Formatting output - Format method (Formatting)
- Casting
- Variable Scope
- Variable Initialization
- Memory

## Exceptions
- Quick Introduction to Exceptions
  - What is an Exception?
     - Change Gears less than 0
  - Exercise : BankAccount
     - withdraw
        - Exception
     - deposit
        - Exception
     - printStatement
     - getBalance
  - Sum all the numbers in a String
-  Exception Handling is an example of Chain of Responsibility Pattern.
  -  Exception Handling - try, catch and finally
  -  Checked and Unchecked Exceptions
  - Throwing an Exception
  - Creating Custom Exceptions
  - Finally and when is code in finally not executed?
    - [Example 2](src/main/java/com/in28minutes/java/exceptionhandling/ExceptionHandlingExample2.java)
  - New Exception Handling Features
    - TODO - Code Examples
  - Hierarchy of Exception Related Classes
    - [Example 1](src/main/java/com/in28minutes/java/exceptionhandling/ExceptionHandlingExample1.java)
    - [Example 2](src/main/java/com/in28minutes/java/exceptionhandling/ExceptionHandlingExample2.java)
  - When do you use Custom Exception?
  - When you want to define your own exceptions TODO
  - When do you use a Checked Exception?
    - When the calling method can do something about the exception being thrown TODO
    - In Spring, Most exceptions are unchecked.

## OOPS Level 2

Exercises

- public class Rectangle
  - length, width;
  - calculateArea, calculatePerimeter;

- Movie Director Writer Actor

Object Composition
Screen > TextBox,  Select, MultiSelect, Button
Social Media Application - Users > Posts > Likes, Comments

Abstraction & Encapsulation
- Football Scorer
- public class Counter
  - increment()
  - decrement() 
  - increment(int quantity)
  - decrement(int quantity)
- Timer
  - start, stop
  - startTime, endTime
- Random Class
        int number, guess;
        Scanner input = new Scanner(System.in);
        Random generator = random();
        number = generator.nextInteger(5);
        system.out.print("Pick a number between 1 and 5 : ")
        guess = input.nextInt();
        string result = guess == number ? "You guessed it!\n" : "So close it was %d\n";
        System.out.printf(result,number)
  - Throw a Dice
  - Flip => Head or Tails
- Currency
  - dollars, cents, add(), subract()

Concepts to teach
- Football Scorer Example
- Constructors
- Puzzles 
  - Method Overloading
  - Method Overriding
  - Variable Arguments
- At the end
   - Assert
   - Files
   - Date/Calendar
   - Localization or i18n
   - Multithreading
     - Threads
        - Need for Threads.
          - [Basic Example](src/main/java/com/in28minutes/java/threads/ThreadExamples.java)
        - Different States of a Thread
          - [Basic Example](src/main/java/com/in28minutes/java/threads/ThreadExamples.java)
        - Synchronization and Join Methods
          - [Synchronized Example](src/main/java/com/in28minutes/java/threads/ThreadExampleSynchronized.java)
          - [Wait and Notify](src/main/java/com/in28minutes/java/threads/ThreadWaitAndNotify.java)
          - [Deadlock Example](src/main/java/com/in28minutes/java/threads/ThreadDeadlock.java)
        - Executor Service
   
   - Organizing Code
   - Methodal Programming
   - Reactive Programming
   - REGEX and Tokenizing
   - Serialization
   - Using Language Methods
   - Java Garbage Collection
   - Enum
      - Switch based on Enum
      - With an ENUM public enum DayOfTheWeek {
            - SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
            - Wish based on week of day - Week day or Week end- For Loop
- Collections and Generics
  - Why do we need Collections?
    - Arrays are not resizable.
    - Java Collections Framework allows you to use the right data structure, because one size does not fit all.
    - Java Collections Framework provides the correct abstractions, List, Map, Set
    - [Interview Questions] (http://www.javainterview.in/p/collections-interview-questions.html)
  - Hierarchy of Collection Interface?
    - [Hierarchy](src/main/java/com/in28minutes/java/collections/CollectionHierarchy.java)
  - List
    - [All Collections Examples](src/main/java/com/in28minutes/java/collections/examples/CollectionExamples.java)
  - Map
    - [All Collections Examples](src/main/java/com/in28minutes/java/collections/examples/CollectionExamples.java)
  - Set
    - [All Collections Examples](src/main/java/com/in28minutes/java/collections/examples/CollectionExamples.java)
  - List vs Map vs Set
    - [All Collections Examples](src/main/java/com/in28minutes/java/collections/examples/CollectionExamples.java)
  - Comparing Objects in Collections
    - [All Collections Examples](src/main/java/com/in28minutes/java/collections/examples/CollectionExamples.java)
  - Collection Keywords : 
    - Hash - No Order is Maintained
    - Tree - Collection is Sorted
    - Linked - Insertion Order Maintained
    - Set - No Duplicates
  - HashSet vs TreeSet vs LinkedHashSet
    - [All Collections Examples](src/main/java/com/in28minutes/java/collections/examples/CollectionExamples.java)
  - TreeMap vs HashMap
    - [All Collections Examples](src/main/java/com/in28minutes/java/collections/examples/CollectionExamples.java)

- OOPS Level 3
   - Constructors
     - Default Constructor is the constructor that is provided by the compiler. It has no arguments.
     - A constructor can call the constructor of a super class using the super() method call. Only constraint is that it should be the first statement.
     - Another constructor in the same class can be invoked from a constructor, using this({parameters}) method call.
     - If a super class constructor is not explicitly called from a sub class constructor, super class (no argument) constructor is automatically invoked (as first line) from a sub class constructor.
   - Comparing Objects - equals and hashCode methods
   - Inheritance
      - Every Class Extends Object - See [Example](src/main/java/com/in28minutes/java/oops/inheritance/EveryClassExtendsObject.java)
      - [Example 1](src/main/java/com/in28minutes/java/oops/inheritance/InheritanceExamples.java)
      - Reuse Through Inheritance - [TestReuse.java](src/main/java/com/in28minutes/java/oops/inheritance/reuse/TestReuse.java) [Hero.java](src/main/java/com/in28minutes/java/oops/inheritance/reuse/Hero.java) [Actor.java](src/main/java/com/in28minutes/java/oops/inheritance/reuse/Actor.java) [Comedian.java](src/main/java/com/in28minutes/java/oops/inheritance/reuse/Comedian.java)
      - Example in Java Api : HashMap & TreeMap extend AbstractMap. 
      - Java and Multiple Inheritance
        - Java does not support multiple inheritance.
        - However, A class can implement multiple interfaces. But, thats not Multiple inheritance in my book.
        - An example of a class in the JDK that implements several interfaces is HashMap, which implements the interfaces Serializable, Cloneable, and Map<K, V>. By reading this list of interfaces, you can infer that an instance of HashMap (regardless of the developer or company who implemented the class) can be cloned, is serializable (which means that it can be converted into a byte stream; see the section Serializable Objects), and has the methodality of a map.

   - Polymorphism
     - [Polymorphism](docs/inheritance-and-polymorphism.md)
   - Abstract Class
   		- An abstract class is a class that cannot be instantiated, but must be inherited from. An abstract class may be fully implemented, but is more usually partially implemented or not implemented at all, thereby encapsulating common methodality for inherited classes.
      - Abstract Class uses Inheritance and hence is an implementation of IS-A relationship between classes.
      - If you want to provide common, implemented methodality among all implementations of your component, use an abstract class. Abstract classes allow you to partially implement your class.
      - Example - Animal, Cat, Dog
      - An example of an abstract class in the JDK is AbstractMap, which is part of the Collections Framework. Its subclasses (which include HashMap, TreeMap, and ConcurrentHashMap) share many methods (including get, put, isEmpty, containsKey, and containsValue) that AbstractMap defines. 
        - example abstract method : public abstract Set<Entry<K,V>> entrySet();
      - [Another Example - Spring AbstractController] (https://github.com/spring-projects/spring-framework/blob/master/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/AbstractController.java)
      - [More Details](docs/abstract-class.md)
      - Task > StudyForAlgebraTask, LearnGeometryTask, SleepTask
  - Interface
    - An interface is a contract: the guy writing the interface says, "hey, I accept things looking that way"
    - Interface represents common actions between Multiple Classes.
    - An interface defines a contract for responsibilities (methods) of a class.
    - An interface is a contract: the guy writing the interface says, "hey, I accept things looking that way"
    - Interface represents common actions between Multiple Classes.
    - Basic Example : [Flyable](src/main/java/com/in28minutes/java/oops/interfaces/Flyable.java) [Aeropane](src/main/java/com/in28minutes/java/oops/interfaces/Aeroplane.java) [Bird](src/main/java/com/in28minutes/java/oops/interfaces/Bird.java)
    - Example in Java api : Map interface, Collection interface.
    - Rules and Examples : [Rules](src/main/java/com/in28minutes/java/oops/interfaces/IntefaceRules.java) [More Examples](src/main/java/com/in28minutes/java/oops/interfaces/InterfaceExamples.java)
    - Can you extend an interface?
    - Can a class implement multiple interfaces?
    - What are the new features in interfaces introduced in Java 8?
    - What does this mean : “Always code to an interface!”
    - Interface for a game console Exposes an interface for the buttons
      - Left, right, up, down, green, red, blue
      - Game implementers (Mario, Chess) would provide the implementations
      - Generic TV Remote Control 
      - Interface vs Implementation
        - Two Companies are working on a complex project. Let’s take a simple example. One company is responsible for sorting.
         - First they agree on an interface.
         - inferface Sortable { public List<String> sort(List<String> items) }
         - Company responsible for sorting will work on implementing the interface.
         - Company writing the application will use a dummy implementation of the interface.
      - Example in Java api : Map interface, Collection interface.
      - Tips and Tricks
          - Variables in an interface are always public, static, final. Variables in an interface cannot be declared private.
          - Interface methods are by default public and abstract. Before Java 8, A concrete method (fully defined method) cannot be created in an interface.
          - An interface can extend another interface.An interface cannot extend a class.
          - A class can implement multiple interfaces. 
          - An example of a class in the JDK that implements several interfaces is HashMap, which implements the interfaces Serializable, Cloneable, and Map. By reading this list of interfaces, you can infer that an instance of HashMap (regardless of the developer or company who implemented the class) can be cloned, is serializable (which means that it can be converted into a byte stream; see the section Serializable Objects), and has the methodality of a map.
   - Access Modifiers
      - Access Modifiers - public, private, protected and default

   - Coupling and Cohesion
  - Non-access modifiers 
    - Final method, variable and class
      - [Final Class](src/main/java/com/in28minutes/java/classmodifiers/nonaccess/finalclass/FinalClass.java)
      - Final Class examples : String, Integer, Double and other wrapper classes
      - [Final Member Variable](src/main/java/com/in28minutes/java/membermodifiers/nonaccess/FinalMemberModifiersExample.java)
      - Final Variable example : java.lang.Math.PI
      - Final Method example : java.lang.Math.PI
    - Static variables and methods
  - Nested Classes
    -  Inner Class and Static Inner Class
    -  Static and Member Initializers
  - Initializer Blocks
  - Interface vs Abstract Class
    - Real Difference - Apple vs Orange
    - Syntactical Differences
      - Methods and members of an abstract class can have any visibility.  All methods of an interface must be  public.
      - A concrete child class of an Abstract Class must define all the abstract methods. An Abstract child class can have abstract methods. An interface extending another interface need not provide default implementation for methods inherited from the parent interface. 
      - A child class can only extend a single class. An interface can extend multiple interfaces. A class can implement multiple interfaces.
      - A child class can define abstract methods with the same or less restrictive visibility, whereas a class implementing an interface must define all interface methods as public


# More advanced OOPS Example with minimum Coupling

- CartContents> ShoppingCartEntry
    - class ShoppingCartEntry with float price; int quantity;
        - public float getTotalPrice()
    - class CartContents with ShoppingCartEntry[] items;
        - public float getTotalPrice()
    - class Order with private CartContents cart; and private float salesTax;
        - public float totalPrice()
- Advanced OOPS
    -  What is Abstraction?
       -  Computers can only understand 0 or 1. Low level assembly language was used earlier. High Level Languages like java are an abstraction on top of these.
        - Base of all programming
        - Example:
          - Consider simple statement : a = b + c;
          - Add two values stored in two memory locations and store it into a third memory location.
          - Actual operation involves registers, instruction sets, program counters etc. High level language we use abstracts those complex details.

    -  What is Coupling?
    -  What is Cohesion?
       -  Example : MVC pattern. Each part has individual responsibility
       -  Example : Layering of applications. Each layer has individual responsibility.
       -  Example : How Spring Framework is organized into modules!
    -  What is Encapsulation?
       -  Protect your classes from unnecessary changes!
       -  Think about driving a car. We just change gears and move the driving wheel. We are not aware of how the internal mechanics work. This is a good Example of encapsulation.
          -  ChangeGears(), moveDrivingWheel()
       -  All manufacturers offer same interface, even though the internal details of how the car works are different.
       -  Switch ON and OFF
- How do we end?
  - 50 Puzzles to test yourself
  - Unit Testing
  - Java New Features
    - Java 5, 6, 7
    - Java 8
    - Java 9
  - TDD
  - Readable Code
  - 97 things a programmer should know
  - Simple Web App?
  - Subtitles for the atleast the first 2 hours very quickly
    - Exercise : Write a program to use some other built-in Java Class.
     - Lets use the documentation which is available to do that!
- Assert
  - [Example](src/main/java/com/in28minutes/java/others/assertexample/AssertExamples.java)
- Garbage Collection and finalize
  - Programmer has no control (other than finalize request and System.gc call - both of which are bad practices)
  - This is a big change from C++
  - [Example](src/main/java/com/in28minutes/java/others/garbagecollection/GarbageCollectionExamples.java)

- Which datatype should we use for financial calculations?
- What is a Marker Interface?
- Need for Serialization
  - [Example 1](src/main/java/com/in28minutes/java/serialization/SerializationExamples.java)
  - [Example 2](src/main/java/com/in28minutes/java/serialization/SerializationExamples2.java)
  - [Example 3](src/main/java/com/in28minutes/java/serialization/SerializationExamples3.java)
- Why do we need an Enum?
  - [Basic Examples](src/main/java/com/in28minutes/java/enums/Enum.java)
  - [Advanced Examples 1](src/main/java/com/in28minutes/java/enums/EnumAdvanced.java)
  - [Advanced Examples 2](src/main/java/com/in28minutes/java/enums/EnumAdvanced2.java)
- What are variable arguments?
  - [Example](src/main/java/com/in28minutes/java/varargs/VariableArgumentExamples.java)
- Cloning - Deep vs Shallow
- Stream
- Lambda Expressions
- 20 Puzzles to Test Yourselves
   * Java Classloaders
   * Garbage Collection
   * Serialization
   * What is an anonymous class?
   * Boy Scout Rule
- Puzzles around return values
  - Is it valid to return two times?
  - What if the else is removed?
  - Will code after return be executed?
  - Can I have code after return?
  - Can I return from a void function?
  - Can I return a different type?- Introduce Math class and check out the API
- Comments
