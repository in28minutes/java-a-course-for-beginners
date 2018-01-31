Katas/Examples
Refactoring Examples :http://refactormycode.com/codes/recent/java
Roman Numerals:http://vimeo.com/33841375
http://ubuntuforums.org/showthread.php?t=1714324
http://www.docondev.com/2011/12/roman-numeral-kata.html
http://www.codingdojo.org/cgi-bin/wiki.pl?KataCatalogue
http://schuchert.wikispaces.com/Katas
http://www.butunclebob.com/ArticleS.UncleBob.ThePrimeFactorsKata
http://sites.google.com/site/tddproblems/all-problems-1
http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata
http://www.docondev.com/2011/01/sharpening-saw.html
http://codekata.pragprog.com/2007/01/code_kata_one_s.html
http://programmingpraxis.com/contents/chron/
http://www.codinghorror.com/blog/2008/06/the-ultimate-code-kata.html
http://www.knowing.net/index.php/2006/06/16/15-exercises-to-know-a-programming-language-part-1/
http://vimeo.com/user3159463/videos/sort:plays
http://johannesbrodwall.com/2010/04/06/why-tdd-makes-a-lot-of-sense-for-sudoko/
http://www.viddler.com/explore/GreggPollack/videos/29 LCD Numbers Kata by Corey
http://osherove.com/tdd-kata-1/
http://osherove.com/tdd-kata-2/
Miscellaneous
http://norvig.com/21-days.html    Teach Yourself Programming in Ten Years
http://programmer.97things.oreilly.com/wiki/index.php/Contributions_Appearing_in_the_Book
http://programmer.97things.oreilly.com/wiki/index.php/Other_Edited_Contributions
http://samizdat.mines.edu/howto/HowToBeAProgrammer.html
http://www.javacodegeeks.com/2011/07/top-97-things-every-programmer-or.html
http://developerart.com/publications/4/wise-programming-techniques-for-writing-quality-code


The Joel Test: 12 Steps to Better Code -     http://www.joelonsoftware.com/articles/fog0000000043.html
http://www.javacodegeeks.com/2010/12/things-every-programmer-should-know.html
http://www.indiangeek.net/wp-content/uploads/Programmer%20competency%20matrix.htm


Code Smells
http://sourcemaking.com/refactoring/bad-smells-in-code
http://www.codinghorror.com/blog/2006/05/code-smells.html
http://www.soberit.hut.fi/mmantyla/BadCodeSmellsTaxonomy.htm


Anti Patterns
http://sourcemaking.com/antipatterns
http://en.wikipedia.org/wiki/Anti-pattern
TDD
http://programmers.stackexchange.com/questions/86636/tdd-vs-productivity
http://osherove.com/blog/2005/4/3/naming-standards-for-unit-tests.html
http://vimeo.com/5812605
http://vimeo.com/5813145
http://xunitpatterns.com/
http://stackoverflow.com/questions/96297/what-are-some-popular-naming-conventions-for-unit-tests
http://blog.james-carr.org/2006/11/03/tdd-anti-patterns/
http://www.infoq.com/interviews/coplien-martin-tdd
http://powersoftwo.agileinstitute.com/2011/11/five-key-ingredients-of-essential-test.html
Move Specificity Towards the Tests http://vimeo.com/5895145


Refactoring
Code Examples : http://refactormycode.com/codes/recent/java
Getting Empirical about Refactoring    http://www.stickyminds.com/sitewide.asp?Function=edetail&ObjectType=COL&ObjectId=16679&tth=DYN&tt=siteemail&iDyn=2
http://sourcemaking.com/refactoring
http://www.cleal.com/refactoringgolf.html
http://addcasts.com/2011/12/12/episode-15-michael-feathers-chats-about-refactoring-in-the-fourth-dimension-seducing-end-users-and-letting-code-die/
SOLID
http://hanselminutes.com/145/solid-principles-with-uncle-bob-robert-c-martin
41st episode of the StackOverflow podcast, where Joel and Jeff sit down with Robert Martin aka “Uncle Bob”, and discuss software quality, the value of software engineering principles, and test-driven development.
http://blog.sanaulla.info/2011/11/16/solid-single-responsibility-principle/#more-1134
http://blog.stackoverflow.com/2009/02/podcast-41/
http://www.objectmentor.com/resources/articles/ocp.pdf
http://www.itmaybeahack.com/book/oodesign-java-2.1/latex/BuildingSkillsinOODesign.pdf

- Coupling
  - See [More about OOPS](docs/oops-advanced.md)
- Cohesion
  - [More about OOPS](docs/oops-advanced.md)
- Solid Principles
- Object class
  - TODO ObjectExamples.java missing
- toString method
  - [Example](src/main/java/com/in28minutes/java/object/ToStringExamples.java)
- hashCode method
  - [Example](src/main/java/com/in28minutes/java/object/EqualsHashCodeExamples.java)
  - HashCode's are used in hashing to decide which group (or bucket) an object should be placed into. A group of object's might share the same hashcode.
  - The implementation of hashcode decides effectiveness of Hashing. A good hashing function evenly distributes object's into different groups (or buckets).
- equals method
  - [Example](src/main/java/com/in28minutes/java/object/EqualsHashCodeExamples.java)

- Concurrency in Collections
  - Synchronized collections are implemented using synchronized methods and synchronized blocks. Only one thread can executing any of the synchronized code at a given point in time. This places severe restrictions on the concurrency of threads – thereby affecting performance of the application. All the pre Java 5 synchronized collections (HashTable & Vector, for example) use this approach. Post Java 5, collections using new approaches to synchronization are available in Java. These are called concurrent collections. More details below.
  - When many threads are expected to access a given collection, a ConcurrentHashMap is normally preferable to a synchronized HashMap, and a ConcurrentSkipListMap is normally preferable to a synchronized TreeMap. A CopyOnWriteArrayList is preferable to a synchronized ArrayList when the expected number of reads and traversals greatly outnumber the number of updates to a list.
  - Copy on Write
    - All values in collection are stored in an internal immutable (not-changeable) array. A new array is created if there is any modification to the collection. 
    - Read operations are not synchronized. Only write operations are synchronized.
    - Copy on Write approach is used in scenarios where reads greatly out number write’s on a collection. CopyOnWriteArrayList & CopyOnWriteArraySet are implementations of this approach. Copy on Write collections are typically used in Subject – Observer scenarios, where the observers very rarely change. Most frequent operations would be iterating around the observers and notifying them.
    - Example : CopyOnWriteArrayList : public boolean add(E e)
  - Locks
    - CopyOnWriteArrayList : final ReentrantLock lock = this.lock; 
    - When 10 methods are declared as synchronized, only one of them is executed by any of the threads at any point in time.  This has severe performance impact.  
    - Another new approach introduced in Java 5 is to use lock and unlock methods. Lock and unlock methods are used to divide methods into different blocks and help enhance concurrency. The 10 methods can be divided into different blocks, which can be synchronized based on different variables.
- Concurrent Modification & Fail Safe vs Fail Fast
  - Concurrent Modification : Changes made to collection when one or more threads are iterating over it.
  - Fail Fast : Throws Concurrent Modification Exception if there are Concurrent Modifications
  - Fail Safe : Fail Safe Iterator makes copy of the internal data structure (object array) and iterates over the copied data structure. 
  - Fail Safe is efficient when traversal operations vastly outnumber mutations
  - [FailFast](src/main/java/com/in28minutes/java/collections/FailFast.java)
  - [FailSafe](src/main/java/com/in28minutes/java/collections/FailSafe.java)
- Atomic Operations
  - Atomic Access Java Tutorial states “In programming, an atomic action is one that effectively happens all at once. An atomic action cannot stop in the middle: it either happens completely, or it doesn't happen at all. No side effects of an atomic action are visible until the action is complete”.
  - Let’s assume we are writing a multi threaded program. Let’s create an int variable i.  Even a small operation, like i++ (increment), is not thread safe. i++ operation involves three steps.
    - Read the value which is currently stored in i 
    - Add one to it (atomic operation). 
    - Store it in i
  - In a multi-threaded environment, there can be unexpected results. For example, if thread1 is reading the value (step 1) and immediately after thread2 stores the value (step 3).
  - To prevent these, Java provides atomic operations. Atomic operations are performed as a single unit without interference from other threads ensuring data consistency. 
  - A good example is AtomicInteger. To increment a value of AtomicInteger, we use the  incrementAndGet() method. Java ensures this operation is Atomic.

# Java New Features
\readme.txt
```
## Java 5
### StringBuilder class
### Generics
### Enhanced for Loop
### Autoboxing/Unboxing
- Adding a primitive to Collection
- Using a primitive as a key to access the collection
- Incrementing a Wrapper Variable
### Typesafe Enums
### Varargs
### Static Import
import static java.lang.Math.PI;
or en masse:
import static java.lang.Math.*;
### Metadata (Annotations)
/**
 * Describes the Request-For-Enhancement(RFE) that led
 * to the presence of the annotated API element.
 */
public @interface RequestForEnhancement {
    int    id();
    String synopsis();
    String engineer() default "[unassigned]"; 
    String date();    default "[unimplemented]"; 
}

@RequestForEnhancement(
    id       = 2868724,
    synopsis = "Enable time-travel",
    engineer = "Mr. Peabody",
    date     = "4/1/3007"
)
public static void travelThroughTime(Date destination) { ... }


In annotations with a single element, the element should be named value, as shown below:
/**
 * Associates a copyright notice with the annotated API element.
 */
public @interface Copyright {
    String value();
}

@Copyright("2002 Yoyodyne Propulsion Systems")
public class OscillationOverthruster { ... }

import java.lang.annotation.*;

/**
 * Indicates that the annotated method is a test method.
 * This annotation should be used only on parameterless static methods.
 */
@Retention(RetentionPolicy.RUNTIME)//indicates that annotations with this type are to be retained by the VM so they can be read reflectively at run-time
@Target(ElementType.METHOD)//this annotation type can be used to annotate only method declarations.
public @interface Test { }


public class Foo {
    @Test public static void m1() { }
    public static void m2() { }
    @Test public static void m3() {
        throw new RuntimeException("Boom");
    }
    public static void m4() { }
    @Test public static void m5() { }
    public static void m6() { }
    @Test public static void m7() {
        throw new RuntimeException("Crash");
    }
    public static void m8() { }
}

import java.lang.reflect.*;

public class RunTests {
   public static void main(String[] args) throws Exception {
      int passed = 0, failed = 0;
      for (Method m : Class.forName(args[0]).getMethods()) {
         if (m.isAnnotationPresent(Test.class)) {
            try {
               m.invoke(null);
               passed++;
            } catch (Throwable ex) {
               System.out.printf("Test %s failed: %s %n", m, ex.getCause());
               failed++;
            }
         }
      }
      System.out.printf("Passed: %d, Failed %d%n", passed, failed);
   }
}

### Concurrent Collections
The java.util.concurrent, java.util.concurrent.atomic, and java.util.concurrent.locks packages provide a extensible framework of high-performance, scalable, thread-safe building blocks for developing concurrent classes and applications, including thread pools, thread-safe collections, semaphores, a task scheduling framework, task synchronization utilities, atomic variables, and locks. Additionally, these packages provide low-level primitives for advanced concurrent programming which take advantage of concurrency support provided by the processor, enabling you to implement high-performance, highly scalable concurrent algorithms in Java to a degree not previously possible without using native code.
### Minor
#### Scanner
 String input = "1 fish 2 fish red fish blue fish";
     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
     System.out.println(s.nextInt());
     System.out.println(s.nextInt());
     System.out.println(s.next());
     System.out.println(s.next());
     s.close(); 
     
## Java 6
NavigableSet - a SortedSet extended with navigation methods reporting closest matches for given search targets. A NavigableSet may be accessed and traversed in either ascending or descending order. This interface is intended to supersede the SortedSet interface.
NavigableMap - a SortedMap extended with navigation methods returning the closest matches for given search targets. A NavigableMap may be accessed and traversed in either ascending or descending key order. This interface is intended to supersede the SortedMap interface
GC Parallel Compaction : Parallel compaction complements the existing parallel collector by performing full GCs in parallel to take advantage of multiprocessor (or multi-threaded) hardware. As the name suggests, it is best suited to platforms that have two or more CPUs or two or more hardware threads. It was first made available in JDK 5.0 update 6; the implementation in JDK 6 contains significant performance improvements.
@Override annotations on methods specified by an interface

## Java 7
### Underscores in Numeric Literals - Any number of underscore characters (_) can appear anywhere between digits in a numerical literal. This feature enables you, for example, to separate groups of digits in numeric literals, which can improve the readability of your code.
### Strings in switch Statements - You can use the String class in the expression of a switch statement.
public String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
     String typeOfDay;
     switch (dayOfWeekArg) {
         case "Monday":
             typeOfDay = "Start of work week";
             break;
         case "Tuesday":
         case "Wednesday":
         case "Thursday":
             typeOfDay = "Midweek";
             break;
         case "Friday":
             typeOfDay = "End of work week";
             break;
         case "Saturday":
         case "Sunday":
             typeOfDay = "Weekend";
             break;
         default:
             throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
     }
     return typeOfDay;
}

### Type Inference for Generic Instance Creation - You can replace the type arguments required to invoke the constructor of a generic class with an empty set of type parameters (<>) as long as the compiler can infer the type arguments from the context. This pair of angle brackets is informally called the diamond.
Map<String, List<String>> myMap = new HashMap<String, List<String>>();
In Java SE 7, you can substitute the parameterized type of the constructor with an empty set of type parameters (<>):
Map<String, List<String>> myMap = new HashMap<>();//Note that to take advantage of automatic type inference during generic class instantiation, you must specify the diamond
### The try-with-resources Statement - The try-with-resources statement is a try statement that declares one or more resources. A resource is an object that must be closed after the program is finished with it. The try-with-resources statement ensures that each resource is closed at the end of the statement. Any object that implements the new java.lang.AutoCloseable interface or the java.io.Closeable interface can be used as a resource. The classes java.io.InputStream, OutputStream, Reader, Writer, java.sql.Connection, Statement, and ResultSet have been retrofitted to implement the AutoCloseable interface and can all be used as resources in a try-with-resources statement.
 The class BufferedReader, in Java SE 7 and later, implements the interface java.lang.AutoCloseable. Because the BufferedReader instance is declared in a try-with-resource statement, it will be closed regardless of whether the try statement completes normally or abruptly (as a result of the method BufferedReader.readLine throwing an IOException).
static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {
  BufferedReader br = new BufferedReader(new FileReader(path));
  try {
    return br.readLine();
  } finally {
    if (br != null) br.close();
  }
}

static String readFirstLineFromFile(String path) throws IOException {
  try (BufferedReader br = new BufferedReader(new FileReader(path))) {
    return br.readLine();
  }
}

You may declare one or more resources in a try-with-resources statement. The following example retrieves the names of the files packaged in the zip file zipFileName and creates a text file that contains the names of these files:

  public static void writeToFileZipFileContents(String zipFileName, String outputFileName)
    throws java.io.IOException {

    java.nio.charset.Charset charset = java.nio.charset.Charset.forName("US-ASCII");
    java.nio.file.Path outputFilePath = java.nio.file.Paths.get(outputFileName);

    // Open zip file and create output file with try-with-resources statement

    try (
      java.util.zip.ZipFile zf = new java.util.zip.ZipFile(zipFileName);
      java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(outputFilePath, charset)
    ) {

      // Enumerate each entry

      for (java.util.Enumeration entries = zf.entries(); entries.hasMoreElements();) {

        // Get the entry name and write it to the output file

        String newLine = System.getProperty("line.separator");
        String zipEntryName = ((java.util.zip.ZipEntry)entries.nextElement()).getName() + newLine;
        writer.write(zipEntryName, 0, zipEntryName.length());
      }
    }
  }
In this example, the try-with-resources statement contains two declarations that are separated by a semicolon: ZipFile and BufferedWriter. When the block of code that directly follows it terminates, either normally or because of an exception, the close methods of the BufferedWriter and ZipFile objects are automatically called in this order. Note that the close methods of resources are called in the opposite order of their creation.

The following example uses a try-with-resources statement to automatically close a java.sql.Statement object:

  public static void viewTable(Connection con) throws SQLException {

    String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";

    try (Statement stmt = con.createStatement()) {

      ResultSet rs = stmt.executeQuery(query);

      while (rs.next()) {
        String coffeeName = rs.getString("COF_NAME");
        int supplierID = rs.getInt("SUP_ID");
        float price = rs.getFloat("PRICE");
        int sales = rs.getInt("SALES");
        int total = rs.getInt("TOTAL");
        System.out.println(coffeeName + ", " + supplierID + ", " + price +
                           ", " + sales + ", " + total);
      }

    } catch (SQLException e) {
      JDBCTutorialUtilities.printSQLException(e);
    }
  }

### Catching Multiple Exception Types and Rethrowing Exceptions with Improved Type Checking - A single catch block can handle more than one type of exception. In addition, the compiler performs more precise analysis of rethrown exceptions than earlier releases of Java SE. This enables you to specify more specific exception types in the throws clause of a method declaration.
catch (IOException ex) {
     logger.log(ex);
     throw ex;
catch (SQLException ex) {
     logger.log(ex);
     throw ex;
}
In releases prior to Java SE 7, it is difficult to create a common method to eliminate the duplicated code because the variable ex has different types.

The following example, which is valid in Java SE 7 and later, eliminates the duplicated code:

catch (IOException|SQLException ex) {
    logger.log(ex);
    throw ex;
}


#8 More new I/O APIs for the Java platform (NIO.2)
 
A new set of I/O APIs and features were introduced in Java 1.4 under the java.nio package. This addition was called the New I/O APIs, also known as NIO. Naming something New is always short-sighted because it will not remain new forever. When the next version comes along, what should the new version be called, the NEW NEW I/O? Java 1.7 offers a rich set of new features and I/O capabilities, called NIO.2 (New I/O version 2?). Here are the key highlights of NIO.2.
 
a) Package
 
The most important package to look for is java.nio.file. This package contains many practical file utilities, new file I/O related classes and interfaces.
 
b) The java.nio.file.Path interface
 
Path is probably the new class that developers will use most often. The file referred by the path does not need to exist. The file referred to does not need to exist. For all practical purposes, you can think of replacing java.io.File with java. io.Path.
 
Old Way

File file = new File(“hello.txt”);
System.out.println(“File exists() == ” + file.exists());
 
New Way

Path path = FileSystems.getDefault().getPath(“hello.txt”);
System.out.println(“Path exists() == ” + Files.exists(path));
 
c) The java.nio.file.Files class

The Files class offers over 50 utility methods for File related operations which many developers would have wanted to be a part of earlier Java releases. Here are some methods to give you a sense of the range of methods offered. • copy() – copy a file, with options like REPLACE_EXISTING, NOFOLLOW_LINKS public static Path copy(Path source, Path target, CopyOption… options);
 
• move() – move or rename a file public static Path move(Path source, Path target, CopyOption… options);
 
• newInputStream() – create input stream public static InputStream newInputStream(Path path, OpenOption… options);
 
• readAllBytes() – similar to the Apache IOUtils.readFile-ToByteArray public static byte[] readAllBytes(Path path) throws IOException;
 
• createSymbolicLink() – creates a symbolic link, if supported by the file system public static Path createSymbolicLink(Path link, Path target, FileAttribute<?>… attrs) throws IOException
 
 
d) WatchService API
 
WatchService API is a new feature introduced in Java 1.7. It provides an API that lets you “listen” to a certain type of file system events. Your code gets called automatically when those events occur. Examples of event types are captured by StandardWatchEventKinds class.
 
• ENTRY_CREATE:an entry is created or renamed in the directory
• ENTRY_DELETE:an entry is created or renamed out of the directory
• ENTRY_MODIFY:a directory entry is modified
 
Example
Here’s a full example of how to watch a directory and print any newly created files.
 
 
Run the above program. Then create a file ‘new.txt’ in the directory ‘logs’. The program will print:
logs: new file created new.txt

## Java 8
Java Programming Language
### Lambda Expressions, a new language feature, has been introduced in this release. They enable you to treat functionality as a method argument, or code as data. Lambda expressions let you express instances of single-method interfaces (referred to as functional interfaces) more compactly.
### Method references provide easy-to-read lambda expressions for methods that already have a name.
### Default methods enable new functionality to be added to the interfaces of libraries and ensure binary compatibility with code written for older versions of those interfaces.
### Repeating Annotations provide the ability to apply the same annotation type more than once to the same declaration or type use.
Repeating Annotations - It is now possible to apply the same annotation type more than once to the same declaration or type use. For more information, see Repeating Annotations in the new Annotations lesson in the Java Tutorial.
### Type Annotations provide the ability to apply an annotation anywhere a type is used, not just on a declaration. Used with a pluggable type system, this feature enables improved type checking of your code.
Annotations on Java Types - It is now possible to apply an annotation anywhere a type is used. Used in conjunction with a pluggable type system, this allows for stronger type checking of your code. For more information, see Type Annotations and Pluggable Type Systems in the new Annotations lesson in the Java Tutorial.
### Improved type inference.
### Method parameter reflection.
### Classes in the new java.util.stream package provide a Stream API to support functional-style operations on streams of elements. The Stream API is integrated into the Collections API, which enables bulk operations on collections, such as sequential or parallel map-reduce transformations.
### Performance Improvement for HashMaps with Key Collisions
### Scripting : Nashorn Javascript Engine
This is the javascript engine that enables us to run javascript to run on a  jvm. It is similar to the V8 engine provided by chrome over which Node.js runs. It is compatible with Node.js applications while also allowing actual Java libraries to be called by the javascript code running on server. This is exciting to say at the least as it marries scalability and asynchronous nature of Node.js with safe and widespread server side Java middleware directly.
###java.lang and java.util Packages : Parallel Array Sorting & Standard Encoding and Decoding Base64 & Unsigned Arithmetic Support
### Enhanced methods using Lambdas and Streams
```
Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8 };
List<Integer> listOfIntegers =
    new ArrayList<>(Arrays.asList(intArray));
    System.out.println("Sum of integers: " +
        listOfIntegers
            .stream()
            .reduce(Integer::sum).get());
```

            
### Switching to the new Date API
Java 8 introduces a complete new date-time API.  You kind of know it’s about time when most of the methods of the current one are marked as deprecated... The new API brings ease-of-use and accuracy long provided by the popular Joda time API into the core Java library.
As with any new API the good news is that it’s more elegant and functional. Unfortunately there are still vast amounts of code out there using the old API, and that won’t change any time soon.
To help bridge the gap between the old and new API’s, the venerable Date class now has a new method called toInstant() which converts the Date into the new representation. This can be especially effective in those cases where you're working on an API that expects the classic form, but would like to enjoy everything the new API has to offer.

Note that classical object-oriented programming and functional programming, as extremes, might appear to be in conflict. But the idea is to get the best from both programming paradigms, so you have a better chance of having the right tool for the job! We discuss this in detail in the next two sections: functions in Java and the new Streams API.
Coping with changing requirements
Behavior parameterization
Anonymous classes
Preview of lambda expressions
Anonymous— We say anonymous because it doesn’t have an explicit name like a method would normally have: less to write and think about!
Function— We say function because a lambda isn’t associated with a particular class like a method is. But like a method, a lambda has a list of parameters, a body, a return type, and a possible list of exceptions that can be thrown.
Passed around— A lambda expression can be passed as argument to a method or stored in a variable.
Concise— You don’t need to write a lot of boilerplate like you do for anonymous classes.

The basic syntax of a lambda is either

(parameters) -> expression
or (note the curly braces for statements)

(parameters) -> { statements; }

You can use a lambda expression in the context of a functional interface. 

Functional interface specifies only one abstract method
public interface Predicate<T>{
    boolean test (T t);
}

Another example is Comparator interface

What about @FunctionalInterface?



Functional interface

Function descriptor

Primitive specializations

Predicate<T>  T -> boolean
Consumer<T> T -> void
Function<T, R>  T -> R
Supplier<T> () -> T
UnaryOperator<T>  T -> T
BinaryOperator<T> (T, T) -> T
BiPredicate<L, R> (L, R) -> boolean  
BiConsumer<T, U>  (T, U) -> void
BiFunction<T, U, R>


#STREAMS
 many Stream functions are lazy, you do need to use an eager operation such as collect at the end of a sequence of chained method calls
 
 A higher-order function is a function that either takes another function as an argument or returns a function as its result.
 
 map is a higher-order function because its mapper argument is a function. In fact, nearly all the functions that we’ve encountered on the Stream interface are higher-order functions.
 
 Method References
 
 country -> country.getName();
 Country::name();
 
 
 //.parallelStream()
 On a 4-core machine with < 50 students, the sequential code was multiple times faster. 
 At 100 students, almost same
 At 10,000 students, parallel code multiple times faster.
 
 ## Interfaces
In support of Streams, there are new methods in interfaces such as List, Map, and Set, which have been largely unchanged since the long-gone days of Java 1.1. Fortunately the Java 8 language support adds a default method type in interfaces, so your custom implementations of these interfaces are not required to change (as long as you make sure you change your IDE settings to Java 8 Compiler Compliance).
As one example of default methods in action, Iterable gets a new default method called forEach(), which lets you write code like this:
myList.forEach(o -> /* do something with o here... */);
This is discussed further in Iterable.forEach method (Java 8).
A new JavaScript implementation codenamed Nashorn is available via javax.script (see Calling Other Languages via javax.script) and can also be run from the command line.
 
#Functional Programming 
  a programming paradigm, a style of building the structure and elements of computer programs, that treats computation as the evaluation of mathematical functions and avoids state and mutable data. Functional programming emphasizes functions that produce results that depend only on their inputs and not on the program state - i.e. pure mathematical functions. It is a declarative programming paradigm, which means programming is done with expressions. In functional code, the output value of a function depends only on the arguments that are input to the function, so calling a function f twice with the same value for an argument x will produce the same result f(x) both times. Eliminating side effects, i.e. changes in state that don’t depend on the function inputs, can make it much easier to understand and predict the behavior of a program, which is one of the key motivations for the development of functional programming
```
\src\com\in28minutes\java\newfeatures\threads\Example1.java
```
package com.in28minutes.java.newfeatures.threads;

import java.util.concurrent.TimeUnit;

public class Example1 {
  public static void main(String[] args) {
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        try {
          String threadName = Thread.currentThread().getName();
          System.out.println("Start " + threadName);
          TimeUnit.SECONDS.sleep(1);
          System.out.println("End " + threadName);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }

    };

    Thread thread1 = new Thread(runnable);
    thread1.start();

    Thread thread2 = new Thread(runnable);
    thread2.start();

    System.out.println("Done!");
  }
}
```
\src\com\in28minutes\java\newfeatures\threads\Example2.java
```
package com.in28minutes.java.newfeatures.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example2 {
  public static void main(String[] args) {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.submit(() -> {
      String threadName = Thread.currentThread().getName();
      System.out.println("Hello " + threadName);
    });

  }
}
```
\src\com\in28minutes\java\newfeatures\threads\ThreadLocalExample1.java
```
package com.in28minutes.java.newfeatures.threads;

import java.util.Random;

public class ThreadLocalExample1 {

  public static class ThreadClass implements Runnable {
    int value;
    Random ran = new Random();

    @Override
    public void run() {
      value = ran.nextInt();
      System.out.println(Thread.currentThread().getName() + "START" + value);
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
      }
      System.out.println(Thread.currentThread().getName() + " END " + value);
    }

  }

  public static void main(String[] args) throws InterruptedException {
    ThreadClass sharedThreadInstance = new ThreadClass();
    Thread thread1 = new Thread(sharedThreadInstance);
    Thread thread2 = new Thread(sharedThreadInstance);
    Thread thread3 = new Thread(sharedThreadInstance);

    // Start all Threads
    thread1.start();
    thread2.start();
    thread3.start();

    // Wait for all threads to complete
    thread1.join();
    thread2.join();
    thread3.join();
  }

}
```
\src\com\in28minutes\java\newfeatures\threads\ThreadLocalExample2.java
```
package com.in28minutes.java.newfeatures.threads;

import java.util.Random;

public class ThreadLocalExample2 {

  public static class ThreadClass implements Runnable {
    ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
    Random ran = new Random();

    @Override
    public void run() {
      threadLocal.set(ran.nextInt());
      System.out.println(Thread.currentThread().getName() + "START" + threadLocal.get());
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
      }
      System.out.println(Thread.currentThread().getName() + " END " + threadLocal.get());
    }

  }

  public static void main(String[] args) throws InterruptedException {
    ThreadClass sharedThreadInstance = new ThreadClass();
    Thread thread1 = new Thread(sharedThreadInstance);
    Thread thread2 = new Thread(sharedThreadInstance);
    Thread thread3 = new Thread(sharedThreadInstance);

    // Start all Threads
    thread1.start();
    thread2.start();
    thread3.start();

    // Wait for all threads to complete
    thread1.join();
    thread2.join();
    thread3.join();
  }

}
```
\test\LambdaExpressionTest.java
```
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.Test;

public class LambdaExpressionTest {

  Course course = new Course("Java New Features",
      Arrays.asList(new Student("Ranga", "India", 90), new Student("Bill", "United States", 80)));

  public File[] getDirectories(String path) {
    File[] hiddenFiles = new File(path).listFiles(new FileFilter() {
      @Override
      public boolean accept(File file) {
        return file.isDirectory();
      }

    });

    return hiddenFiles;
  }

  public File[] getDirectoriesPassingaFunction(String path) {
    return new File(path).listFiles(File::isDirectory);
  }

  class Student {
    private String name;
    private String country;
    private int marks;

    public Student(String name, String country, int marks) {
      super();
      this.name = name;
      this.country = country;
      this.marks = marks;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getCountry() {
      return country;
    }

    public void setCountry(String country) {
      this.country = country;
    }

    public int getMarks() {
      return marks;
    }

    public void setMarks(int marks) {
      this.marks = marks;
    }

    @Override
    public String toString() {
      return "Student [name=" + name + ", country=" + country + ", marks=" + marks + "]";
    }

  }

  class Course {
    private String name;
    private List<Student> students;

    public Course(String name, List<Student> students) {
      super();
      this.name = name;
      this.students = students;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public List<Student> getStudents() {
      return students;
    }

    public void setStudents(List<Student> students) {
      this.students = students;
    }

    public void printStudentsFrom(String country) {
      for (Student student : students) {
        if (country.equals(student.getCountry())) {
          System.out.println(student);
        }
      }
    }

    public void printStudentsWithMarksGreaterThan(int min) {
      for (Student student : students) {
        if (student.getMarks() > min) {
          System.out.println(student);
        }
      }
    }

    public void printStudentsWithMarksWithinRange(int min, int max) {
      for (Student student : students) {
        if (student.getMarks() > min && student.getMarks() <= max) {
          System.out.println(student);
        }
      }
    }

    public void printStudentsSatisfyingCheck(CheckStudent check) {
      for (Student student : students) {
        if (check.test(student)) {
          System.out.println(student);
        }
      }
    }

    /*
     * Predefined Interface interface Predicate<T> { boolean test(T t); }
     */
    public void printStudentsSatisfyingPredicate(Predicate<Student> check) {
      for (Student student : students) {
        if (check.test(student)) {
          System.out.println(student);
        }
      }
    }

    public void consumeStudentsSatisfyingPredicate(Predicate<Student> check, Consumer<Student> consumer) {
      for (Student student : students) {
        if (check.test(student)) {
          consumer.accept(student);
        }
      }
    }

  }

  interface CheckStudent {
    boolean test(Student student);
  }

  @Test
  public void testGetDirectories() {
    assertEquals(4, getDirectories(".").length);
    assertEquals(4, getDirectoriesPassingaFunction(".").length);
  }

  @Test
  public void testPrintStudentsFrom() {
    course.printStudentsFrom("India");
  }

  @Test
  public void testPrintStudentsWithMarksGreaterThan() {
    course.printStudentsWithMarksGreaterThan(70);
  }

  @Test
  public void testPrintStudentsWithMarksGreaterThanWithCustomCheck() {
    course.printStudentsSatisfyingCheck(new CheckStudent() {
      @Override
      public boolean test(Student student) {
        return student.getMarks() > 70 && student.getMarks() <= 90;
      }

    });
  }

  @Test
  public void testCreationOfReusableFunction() {
    final Function<Integer, Predicate<Student>> marksGreaterThan = minimumMarks -> student -> student
        .getMarks() > minimumMarks;
  }

  @Test
  public void testPrintStudentsWithMarksGreaterThanWithCustomCheckAndLambda() {
    course.printStudentsSatisfyingCheck((Student student) -> student.getMarks() > 70 && student.getMarks() <= 90);
  }

  @Test
  public void testPrintStudentsWithMarksGreaterThanWithPredicateAndLambda() {
    course.printStudentsSatisfyingPredicate(
        (Student student) -> student.getMarks() > 70 && student.getMarks() <= 90);
  }

  @Test
  public void testConsumeStudentsSatisfyingPredicate() {
    course.consumeStudentsSatisfyingPredicate(
        (Student student) -> student.getMarks() > 70 && student.getMarks() <= 90,
        (Student student) -> System.out.println(student));
  }

  @Test
  public void testPreviousFunctionWithStreams() {
    course.getStudents().stream().filter(student -> student.getMarks() > 70 && student.getMarks() <= 90)
        .forEach(student -> System.out.println(student));
  }

  @Test
  public void testPreviousFunctionWithStreams_findFirst() {
    // Optional class is useful whenever the result may be absent.
    Optional<Student> first = course.getStudents().stream()
        .filter(student -> student.getMarks() > 70 && student.getMarks() <= 90).findFirst();
    System.out.println(first.get());
  }

  @Test
  public void compareStudentsUsingLambdas() {
    // Behavior parameterization
    course.getStudents().sort((Student s1, Student s2) -> Integer.compare(s1.getMarks(), s2.getMarks()));
    System.out.println(course.getStudents());
  }

}
```
\test\LambdaExpressionTest2.java
```
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.Test;

public class LambdaExpressionTest2 {

  public class Person {

    private final String name;
    private final int age;

    public Person(final String theName, final int theAge) {
      name = theName;
      age = theAge;
    }

    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }

    public int ageDifference(final Person other) {
      return age - other.age;
    }

    @Override
    public String toString() {
      return String.format("%s - %d", name, age);
    }
  }

  final List<Person> people = Arrays.asList(new Person("John", 20), new Person("Sara", 21), new Person("Jane", 21),
      new Person("Greg", 35));

  @Test
  public void testSomething() {

    final Function<String, Predicate<String>> startsWithLetter = (
        String letter) -> (String name) -> name.startsWith(letter);

    final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

    friends.stream().forEach(System.out::println);

    friends.stream().map(String::toUpperCase).forEach(System.out::println);

    friends.stream().filter(startsWithLetter.apply("N")).forEach(System.out::println);

    System.out.println(friends.stream().reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).get());

    System.out.println(friends.stream().map(String::toUpperCase).collect(Collectors.joining(", ")));

    final String str = "text1234";

    str.chars().forEach(ch -> System.out.println(ch));

    str.chars().filter(Character::isDigit).forEach(System.out::println);

    people.stream().sorted((p1, p2) -> p1.ageDifference(p2)).forEach(System.out::println);

    people.stream().sorted(Person::ageDifference).forEach(System.out::println);

    people.stream().sorted((person1, person2) -> person1.getName().compareTo(person2.getName()))
        .forEach(System.out::println);

  }

  @Test
  public void lambdaExpression_simpleExample() {
    List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
    numbers.stream().filter(StreamsTest::isOdd).forEach(number -> System.out.print(number));
    // 137
  }

  @Test
  public void lambdaExpression_predicate() {
    List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
    numbers.stream().filter((number) -> (number % 2 != 0)).forEach(number -> System.out.print(number));
    // 137
  }

  @Test
  public void lambdaExpression_BiFunction() {
    List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
    numbers.stream().forEach(number -> System.out.print(number));
    // 137
  }

}
```
\test\StreamsTest.java
```

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamsTest {

  @Test
  public void streamsBasics_creatingAStream() {
    List<String> list = Stream.of("Apple", "Banana", "Mango").collect(Collectors.toList());
    assertEquals(Arrays.asList("Apple", "Banana", "Mango"), list);
  }

  @Test
  public void streamsBasics_mappingAValueToAnother() {
    List<String> collected = Stream.of("Apple", "Banana", "Mango").map(value -> value.toUpperCase())
        .collect(Collectors.toList());

    assertEquals(Arrays.asList("APPLE", "BANANA", "MANGO"), collected);
  }

  @Test
  public void streamsBasics_filtering() {
    List<String> initCaps = Stream.of("Apple", "Banana", "mango")
        .filter(value -> Character.isUpperCase(value.charAt(0))).collect(Collectors.toList());

    assertEquals(Arrays.asList("Apple", "Banana"), initCaps);
  }

  class Country {
    private String name;
    private long area;
    private long population;
    private String continent;

    public Country(String name, long area, long population, String continent) {
      super();
      this.name = name;
      this.area = area;
      this.population = population;
      this.continent = continent;
    }

    public String getName() {
      return name;
    }

    public long getArea() {
      return area;
    }

    public long getPopulation() {
      return population;
    }

    public String getContinent() {
      return continent;
    }

    @Override
    public String toString() {
      return "Country [name=" + name + ", area=" + area + ", population=" + population + ", continent="
          + continent + "]";
    }

  }

  List<Country> countries = Arrays.asList(new Country("India", 10000, 20000, "Asia"),
      new Country("China", 30000, 30000, "Asia"), new Country("USA", 40000, 10000, "North America"));

  @Test
  public void streamsBasics_min() {
    Country smallestCountryInTheList = countries.stream().min(Comparator.comparing((Country c) -> c.getArea()))
        .get();
    assertEquals("India", smallestCountryInTheList.getName());
  }

  @Test
  public void streamsBasics_max() {
    Country largestCountryInTheList = countries.stream().max(Comparator.comparing((Country c) -> c.getArea()))
        .get();
    assertEquals("USA", largestCountryInTheList.getName());
  }

  @Test
  public void streamsBasics_reduce() {
    int count = Stream.of(100, 200, 300).reduce(0, (acc, element) -> acc + element);
    assertEquals(600, count);
  }

  @Test
  public void streamsBasics_namesOfCountriesWithAreaGreaterThan20000() {
    List<String> countriesWithAreaGreaterThan20000 = countries.stream()
        .filter((Country country) -> country.getArea() > 20000).map(c -> c.getName())
        .collect(Collectors.toList());
    assertEquals(Arrays.asList("China", "USA"), countriesWithAreaGreaterThan20000);
  }

  @Test
  public void streamsBasics_namesOfCountriesWithAreaGreaterThan20000_methodReferences() {
    List<String> countriesWithAreaGreaterThan20000 = countries.stream()
        .filter((Country country) -> country.getArea() > 20000).map(Country::getName)
        .collect(Collectors.toList());
    assertEquals(Arrays.asList("China", "USA"), countriesWithAreaGreaterThan20000);
  }

  @Test
  public void streamsBasics_max_methodReferences() {
    Country largestCountryInTheList = countries.stream().max(Comparator.comparing(Country::getArea)).get();
    assertEquals("USA", largestCountryInTheList.getName());
  }

  @Test
  public void streamsBasics_group() {
    Map<String, List<Country>> countriesGroupedByContinent = countries.stream()
        .collect(Collectors.groupingBy(country -> country.getContinent()));
    System.out.println(countriesGroupedByContinent.get("Asia"));
  }

  @Test
  public void streamsBasics_groupAndCount() {
    Map<String, Long> countOfCountriesInContinent = countries.stream()
        .collect(Collectors.groupingBy(country -> country.getContinent(), Collectors.counting()));
    assertEquals(2, countOfCountriesInContinent.get("Asia").longValue());
  }

  @Test
  public void streamsBasics_partition() {
    Map<Boolean, List<Country>> partitionBasedOnContinentAsiaOrNot = countries.stream()
        .collect(Collectors.partitioningBy(country -> country.getContinent().equals("Asia")));
    System.out.println(partitionBasedOnContinentAsiaOrNot.get(true));
  }

  @Test
  public void streamsBasics_joinAsString() {
    Map<Boolean, List<Country>> partitionBasedOnContinentAsiaOrNot = countries.stream()
        .collect(Collectors.partitioningBy(country -> country.getContinent().equals("Asia")));

    List<Country> countriesInAsia = partitionBasedOnContinentAsiaOrNot.get(true);
    String joinedByComma = countriesInAsia.stream().map(Country::getName)
        .collect(Collectors.joining(",", "[", "]"));
    assertEquals("[India,China]", joinedByComma);
  }

  List<Integer> values = new ArrayList<>();

  {
    for (int i = 1; i < 10000000; i++) {
      values.add(i);
    }
  }

  @Test
  public void streamsBasics_performance_parallelStream() {
    int sum = values.parallelStream().mapToInt(i -> i).sum();
    System.out.println(sum);
  }

  @Test
  public void streamsBasics_performance_stream() {
    int sum = values.stream().mapToInt(i -> i).sum();
    System.out.println(sum);
  }

  @Test
  public void streamsBasics_performance_loop() {
    int sum = 0;
    for (int value : values)
      sum += value;
    System.out.println(sum);
  }

  @Test
  public void sumOfOddNumbers_Usual() {
    List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
    int sum = 0;
    for (int number : numbers)
      if (number % 2 != 0)
        sum += number;
    assertEquals(11, sum);
  }

  @Test
  public void sumOfOddNumbers_FunctionalProgramming() {
    List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
    int sum = numbers.stream().filter(StreamsTest::isOdd).reduce(0, Integer::sum);
    assertEquals(11, sum);
  }

  static boolean isOdd(int number) {
    return number % 2 != 0;
  }

  @Test
  public void streamExample_Distinct() {
    List<Integer> numbers = Arrays.asList(1, 1, 2, 6, 2, 3);
    numbers.stream().distinct().forEach(System.out::print);
    // 1263
  }

  @Test
  public void streamExample_Sorted() {
    List<Integer> numbers = Arrays.asList(1, 1, 2, 6, 2, 3);
    numbers.stream().sorted().forEach(System.out::print);
    // 112236
  }

  @Test
  public void streamExample_Filter() {
    List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
    numbers.stream().filter(StreamsTest::isOdd).forEach(System.out::print);
    // 137
  }

  @Test
  public void streamExample_Collect() {
    List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
    List<Integer> oddNumbers = numbers.stream().filter(StreamsTest::isOdd).collect(Collectors.toList());
    System.out.println(oddNumbers);
    // [1, 3, 7]
  }
}
