<!---
Current Directory : /Users/ranga/Ranga/git/00.courses/getting-started-for-beginners-v2/spring-framework-in-10-steps
-->

## Complete Code Example


### /notes.txt

```
Description:

Parameter 0 of constructor in 
com.in28minutes.spring.learnspringframework.game.GameRunner 
required a bean of type 'com.in28minutes.spring.learnspringframework.game.GamingConsole'
that could not be found.


Action:

Consider defining a bean of type 
'com.in28minutes.spring.learnspringframework.game.GamingConsole' in your configuration.



Description:

Parameter 0 of constructor in 
com.in28minutes.spring.learnspringframework.game.GameRunner required a single bean, 
but 2 were found:
	- pacmanGame: defined in file [PacmanGame.class]
	- superContraGame: defined in file [SuperContraGame.class]


Action:

Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed

```
---

### /pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.0.0-M3</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.in28minutes.spring</groupId>
	<artifactId>learn-spring-framework</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>learn-spring-framework</name>
	<description>Demo project for Spring Boot</description>
	<properties>
		<java.version>17</java.version>
	</properties>
	<dependencies>
		
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
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
	<repositories>
		<repository>
			<id>spring-milestones</id>
			<name>Spring Milestones</name>
			<url>https://repo.spring.io/milestone</url>
			<snapshots>
				<enabled>false</enabled>
			</snapshots>
		</repository>
	</repositories>
	<pluginRepositories>
		<pluginRepository>
			<id>spring-milestones</id>
			<name>Spring Milestones</name>
			<url>https://repo.spring.io/milestone</url>
			<snapshots>
				<enabled>false</enabled>
			</snapshots>
		</pluginRepository>
	</pluginRepositories>

</project>
```
---

### /src/main/java/com/in28minutes/spring/learnspringframework/LearnSpringFrameworkApplication.java

```java
package com.in28minutes.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.learnspringframework.enterprise.example.web.MyWebController;
import com.in28minutes.spring.learnspringframework.game.GameRunner;

@SpringBootApplication
//@ComponentScan("com.in28minutes.spring.learnspringframework")
//@ComponentScan({"com.package1", "com.package2"})
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		

		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();

		//GamingConsole game = new MarioGame(); //1
		//GameRunner runner = new GameRunner(game); //2

		ConfigurableApplicationContext context 
					= SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
		
		
	}

}
```
---

### /src/main/java/com/in28minutes/spring/learnspringframework/enterprise/example/business/BusinessService.java

```java
package com.in28minutes.spring.learnspringframework.enterprise.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.learnspringframework.enterprise.example.data.DataService;

@Component
public class BusinessService {

	@Autowired
	private DataService dataService;

	public BusinessService(DataService dataService) {
		super();
		System.out.println("Constructor Injection");
		this.dataService = dataService;
	}

	public long calculateSum() {
		List<Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();

	}
}
```
---

### /src/main/java/com/in28minutes/spring/learnspringframework/enterprise/example/data/DataService.java

```java
package com.in28minutes.spring.learnspringframework.enterprise.example.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService {
	public List<Integer> getData() {
		return Arrays.asList(10,20,30,40);
	}
}
```
---

### /src/main/java/com/in28minutes/spring/learnspringframework/enterprise/example/web/MyWebController.java

```java
package com.in28minutes.spring.learnspringframework.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.learnspringframework.enterprise.example.business.BusinessService;

@Component
public class MyWebController {
	
	@Autowired
	private BusinessService businessService;
	
	public long returnValueFromBusinessService() {
		return businessService.calculateSum();
	}

}
```
---

### /src/main/java/com/in28minutes/spring/learnspringframework/game/GameRunner.java

```java
package com.in28minutes.spring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	@Autowired
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();	
	}

}
```
---

### /src/main/java/com/in28minutes/spring/learnspringframework/game/GamingConsole.java

```java
package com.in28minutes.spring.learnspringframework.game;

public interface GamingConsole {
	void up();
	void down();
	void left();
	void right();
}
```
---

### /src/main/java/com/in28minutes/spring/learnspringframework/game/MarioGame.java

```java
package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{
	
	public void up() {
		System.out.println("jump");
	}

	public void down() {
		System.out.println("down into a hole");
	}

	public void left() {
		System.out.println("stop");
	}

	public void right() {
		System.out.println("accelerate");
	}

	
}
```
---

### /src/main/java/com/in28minutes/spring/learnspringframework/game/PacmanGame.java

```java
package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{
	
	public void up() {
		System.out.println("PacmanGame up");
	}

	public void down() {
		System.out.println("PacmanGame down");
	}

	public void left() {
		System.out.println("PacmanGame left");
	}

	public void right() {
		System.out.println("PacmanGame right");
	}

	
}
```
---

### /src/main/java/com/in28minutes/spring/learnspringframework/game/SuperContraGame.java

```java
package com.in28minutes.spring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {
	
	public void up() {
		System.out.println("SuperContraGame up");
	}

	public void down() {
		System.out.println("SuperContraGame down");
	}

	public void left() {
		System.out.println("SuperContraGame left");
	}

	public void right() {
		System.out.println("SuperContraGame right");
	}

	
}
```
---

### /src/main/resources/application.properties

```properties
logging.level.org.springframework=debug
```
---

### /src/test/java/com/in28minutes/spring/learnspringframework/LearnSpringFrameworkApplicationTests.java

```java
package com.in28minutes.spring.learnspringframework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnSpringFrameworkApplicationTests {

	@Test
	void contextLoads() {
	}

}
```
---
