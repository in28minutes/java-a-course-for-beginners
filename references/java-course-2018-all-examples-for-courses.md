# Outline

## Variables, Types and Functions
- More Functions
  - Multiple Arguments
    - Sum of two numbers
    - Nth power of a number
    - Largest of three numbers
  - Character Functions
    - isVowel
  - Return Type Number
    - Sum of two numbers
    - Square of a number
    - Sum of n numbers
    - Sum of first n odd numbers
    - Sum of first n even numbers
  - Return Type Boolean
    - Odd or Even
    - isPrime
  - Return Type Character
    - calculateGrade
  - Return Type String
    - First 10 Characters or Programming Excellence Examples
  - Return Type Object
    - Rectange area
  - Return Type Array
    - Print array backwards
  - Return Type Array of Objects
- Utility Functions
  - Math.random
  - Take input from user
  - Function to generate a random number between 0 and a specific number
- Other Example Functions
    - Area of a Triangle
    - Find the third angle in a triangle
    - Is it a good triangle?
    - Bigger Number
    - Sum of two numbers
    - Is number greater than 100?
    - Odd or Even
    - Leap Year
    - A function calling another custom function
    - isPerfectNumber calling getFactorsOfANumber

## Loops and Conditionals
- What can we do with Random generation
  - Throw a Dice
  - Flip => Head or Tails
  - Can we encapsulate it for a specific need with a right encapsulation?
- Conditionals  (If and Switch)
  - Simple Puzzles on conditions and loops
  - Student Grades A to F based on Marks
  - Check out these test files - IfStatementTest, SwitchStatementTest, DoWhileLoopTest, WhileLoopTest, ForLoopTest, Enhanced For Loop Test 
- Switch
  - switch (month)
    - case 1: System.out.println("January"); break;
    - case 2: System.out.println("February"); break;
    - case 3: System.out.println("March"); break;
    - case 4: System.out.println("April"); break;
  - switch (day)
      - case 0: System.out.print("Sunday"); break;
      - case 1: System.out.print("Monday"); break;
      - case 2: System.out.print("Tuesday"); break;
      - case 3: System.out.print("Wednesday"); break;
  - Switch with Char
      - Is a Vowel or Not - create a switch statement testing for A, E, I, O, U
  - With an ENUM public enum DayOfTheWeek {
        - SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        - Wish based on week of day - Week day or Week end- For Loop
  - Sum of Digits, Reverse a Number, Palindrome
  - Prime Number, Prime Numbers in a given range.
  - Multiple Loops
  - Print the following
    - a  a^2    a^3
    - 1  1    1
    - 2  4    8
  - Print numbers from 1 to 100, 10 a line
  - Print All ascii chars from 1 to 256 and have some fun with it..
  - Print this loop (for, while, do while)
      - 1
      - 1 2
      - 1 2 3
      - 1 2 3 4 
      - 1 2 3 4 5
  - Use a for loop to print out the odd numbers from 1 to 10.
  - Print all squares of numbers less than 100. 
  - Print all cubes of numbers less than 100.
- Doing same problem with multiple loops
  - Prime numbers below 100 using for(;;), while, do while
- Do with All three loops
  - Count 1 to 100
  - Count 100 to 1
- Do While 
   - do{System.out.print("Do you want to play again (yes/no)? "); playAgain = usersConsole.nextLine();
   - } while ("yes".equals(playAgain));
- Combination of For/While Loop and Conditionals
  - (Occurrence of max numbers) Write a program that reads integers, finds the largest of them, and counts its occurrences. Assume that the input ends with number 0. 
  - Write a program that displays all the leap years, ten per line, from 101 to 2100, separated by exactly one space. Also display the number ofleap years in this period.
  - Perfect Number - A positive integer is called a perfect number if it is equal to the sum of all of its positive divisors, excluding itself. For example, 6 is the first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1.  There are four perfect numbers less than 10,000. 
  - ATM pin with 3 attempts
  - Sum of digits for a 2 digit number
  - Sum of digits for a 3 digit number
  - Sum of digits for all numbers
- double and for loop ( 1 to 10)
    - double fahrenheit = 9.0 / 5 * celsius + 32;
    - Convert miles to kilometers - 1 mile is 1.609 kilometers
        - Miles           Kilometers
        - 1               1.609
        - 2               3.218
        - ...
    - Kilograms Pounds    |    Pounds Kilograms
        - 1            2.2    |    20          9.09
        - 3            6.6    |    25         11.36
        - ...          
        - 197        433.4    |    510       231.82
- Writing Good Functions/Methods/Procedures
  - You are awarded a grade based on your marks. Grade A for 91 to 100 Grade B for 51 to 90 Otherwise Grade C Except for Mathematics where minimum marks to get a Grade are 5 higher than required for other subjects.
  - A student is selected for improvement course if he has between 20 and 40 marks in the previous attempt. However, if a student is in the last semester, the lower limit does not apply.
  - You and your Friend are planning to enter a Subject Quiz. However, there is a marks requirement that you should attain to qualify. Return value can be YES, NO or MAYBE. YES If either of you are very good at the subject(has 80 or more marks). However, there is an exception that if either of you is not good in the subject(20 or less marks), it is NO. In all other conditions, return MAYBE. However, the definition for good and not good are 5 marks higher if the subject is Mathematics. public Result willQualifyForQuiz(int marks1, int marks2, boolean isMaths)

## Arrays
- Arrays 
  - sum of elements, max of elements, Print array backwards, delete an element from an array! Add an element to an array.
  - String is a Char Arrays
  - Array of Objects
     - String name;
     - int grade;
     - Student[] students = new Student[4];
- Array of test scores and all the operations (min, max, average, top 7) on them.
- Return Type Array from a function
- Add two arrays
- Merge two sorted arrays
- Remove duplicates in a sorted array 
- Remove element from array
- Search an array for an element
- Count of a specific character in a char array
- Sort an array and find the maximum from the sorted array
- Arrays.sort(myArray);
- int highestNumber = myArray[myArray.length - 1];
- Using Loops around Arrays
  - Multiply all numbers in an array by 10
  - Print all prime numbers between 2 numbers
  - Sum of all even numbers in an array
  - Count of odd numbers in an array
  - 2 D Array and 2 D loops

## OOPS
- public class Book {
    - long id, name, author;
    - Author > Publisher > Reviews
- public class Survey {
    - id, title, description, List<Question> questions;
    - Questions and a variety of questions
         - TextQuestion > MultipleChoiceQuestion > SingleAnswerQuestion
- Course Review Application
    - Course> Lectures > Assignments
    - Student > CourseStudent > Review
    - Track => Completion of assignments etc etc etc...
- Social Media Application
  - User > Posts > Likes, Comments
- Bank > Customers > Accounts
- Generate an addition quiz of 10 questions at random. Ask the questions and evaluate the quizzer.
- A Simple Quiz Platform 
  - With a variety of questions 
- Design a basic Menu and take inputs
  - 1 - action1
  - 2 - action2
  - 3 - action3
  - 4 - action4
  - 5 - quit
- Football Game with a Menu
  - goal
  - start game
  - end game
  - statistics
- Design a Course Platform with a Basic Menu
  - mostStudents
  - leastStudents
  - mostLikedCourse
  - courseToTerminate 
  -    private String courseName;
      private String[] students = new String[1];
      private int numberOfStudents;
      public void addStudent(String student) {
      public void dropStudent(String student) {
      public void clear() {
      private int findStudent(String student) {
- Football Scorer
- Flight > id, organization, from, to, and think of actions that can be performed.
- Movie Ratings
- Name > firstName, lastName, middleName
- Course Ratings
- Movie Director Writer Actor
- public class Movie > id, title, year, genres, director, actors, duration
- Screen >  TextBox, Select, MultiSelect, Button
- Currency
  - dollars, cents, add(), subract()
- public class Fan 
  - private int speed;private boolean on;private double radius String color;
- public class Rectangle 
  - length, width;
  - getArea, getPerimeter
- public class Complex implements Cloneable {
  - real, complex
  - public Complex()this(0, 0);
  - public Complex(double real); this(a, 0);
  - public Complex(double a, double b)
  - public Complex add(Complex secondComplex)
  - public Complex subtract(Complex secondComplex)
  - public Complex multiply(Complex secondComplex)
- public class Counter
  - increment(), decrement() 
  - increment(int quantity),  decrement(int quantity)
- public class MyInteger {
  - private int value;
  - public boolean isEven(), isOdd(), isPrime()
- FootballScorer
  - Football Scorer Approach 1 -> team1score, team2score
  - Football Scorer Approach 2 -> Team team1; Team team2;
    - Difference between approaches
    - Approach 2 is more extensible
    - How we organize objects is very important!
  - Use the Counter to keep track of score in a Football game or Hockey game or a BasketBall game
- Weather >  maxTemperature,  minTemperature, humidity, date
- Timer
  - start, stop
  - startTime, endTime
- public class RangeResource {
    - private int myStart;
    - private int myEnd;
    - private int myIncrement;
    - private List<Integer> myValues;
    - Exception - if (increment == 0) { throw new ResourceException("RangeResource: invalid increment, cannot be 0");
- Class relationships
  - Album <-> Song
  - public class Song implements Comparable <Song>
       - String title, String artist, String rating;
- Exercise
  - Switch
    - i. On or Off
  - Account
    - i. Withdraw,  ii. Deposit,  iii. changeAddress iv. get Address v. getName
    - printStatement
- Interface
   - Examples
      - Video game console :
         - Exposes the interfaces for the buttons
            - Left, right, up, down, green, red, blue
         - Game Writer
            - Provide implementation for this interface
      - Example in Java api : Map interface, Collection interface.
- Inheritance
 - TwoDimensionalShape (private String color = "while";private boolean filled;)
    - noOfSides
    - Triangle, Rectangle, Square
 - public class Person name,address,phone,email;
  - Person > Student and Employee > Differentiation by Grades
  - Employee - private String title;
  - public class ContactDetail {
    - private String fullName, facebookID, phone, email
 - Seasons > Summer, Winter, Fall, Spring
      - Methods > maximumTemperate, minimumTemperature, greenTrees, etc etc
 - CheckingAccount(overdraftLimit), SavingsAccount
 - Task > StudyForAlgebraTask, LearnGeometryTask, SleepTask
- Composition vs Inheritance
  - Point with Two Lines
  - Line extend Point
- public class Account {
  - String name, int id, double balance; double annualInterestRate;Date dateCreated;
  - private ArrayList<Transaction> transactions;
  - public class Transaction - date, char type, double amount, double balance, String description;

- Abstract Class
  - public abstract class VirtualAnimal { public final int age;
        - public abstract boolean isAbleToFly();
        - public abstract boolean isRideable();
        - public abstract boolean isHerbivore();
        - public abstract boolean isCarnivore();
   - Shape (noOfDimesions) > 2DShape (area), 3DShape (volume)
      - public class Circle extends 2DShape -  radius
      - public class Rectangle - width, height
      - public class Square - side;
   - Placeholders for actual implementation
   - Abstract class defines behaviour, Subclasses implement the behavior.
   - public abstract class Instruction { void perform() { firstStep(); secondStep(); thirdStep(); } abstract void firstStep(); abstract void secondStep(); abstract void thirdStep(); }
   - Template Method Pattern
      - ensureSecurity()
      - if(validate())
         - executeRequest()
   - An example of an abstract class in the JDK is AbstractMap, which is part of the Collections Framework. Its subclasses (which include HashMap, TreeMap, and ConcurrentHashMap) share many methods (including get, put, isEmpty, containsKey, and containsValue) that AbstractMap defines.
   - Example abstract method : public abstract Set> entrySet();
   - [Another Example - Spring AbstractController] (https://github.com/spring-projects/spring-framework/blob/master/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/AbstractController.java)
- Method overloading
   - Constructors
      - public HashMap(int initialCapacity, float loadFactor)
      - public HashMap() {
      - public HashMap(int initialCapacity)
   - Methods
      - public boolean addAll(Collection<? extends E> c)
      - public boolean addAll(int index, Collection<? extends E> c)
- Method overriding
   - HashMap public int size() overrides AbstractMap public int size()
- Interface vs Abstract Class
   - Account (SavingsAccount, CheckingAccount, SeniorCitizenSavingAccount)
   - Flyable (Bird, Aeroplane)
- Object - equals and hashCode methods
- Advanced OOPS

## Collections
- Basics Collections
  - Collection Interface Hierarchy
  - Collection & List Interface methods and classes - ArrayList, Vector & LinkedList
  - ArrayList
     - List of Questions
     - List of Answers
     - Match Questions and Answers and decide rating!
  - Set interfaces and implementations - HashSet, LinkedHashSet and TreeSet
  - Map interfaces and implementations - HashMap, LinkedHashMap and TreeMap
     - HashMap : Number of occurrences of each character in a String.
     - Program : Find unique characters in a String
  - Hashmap
     - Implement a code word database with a hashmap. Translate any given string using the code words. If the word does not exist in database, then it should use the original word itself.
    - States and Capitals => Find the capital of a state.
    - Duplicate Items
    - Occurances of chars in String

```
Roman to Integer conversion
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length();
        int sum = map.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; --i) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }

System.out.println(solution.romanToInt("DCXXI"));// 621
System.out.println(solution.romanToInt("CCCXLVIII"));// 384
```
  - List example
    - public class MenuItem { String access;,List<MenuItem> childMenus;,String name;String readAccessRole;boolean visible;String writeAccessRole;
    - Remove unauthorized menu items, Remove not visible menu items
    - Add an item to a menu
    - Make an item inactive
    - Delete an item

```
public interface StudentOperations {
    public List<Student> getPassedStudents();
    public List<Student> getFailedStudents();
    public Map<Gender, List<Student>> splitStudentsByGrade();
    public List<Student> getStudentWithLowestTotalMarks();
    public List<Student> getStudentWithHighestTotalMarks();
    public Map<Gender, List<Student>> splitStudentsByAge();
    public Map<Gender, List<Student>> splitStudentsByGender();
    public Map<Gender, Double> getAverageMarkByGender();
```
- Generics
  - Generics
- Advanced Collections
  - Queue interfaces and implementations - Deque and BlockingQueue
  - Concurrent Collections
    - Concurrent Collections - CopyOnWriteArrayList
    - CompareAndSwap, Locks and AtomicOperations
  - Comparator
     - Collections.sort(students, new StudentAgeComparator());
     - Collections.sort(students, new StudentGpaDescendingComparator());

## Missing Corners - Java goodness

- http://www.javacodegeeks.com/2014/03/java-facts-to-blow-your-mind.html
    - 9 Millions Developers
    - 1 Billion Java Downloads per Year
    - 3 Billion devices run Java
    - 97% of Enterprise Desktops run Java

- Java Built-in Utility Classes
  - Char
    - display lower case characters
    - for(char ch='a';ch<='z';ch++){ System.out.print(ch + " ");}
  - String, StringBuffer and StringBuilder
     - Performance : Avoid String Concatenation!
     - Program : Find if String is a Palindrome
     - Program : Code a String Splitter!
     - Find unique vowels in a String
      - Find repeating vowels in a String
      - Find number of vowels in a String
    - First Character
    - Last Character
    - Reverse a Name
    - Remove a Specific Character
    -  Given a string swap the last two characters of the string. Hint : str.charAt(i) give the character at i+1th position. ""=>"","A"=>"A","AB"=>"BA","RAIN"=>"RANI"
    -  Remove 'A' if it is present in first 2 characters of the string. If 'A' is present after first two characters, it should not be removed. "ABCD" => "BCD", "AACD"=> "CD", "BACD"=>"BCD", "BBAA" => "BBAA", "AABAA" => "BAA"
    - Return substring excluding the first two characters. However there is an exception:If "A" is the first character or "B" is the second character, do not truncate them. "A" => "A", "AB" => "AB", "ABCD" => "ABCD", "AACD" => "ACD","BBCD" => "BCD", "CDEF"=>"EF"
    - Use  binary search to play the game of twenty questions. It takes an integer command-line argument k, asks you to think of a number between 0 and n-1, where n = 2^k, and always guesses the answer with n questions.
  - Exercise : Write a program to use some other built-in Java Class.
     - Lets use the documentation which is available to do that!
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
- Enum
  - Grades A to F, Directions (North (0), South (180), East (90), West (270);)
  - Months, Weekdays, Colors, grades, sports
  - Currency -> EUR, USD, ...
  - Rock Scissors Paper
  - (Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws.  

# Advanced Stuff

## Examples of Design Patterns used in Java

### Some Creational patterns
- Factory method
  - java.util.Calendar#getInstance()
  - java.nio.charset.Charset#forName()
- Prototype
  - java.lang.Object#clone()
- Singleton 
  - java.lang.Runtime#getRuntime()
  - java.lang.System#getSecurityManager()

### Some Structural patterns
- Adapter
  - java.util.Arrays#asList()
  - javax.xml.bind.annotation.adapters.XmlAdapter#marshal() and #unmarshal()

- Decorator 
  - All subclasses of java.io.InputStream, OutputStream etc.
  - java.util.Collections : synchronizedXXX() and unmodifiableXXX() methods.

- Flyweight
  - java.lang.Integer#valueOf(int) (also on other Wrapper classes)

### Behavioral patterns
- Chain of responsibility 
  - javax.servlet.Filter#doFilter()
  - Exception Handling

- Command 
  - java.lang.Runnable

- Iterator
  - All implementations of java.util.Iterator

- Strategy (recognizeable by behavioral methods in an abstract/interface type which invokes a method in an implementation of a different abstract/interface type which has been passed-in as method argument into the strategy implementation)
  - java.util.Comparator#compare(), executed by among others Collections#sort().

- Template method (recognizeable by behavioral methods which already have a "default" behaviour definied by an abstract type)
  - All non-abstract methods of java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap.

- Patterns
    - public class ObserverPattern {
    - public class StrategyPattern

- A Few Algorithms
Binary Search 
Bubble Sort

Builder Pattern
Address(state)
Address(state,city)
Address(state,city,line1)
Address(state,city,line1,line2)
Address(state,city,line1,line2,zip)

vs

Address.Builder.state(state).city(city).line1(line1).line2(line2)


// Overloading Functions

## Some JShell Features

- Characters
  - (Find the Unicode of a character) Write a program that receives a character and displays its Unicode.
  - Generate a random alphabet
    - Capital Alphabet
    - Small Alphabet
- Reverse each word in a String
- Copy every character K times
- Functional Programming
  - Address Book and operations on an addressbook
  - Search by different parameters!

# Design Exercises like this
- Do the following inside the main method?:
 - Remove Dave... print the list of students.
 - Add Dave back to the end of the list... print the list of students
 - Change Kim's GPA to 2.0... print the list of students 
 - Add Bill with GPA 1.0 after Sally... print the list of students 
 - Make Kim and Sally swap positions... print the list of students 

Write a java program to input your first name and last name, then say "hello" two ways, like this:
Enter your first name: Michael
Enter your last name: Fudge
Hello, Michael Fudge!  
Or should I say: Fudge, Michael!

String studentName = "Bette Itall";
int age = 22;       
double gpa = 3.75;
boolean isFemale = true;
System.out.printf("%s is %d years old. %s has a %4.3f gpa.\n",
        studentName,
        age,
        (isFemale ? "She" : "He"),
        gpa);

System.out.print("Enter student's name : ");
studentName = input.nextLine();        
System.out.print("Enter student's gpa : ");
gpa = input.nextDouble();
System.out.print("Enter student's age : ");
age = input.nextInt();
System.out.print("Is this student female? (true/false) : ");
isFemale = input.nextBoolean();

Make a class `ToDoList`, which supports the following operations:
`void add(Task t)`
`void markFinished(Task t)`
`void markCancelled(Task t)`
`Task getTop()`
`boolean canFinish()`
`int getRemainingTime()` //calculates the time remaining after you've done all of your tasks.

- Exercise Example
    - Create a single room of a house using composition.Think about the things that should be included in the room. Maybe physical parts of the house but furniture as well Add at least one method to access an object via a getter and then that objects public method as you saw in the previous video then add at least one method to hide the object e.g. not using a getter but to access the object used in composition within the main class like you saw in this video.
    - Create a new class VipCustomer. it should have 3 fields name, credit limit, and email address. create 3 constructors 
       - 1st constructor empty should call the constructor with 3 parameters with default values
       - 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
       - 3rd constructor should save all fields.
    - Create a for statement using any range of numbers Determine if the number is a prime number using the isPrime method if it is a prime number, print it out AND increment a count of the number of prime numbers found if that count is 3 exit the for loop hint:  Use the break; statement to exit
    - Example Program
       - System.out.println("Hello, World!");
       - int myFirstNumber = (10 + 5) + (2 * 10);
       - int mySecondNumber = 12;
       - int myThirdNumber = myFirstNumber * 2;
       - int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
       - int myLastOne = 1000 - myTotal;
    - Challenge. Start with a base class of a Vehicle, then create a Car class that inherits from this base class. Finally, create another class, a specific type of Car that inherits from the Car class.You should be able to hand steering, changing gears, and moving (speed in other words).You will want to decide where to put the appropriate state and behaviours (fields and methods). As mentioned above, changing gears, increasing/decreasing speed should be included. For you specific type of vehicle you will want to add something specific for that type of car.
 - Pick me a random movie to watch


- Writing Good Functions/Methods/Procedures
  - You are awarded a grade based on your marks. Grade A for 91 to 100 Grade B for 51 to 90 Otherwise Grade C Except for Mathematics where minimum marks to get a Grade are 5 higher than required for other subjects.
  - A student is selected for improvement course if he has between 20 and 40 marks in the previous attempt. However, if a student is in the last semester, the lower limit does not apply.
  - You and your Friend are planning to enter a Subject Quiz. However, there is a marks requirement that you should attain to qualify. Return value can be YES, NO or MAYBE. YES If either of you are very good at the subject(has 80 or more marks). However, there is an exception that if either of you is not good in the subject(20 or less marks), it is NO. In all other conditions, return MAYBE. However, the definition for good and not good are 5 marks higher if the subject is Mathematics. public Result willQualifyForQuiz(int marks1, int marks2, boolean isMaths)

# More Todos
- Comments & Readable Code
- JavaDoc
- Static Imports
- Coding Guidelines & Standards
- Unit Tests
- ClassLoader

Rest of the Topics Organization
- Multithreading
   - MultiThreading - Need for Threads and Creating Threads
   - Thread states, priority, ExecutorService and Callable
   - Synchronization of Threads. join, wait, notify and notifyAll methods
- Functional Programming - Lamdba Expressions and Streams
   - Functional Programming Examples - Streams and Lambda Expressions
   - Functional Programming Questions and Answers
- More Good Practices
   - Advanced Refactoring?????????
- Good Design???
- TDD 
- Maven - 10 Tips
- JUnit - 10 Tips
- Code Quality & Standards - 10 Tips
   - 4 Principles of Simple Design
   - Effective Java
- Refactoring - 10 Tips
- Eclipse - 10 Tips
- Java - 10 Tips
   - Do not use float or double for monetary calculations
- Design Patterns - 5 Examples
- SOLID PRINCIPLES
- How do you continue you journey?

What do you think about while you code
* Am I going to understand this in 3 months time?
* Am I trying to be too clever: is there a simpler way to get the job done?
* Can I write this in such a way as to make some parts re-usable?
* Have I written anything before that I could re-use here?
* What's for dinner?
* Am I going to be able to easily test this?
* Is the first programmer who will read the code going to send a snippet to The Daily WTF?

Books
* Code Complete by Steve McConnell.
* Clean Code- A Handbook of Agile Software Craftsmanship     
* Working Effectively with Legacy Code by Michael Feathers
* The Pragmatic Programmer: From Journeyman to Master by Andrew Hunt
* Patterns of Enterprise Application Architecture by Martin Fowler
* Effective Java (2nd Edition) by Joshua Bloch
* Extreme Programming Explained: Embrace Change (2nd Edition) by Kent Beck
* Agile Software Development, Principles, Patterns, and Practices by Robert C. Martin
* Refactoring: Improving the Design of Existing Code by Martin Fowler
* Test Driven Development: By Example by Kent Beck
* Code Craft
* The Productive Programmer
* Disciplined Agile Delivery
* Anti Patterns

