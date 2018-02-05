# OOPS Again

### Objects have state and behaviour

Fan Class
- State (Member Variables)
  - make;
  - radius;
  - color;
  - isOn;
  - speed;
- Constructors
  - Fan(String make, double radius, String color) 
- Behavior (Member Methods)
  - void switchOn()
  - void switchOff()
  - void changeSpeed()
  - String toString() using String.format method

Exercise

- public class Rectangle
  - length, width;
  - What constructors?
  - What Operations?

### Object Composition

Customer
- homeAddress
- workAddress

#### Exercise
Book > id, name, author
 > Reviews > id, description, rating

```java 
 Book book = 
    new Book(123, "Object Oriented Programming with Java", 
          "Ranga");
 book.addReview(
    new Review(10, "Great Book", 5));
 book.addReview(
    new Review(101, "Awesome", 5);

 System.out.println(book);
 ```



## Inheritance Basics

### Inheritance Basics

public class Person name,phone,email;

- Student 
  - college
  - class
- Employee 
  - title
  - employer
  - employeeGrade
  - salary
  - toString (print all values including those of Person)

### Apply Inheritance to Savings Account

### More about Inheritance
- Method Overriding
- Is a relationship is mandatory
- Example in Java Api : HashMap & TreeMap extend AbstractMap.

## Inheritance Puzzles

Every Class extends Object class

Super class reference variable can hold an object of sub class

```
//Object is super class of all java classes
Object object = new Hero(); 
```
Multiple Inheritance results in a number of complexities. Java does not support Multiple Inheritance.

```
class Dog extends Animal, Pet { //COMPILER ERROR
}
```

We can create an inheritance chain.
```
class Pet extends Animal {
}

class Dog extends Pet {
}
```
instanceof operator checks if an object is of a particular type.

- Can be used with Interfaces and Classes

### Inheritance and Constructors
 - A constructor can call the constructor of a super class using the super() method call. Only constraint is that it should be the first statement.
 - Another constructor in the same class can be invoked from a constructor, using this({parameters}) method call.
 - If a super class constructor is not explicitly called from a sub class constructor, super class (no argument) constructor is automatically invoked (as first line) from a sub class constructor.

Constructors are NOT inherited.
```
class Animal {
    String name;

    public Animal(String name) {
this.name = name;
System.out.println("Animal Constructor with name");
    }
}

class Dog extends Animal {
}

public class ConstructorExamples {
    public static void main(String[] args) {
// Dog dog = new Dog("Terry");//COMPILER ERROR
    }
}
```

## Abstract Class

### Basics of an Abstract Class

- An abstract class is a class that cannot be instantiated, but must be inherited from. An abstract class may be fully implemented, but is more usually partially implemented or not implemented at all, thereby encapsulating common methodality for inherited classes.
An abstract class cannot be instantiated.

### One more example of an Abstract Class

Cooking Recipe
- firstStep - Review Availability of Oven, Stove and Utensils
- The usual recipe steps
- lastSteps - Switch off microwave oven, stove and clean everything!

### Abstract Class Puzzles
Abstract class can contain instance and static variables
//An Abstract method does not contain body.
//Abstract Class can contain ZERO or more abstract methods
//Abstract method does not have a body
//Abstract class can contain fully defined non-abstract methods. 

// A concrete sub class should implement all abstract methods.
// Below class gives compilation error if uncommented

## Interface Basics

A lot of confusion between Interface and Abstract Class. They are very different. We need to get our thinking right about interfaces. Interfaces have nothing to do with Inheritance.

What does the word interface represent to you? Think about it.

What is the interface that a Video game console provides you with?

Interface of a Video game console exposes what actions you can perform with it.
 - It exposes the interfaces for the buttons
      - Left, right, up, down, green, red, blue

What would the game writer do? Provide implementations for those methods. 

Thats the best way to think about interfaces! What are the actions that can be performed? Represent that as an interface. 

### First example with an interface

VideoGameConsole
> MarioGame
> PacmanGame
> ChessGame

### Exercise
- Aeroplane, Bird

### Interfaces in Java API
- Comparator interface - creating implementations for sorting!

### One more way to think about an interface

- Two systems talking to each other

    - An interface is a contract: the guy writing the interface says, "hey, I accept things looking that way"
    - Interface represents common actions between Multiple Classes.
    - An interface defines a contract for responsibilities (methods) of a class.

- Interface vs Implementation
  - Two Companies are working on a complex project. Let’s take a simple example. One company is responsible for sorting.
   - First they agree on an interface.
   - inferface Sortable { public List<String> sort(List<String> items) }
   - Company responsible for sorting will work on implementing the interface.
   - Company writing the application will use a dummy implementation of the interface.

### Interface Puzzles
- Can you extend an interface?
- Can a class implement multiple interfaces?
- What are the new features in interfaces introduced in Java 8?
- Tips and Tricks
    - Variables in an interface are always public, static, final. Variables in an interface cannot be declared private.
    - Interface methods are by default public and abstract. Before Java 8, A concrete method (fully defined method) cannot be created in an interface.
    - An interface can extend another interface.An interface cannot extend a class.
    - A class can implement multiple interfaces. 
    - An example of a class in the JDK that implements several interfaces is HashMap, which implements the interfaces Serializable, Cloneable, and Map. By reading this list of interfaces, you can infer that an instance of HashMap (regardless of the developer or company who implemented the class) can be cloned, is serializable (which means that it can be converted into a byte stream; see the section Serializable Objects), and has the methodality of a map.

## Interface Puzzles
An interface reference variable can hold an object of an instance of an interface implementation
instanceof can be used with interfaces as well. 
- However, A class can implement multiple interfaces. But, thats not Multiple inheritance in my book.
- An example of a class in the JDK that implements several interfaces is HashMap, which implements the interfaces Serializable, Cloneable, and Map<K, V>. By reading this list of interfaces, you can infer that an instance of HashMap (regardless of the developer or company who implemented the class) can be cloned, is serializable (which means that it can be converted into a byte stream; see the section Serializable Objects), and has the methodality of a map.
Variables in an interface are always public, static, final. Variables in an interface cannot be declared private.

Interface methods are by default public and abstract. A concrete default method (fully defined method) can be created in an interface. Consider the example below:

A class can implement multiple interfaces. It should implement all the method declared in all Interfaces being implemented.

A class should implement all the methods in an interface, unless it is declared abstract.

## Exerices Interface and Abstract Class

### Interface
interface Flyable 
- void fly();
- Bird "with wings"
- Aeroplane "with fuel"
- Flyable flyingObjects = {new Bird(), new Aeroplane()};
- Loop and invoke fly method

### Abstract Class

abstract class Animal
- void bark()
- Dog "Bow Bow"
- Cat "Meow Meow"
- Animal[] animals = {new Cat(), new Dog()};
- Loop and invoke bark method

## Polymorphism
Polymorphism is defined as "Same Code" having "Different Behavior".  

#### Interface vs Abstract Class
- Real Difference - Apple vs Orange
- Syntactical Differences
  - Methods and members of an abstract class can have any visibility.  All methods of an interface must be  public.
  - A concrete child class of an Abstract Class must define all the abstract methods. An Abstract child class can have abstract methods. An interface extending another interface need not provide default implementation for methods inherited from the parent interface. 
  - A child class can only extend a single class. An interface can extend multiple interfaces. A class can implement multiple interfaces.
  - A child class can define abstract methods with the same or less restrictive visibility, whereas a class implementing an interface must define all interface methods as public

  - public class CheckingAccount {
  - Customer customer > Name, Address
  - int id
  - BigDecimal balance
  - Date dateCreated
  - private ArrayList<Transaction> transactions 
    >  type, date, amount, balance, description;
  - BigDecimal overDraftLimit;
  - boolean withdraw(BigDecimal amount)
  - void deposit(BigDecimal amount)
  - void currencyExchange(BigDecimal amount, String from, String to)
  - void payBill(String billType, String to, BigDecimal amount)

- Social Media Application like Facebook
 - users (name, address, hobbies)
   - friends 
   - posts (description, link, image)
      - likes
      - comments

- Book
  - id, name
  - Author > name address
  - Publisher > name address
  - Reviews > rating, description

- Survey
  - id, title, description, list of questions


### Why Inheritance?

How do we create a new kind of Account called Savings Account?
- annualInterestRate
- calculateMonthlyInterest()

Another kind of Account for Senior Citizens?
- homeDeliveryOfCash()

- An example of an abstract class in the JDK is AbstractMap, which is part of the Collections Framework. Its subclasses (which include HashMap, TreeMap, and ConcurrentHashMap) share many methods (including get, put, isEmpty, containsKey, and containsValue) that AbstractMap defines. 
- An example abstract method : public abstract Set<Entry<K,V>> entrySet();
- [Another Example - Spring AbstractController] (https://github.com/spring-projects/spring-framework/blob/master/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/AbstractController.java)

