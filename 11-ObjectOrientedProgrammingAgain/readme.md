# OOPS Again!
- Composition
- Using Multiple Data Types
- Football Game
- Object class
 - toString, equals etc
- public class Fan (Has different data types)
  - private int speed;
  - private boolean isOn;
  - private double radius;
  - private String color;

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
      - Comparator interface - creating implementations for sorting!
      - Tips and Tricks
          - Variables in an interface are always public, static, final. Variables in an interface cannot be declared private.
          - Interface methods are by default public and abstract. Before Java 8, A concrete method (fully defined method) cannot be created in an interface.
          - An interface can extend another interface.An interface cannot extend a class.
          - A class can implement multiple interfaces. 
          - An example of a class in the JDK that implements several interfaces is HashMap, which implements the interfaces Serializable, Cloneable, and Map. By reading this list of interfaces, you can infer that an instance of HashMap (regardless of the developer or company who implemented the class) can be cloned, is serializable (which means that it can be converted into a byte stream; see the section Serializable Objects), and has the methodality of a map.
   - Access Modifiers
      - Access Modifiers - public, private, protected and default
   - Coupling and Cohesion

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