## Spring Framework 

<!---
Current Directory : /Ranga/001.Notes/00.CoursePreparations/2020-03-Java-New-Features/learn-spring-v2
-->

## Complete Code Example


### /pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.4.4</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.in28minutes</groupId>
	<artifactId>learn-spring-v2</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>learn-spring</name>
	<description>Demo project for Spring Boot</description>
	<properties>
		<java.version>16</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>
```
---

### /src/main/java/com/in28minutes/learnspring/LearnSpringApplication.java

```java
package com.in28minutes.learnspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.learnspring.game.GameRunner;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringApplication.class, args);

		//MarioGame game = new MarioGame();
//		ContraGame game = new ContraGame();
//		GameRunner runner = new GameRunner(game);
//		runner.runGame();
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(LearnSpringApplication.class, args);
		
		GameRunner runner = applicationContext.getBean(GameRunner.class);
		
		runner.runGame();


	}

}
```
---

### /src/main/java/com/in28minutes/learnspring/app/RestApiController.java

```java
package com.in28minutes.learnspring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.in28minutes.learnspring.app.business.BusinessService;

@RestController
public class RestApiController {
	
	@Autowired
	private BusinessService businessService;
	
	@GetMapping("/sum")
	public long calculateSum() {
		return businessService.calculateSum();		
	}

}
```
---

### /src/main/java/com/in28minutes/learnspring/app/business/BusinessService.java

```java
package com.in28minutes.learnspring.app.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspring.app.data.DataService;

@Component
public class BusinessService {

	@Autowired
	private DataService dataService;

	public long calculateSum() {
		List<Integer> data = dataService.retrieveData();
		return data.stream().reduce(Integer::sum).get();
	}

}
```
---

### /src/main/java/com/in28minutes/learnspring/app/data/DataService.java

```java
package com.in28minutes.learnspring.app.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService {

	public List<Integer> retrieveData() {
		return Arrays.asList(12,34,56,78);
	}

}
```
---

### /src/main/java/com/in28minutes/learnspring/game/ContraGame.java

```java
package com.in28minutes.learnspring.game;

import org.springframework.stereotype.Component;

@Component
public class ContraGame implements GamingConsole{
		public void up() {
			System.out.println("Contra - up");
		}

		public void down() {
			System.out.println("Contra - down");
		}

		public void left() {
			System.out.println("Contra - left");
		}

		public void right() {
			System.out.println("Contra - right");
		}
	}
```
---

### /src/main/java/com/in28minutes/learnspring/game/GameRunner.java

```java
package com.in28minutes.learnspring.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	
	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
```
---

### /src/main/java/com/in28minutes/learnspring/game/GamingConsole.java

```java
package com.in28minutes.learnspring.game;

public interface GamingConsole {
	public void up();

	public void down();

	public void left();

	public void right();

}
```
---

### /src/main/java/com/in28minutes/learnspring/game/MarioGame.java

```java
package com.in28minutes.learnspring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MarioGame implements GamingConsole{
		public void up() {
			System.out.println("Mario - up");
		}

		public void down() {
			System.out.println("Go into a hole");
		}

		public void left() {
		}

		public void right() {
			System.out.println("Go Forward");
		}
	}
```
---

### /src/main/resources/application.properties

```properties

```
---

### /src/test/java/com/in28minutes/learnspring/LearnSpringApplicationTests.java

```java
package com.in28minutes.learnspring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnSpringApplicationTests {

	@Test
	void contextLoads() {
	}

}
```
---

## Spring Boot

<!---
Current Directory : /Ranga/001.Notes/00.CoursePreparations/2020-03-Java-New-Features/spring-boot-in-10-steps
-->

## Complete Code Example


### /pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.4.4</version>
		<relativePath /> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.in28minutes</groupId>
	<artifactId>spring-boot-in-10-steps</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>spring-boot-in-10-steps</name>
	<description>Demo project for Spring Boot</description>
	<properties>
		<java.version>11</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>
```
---

### /src/main/java/com/in28minutes/springbootin10steps/Course.java

```java
package com.in28minutes.springbootin10steps;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String author;
	
	public Course() {
		
	}

	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return String.format("Book [id=%s, name=%s, author=%s]", id, name, author);
	}

}
```
---

### /src/main/java/com/in28minutes/springbootin10steps/CourseRepository.java

```java
package com.in28minutes.springbootin10steps;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
```
---

### /src/main/java/com/in28minutes/springbootin10steps/CoursesController.java

```java
package com.in28minutes.springbootin10steps;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController {

	@Autowired
	CourseRepository repository;

	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return repository.findAll();
	}

	@GetMapping("/courses/{id}")
	public Course getCourse(@PathVariable long id) {
		Optional<Course> course = repository.findById(id);

		if (course.isEmpty())
			throw new RuntimeException(id + " Not Found");
		
		return course.get();
	}
	
	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course) {
		repository.save(course);
	}	

	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Course course) {
		repository.save(course);
	}	

	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id) {
		Optional<Course> course = repository.findById(id);

		if (course.isEmpty())
			throw new RuntimeException(id + " Not Found");
		
		repository.deleteById(id);
	}

}
```
---

### /src/main/java/com/in28minutes/springbootin10steps/SpringBootIn10StepsApplication.java

```java
package com.in28minutes.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootIn10StepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIn10StepsApplication.class, args);
	}

}
```
---

### /src/main/resources/application.properties

```properties
#docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=courses-user --env MYSQL_PASSWORD=dummycourses --env MYSQL_DATABASE=courses --name mysql --publish 3306:3306 mysql:5.7
#logging.level.org.springframework= DEBUG
#management.endpoints.web.exposure.include=*
spring.datasource.url=jdbc:h2:mem:testdb

#spring.jpa.hibernate.ddl-auto=update
#spring.datasource.url=jdbc:mysql://localhost:3306/courses
#spring.datasource.username=courses-user
#spring.datasource.password=dummycourses
#spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL57Dialect
```
---

### /src/main/resources/data.sql

```
insert into course(ID,AUTHOR,NAME)
values(100001,'in28minutes','Learn AWS');

insert into course(ID,AUTHOR,NAME)
values(100002,'in28minutes','Learn Microservices');

insert into course(ID,AUTHOR,NAME)
values(100003,'in28minutes','Learn Full Stack');
```
---

### /src/test/java/com/in28minutes/springbootin10steps/SpringBootIn10StepsApplicationTests.java

```java
package com.in28minutes.springbootin10steps;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootIn10StepsApplicationTests {

	@Test
	void contextLoads() {
	}

}
```
---




## Best Use of Course Guide
In this video, we would help you understand how to make the best use of the Course Guide.
The course guide contains:
Details of all the course sections
What exactly do we do in that section?
Step by step details for each section?
Description of exercises for each section
Code snippets and the programs

If you face any errors, you can use the guide to compare and find the problem.

You can also use the course guide when you'd want to revise the concepts. So, you can go into the collections,look at all the things that we have learned, all the code that we have executed, and try to recollect all the things that we have done around it.

I hope you are having a lot of fun and I'll see you in the next step.



##  JShell



Do you know what all great programmers do when they would want to quickly try something? They use JShell.
That's why we use JShell to start learning Java in this course. In the first few sections of the course,
we use JShell to help you get familiar with Java syntax.  With JShell, you make a mistake and JShell immediately tells you what is wrong. Once you are familiar with the basic Java syntax, we'll use the IDE Eclipse. Learning to use JShell is an essential part of learning Java and the great thing about JShell is that you can use JShell available online.

If you have any trouble installing Java on your local machine, you can use JShell from tryjshell.org

Once you get through the formalities of getting started with the course, we will help you to install Java in Section 2. Section 3 and section 4 use JShell. This helps you to get quickly started with Java syntax and solve any common mistakes that Java beginners tend to make.

And after that, we would use an amazing IDE called Eclipse. All the sections starting from Section 5 use Eclipse as the IDE.

A quick tip before you go further with the course. 
Some beginners can face a little bit of trouble installing Java.

One of the important things that you need to remember is to make sure to set something called a Path variable. Step 4 in Section 2 would help you to do that.

If you have any problems installing Java following the instructions in the next section, then don't hesitate to post it in the Q&A. If you're able to install Java successfully on your local machine following the instructions in Section 2, then you can use JShell in your local machine or if you have any problems, what you can do is, while you figure out your problems with installing Java, you can use tryjshell to get started with the first few sections. Do you want to be a modern Java Developer?

Let's get started with learning Java using JShell.


## Install Java
Welcome to this guide where we would help you install Java and Eclipse.

This course is compatible with all latest versions of Java
We are installing JDK, the Java Development Kit

We would want to write programs, we would want to compile them,
we would want to run them and all this is made easy by the Java development kit. 

Go to Google and search for Java JDK download. 
Make a note of this particular folder. 

We'd check for two things: Java and JShell
java -version
jshell -version

jshell
6*8
/exit


## Troubleshooting

Uninstall any of the pre-existing Java installs.

Firewalls or anti-virus software.  Temporarily turn them off and install Java and see if it works out fine.

Corrupted Download - Download again

Java 9 only support a 64-bit Windows. It no longer supports 32-bit Windows. So, make sure that you are using a 64-bit Windows operating system.

The last thing you can check is the path variable. We will look at the path variable in the next video and how to set it for Windows.

ADD LINKS from Troubleshooting Guide!

How does the operating system know where jshell is present?

Goto C:\Program Files\Java on your local machine, you should see a number of folders like this. Try and locate the folder jdk-9 Don't worry about the minor versions C:\Program Files\Java\jdk-9.0.4.
BIN path - C:\Program Files\Java\jdk-9.0.4\bin.

Path is an environment variable.

- Ctrl + Esc and type in env. So, type in env => Edit the system environment variables
- Start, select Control Panel, then go to System, Advanced and then go to Environment Variables.
- back up of the content of your path. 

Restart command prompt


## Minor Things
```
// Java 10
// List.copyOf, Set.copyOf, and Map.copyOf methods
var list = new ArrayList<>(List.of("One", "Two", "Three"));
var immutableList = List.copyOf(list);
System.out.println(immutableList);

// JDK 11 - Files class - readString and writeString
Path pathFileToRead = Paths.get("./resources/data.txt");
String readString = Files.readString(pathFileToRead);
System.out.println(readString);

// JDK 11 - Predicate.not
Predicate<Integer> isEven = x -> (x % 2 == 0);
List<Integer> myNumbers = List.of(1, 5, 8, 9);
myNumbers.stream().filter(isEven.negate()).forEach(System.out::println);
myNumbers.stream().filter(Java10::isEven).forEach(System.out::println);
myNumbers.stream().filter(Predicate.not(Java10::isEven)).forEach(System.out::println);

// JDK 11 - Directly run Java file without compiling - java HelloWorld.java

// JDK 11

// String methods - isBlank, lines, strip, stripLeading, stripTrailing, and
// repeat
// "".isBlank(),"abc".isBlank()
// "1\n2\n3\n".lines().forEach(System.out::println);//Split to streams
// System.out.println(" 1 2 3 ".strip());
// System.out.println(" 1 2 3 ".stripLeading());
// System.out.println(" 1 2 3 ".stripTrailing());
// System.out.println("abc".repeat(10));

// JDK 12
// String methods - indent and transform
System.out.println("sdfalkjfl".transform(s -> s.substring(2)));

// JDK 13
// java.lang.String - formatted
System.out.println("My name is %s".formatted("Ranga"));

// JDK 14
// Helpful NullPointerExceptions (JEP 358)
```

## Modularization

```
Package com.in28minutes.sorting.util

public class MySortingUtil {
	public List<String> sort(List<String> values){
		BubbleSort sort = new BubbleSort();
		return sort.sort(values);
	}

}


Package com.in28minutes.sorting.algorithm
public class BubbleSort {

	public List<String> sort(List<String> values) {
		return values;
	}

}


Package com.in28minutes.consumer
public class SortingUtilConsumer {
	
	private static Logger logger = Logger.getLogger(SortingUtilConsumer.class.getName());
	
	public static void main(String[] args) {
		MySortingUtil util = new MySortingUtil();
		List<String> sorted = util.sort(Arrays.asList("Apple", "Bat", "Cat"));
		System.out.println(sorted);
		logger.info(sorted.toString());
	}

}

package com.in28minutes.consumer

public class DirectConsumer {
	
	public static void main(String[] args) {
		BubbleSort util = new BubbleSort();
		List<String> sorted = util.sort(Arrays.asList("Apple", "Bat", "Cat"));
		System.out.println(sorted);
	}

}


JAR Approach
sorting-jar
consumer-jar

vs 

Modularization Approach
sorting-module
consumer-module

module consumer.module {
	requires sorting.module;
	requires java.logging;
}

module sorting.module {
	exports first.module.util;
}
```


## Type Inference

```
// Type Inference - Java 10

// List<String> numbers = new ArrayList<String>(list);
// List<String> numbers = new ArrayList<>(list);
var numbers = new ArrayList<>(list);
numbers.forEach(s -> System.out.println(s));

for (var i = 0; i <= 10; i++) {
	System.out.println(i);
}

for (var value : list) {
	System.out.println(value);
}

// Good variable names
// Minimize Scope
// Improve readability for chained expressions
```

## Switch Expression

```
public String determinenameofMonthWithSwitch(int monthNumber) {
	switch (monthNumber) {
	case 1:
		return "January";
	case 2:
		return "February";
	case 3:
		return "March";
	case 4:
		return "April";
	case 5:
		return "May";
	case 6:
		return "June";
	case 7:
		return "July";
	case 8:
		return "August";
	case 9:
		return "September";
	case 10:
		return "October";
	case 11:
		return "November";
	case 12:
		return "December";
	default:
		return "Invalid Month";
	}
}

public String determinenameofMonthWithSwitchLabeledRule(int monthNumber) {
	// No fallthrough
	String monthName = switch (monthNumber) {
	case 1 -> {
		System.out.println("January");
		// yield statement is used in a Switch Expression
		// break,continue statements are used in a Switch Statement
		yield "January"; // yield mandatory!
	}
	case 2 -> "February";
	case 3 -> "March";
	case 4 -> "April";
	case 5 -> "May";
	case 6 -> "June";
	case 7 -> "July";
	case 8 -> "August";
	case 9 -> "September";
	case 10 -> "October";
	case 11 -> "November";
	case 12 -> "December";
	default -> "Invalid Month";
	};

	return monthName;
}

public String determinenameofMonthWithSwitchYield(int monthNumber) {
	// No fallthrough
	String monthName = switch (monthNumber) {
	case 1:
		System.out.println("January");
		yield "January";
	case 2:
		yield "February";
	case 3:
		yield "March";
	case 4:
		yield "April";
	case 5:
		yield "May";
	case 6:
		yield "June";
	case 7:
		yield "July";
	case 8:
		yield "August";
	case 9:
		yield "September";
	case 10:
		yield "October";
	case 11:
		yield "November";
	case 12:
		yield "December";
	default:
		yield "Invalid Month";
	};

	return monthName;
}
```
## Text Blocks
```
// JEP 355 Text Blocks -

System.out.println("First Line\nSecond Line\nThird Line");
System.out.println("""
		First Line
		Second Line
		Third Line""");

System.out.println("\"First Line\"\nSecond Line\nThird Line");
System.out.println("""
		"First Line"
			Second Line
			Third Line""");

// Recommended Approach
System.out.println("""
		First Line
		Second Line
		Third Line
		""");

String formattedString = """
		Name: %s
		Email: %s
		Phone: %s
		""".formatted("Ranga", "ranga@in28minutes.com", "123-456-7890");

System.out.print(formattedString);
```

## Records

```
package records.after;

//component fields
//public accessor methods
//canonical constructor 
//equals and hashCode
//toString method

//record Person(String name, String email, String phoneNumber) { }

//record Person(String name, String email, String phoneNumber) { 
//	public Person(String name, String email, String phoneNumber) {
//		if(name==null) {
//			throw new IllegalArgumentException("Name cannot be null");
//		}
//		
//		this.name = name;
//		this.email = email;
//		this.phoneNumber = phoneNumber;
//	}
//}


record Person(String name, String email, String phoneNumber) { 
	
	//compact constructor only allowed inside records
	public Person {
		if(name==null) {
			throw new IllegalArgumentException("Name cannot be null");
		}
	}
	
	// Explicitly Declaration of Methods
    public String email() {
        System.out.println("email is " + email);
        return email;
    }
    
    //You can add static fields, static initializers, and static methods
    //But you CANNOT add instance variables or instance initializers
    //However, you CAN add instance methods
}


public class RecordsEmployeeRunner {
	public static void main(String[] args) {
		Person person = new Person("Ranga","ranga@in28minutes.com","123-456-7890");
		
		System.out.println(person);
		System.out.println(person.email());

	}
}
```

## Spring Beans




Spring Boot
Enable building production ready applications quickly
production-ready features such as metrics, health checks, and externalized configuration
Provide non-functional features
embedded servers (easy deployment with containers)
metrics (monitoring)
health checks (monitoring)
externalized configuration
What Spring Boot is NOT!
ZERO code generation
Neither an application server nor a web server

Features
Quick Starter Projects with Auto Configuration
 - Web
 - JPA
Embedded Servers - Tomcat, Jetty or Undertow
Production-ready features
 - metrics and health checks 
 - externalized configuration

## Diagrams

graph architecture {

node[style=filled,color="#59C8DE"]
//node [style=filled,color="#D14D28", fontcolor=white];
rankdir = TB
node[shape=record,width=1]

GameRunner -- GamingConsole

GamingConsole -- Mario
GamingConsole -- SuperContra
GamingConsole -- PacMan

GameRunner[label=<Game Runner>]
SuperContra[label=<Super Contra>]
GamingConsole[label=<Gaming Console>]


}

graph architecture {

node[style=filled,color="#59C8DE"]
Approach1 [style=filled, fontcolor=white];
rankdir = TB
node[shape=record, width=3, style=filled,color="#D14D28", fontcolor=white]
edge [width=0]
graph [pad=".75", ranksep="0.05", nodesep="0.25"];

Approach1 -- WAR [style=invis]
WAR -- Server [style=invis]
Server -- Java [style=invis]
Java -- OS [style=invis]
OS -- Hardware [style=invis]

Server[label=<Web Server <BR/> (Tomcat/Weblogic/WebSphere etc)>]
Approach1[label=<WAR Approach (OLD)>]
}

graph architecture {

node[style=filled,color="#59C8DE"]
//node [style=filled,color="#D14D28", fontcolor=white];
rankdir = TB
node[shape=record, width=3, style=filled,color="#D14D28", fontcolor=white]
edge [width=0]
graph [pad=".75", ranksep="0.05", nodesep="0.25"];

SpringDataJpa  -- JPA [style=invis]
JPA -- SpringJDBC [style=invis]
SpringJDBC -- JDBC [style=invis]

JAR[label=<JAR <BR/> (Embedded Server - Tomcat ..)>]

}

graph architecture {

node[style=filled,color="#59C8DE"]
//node [style=filled,color="#D14D28", fontcolor=white];
rankdir = TB
node[shape=record, width=1.5, style=filled,color="#D14D28", fontcolor=white]
edge [width=0]
graph [pad=".75", ranksep="0.05", nodesep="0.25"];
Database[shape=cylinder]


Application  -- SpringDataJpa 
SpringDataJpa -- JPA
JPA -- Database

SpringDataJpa[label=<Spring Data JPA>]

}