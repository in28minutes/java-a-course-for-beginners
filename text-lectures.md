## Lecture 2: Course Downloads - Course Guide and Presentation

Thank You for Choosing to Learn from in28Minutes.

Download the course material (presentation and downloads) for the course - CLICK HERE - https://github.com/in28minutes/course-material/blob/main/11-java-programming-for-beginners/downloads.md

I will see you in the next step!

## Lecture 59: UPDATE : DO NOT WORRY IF YOU FACE PROBLEMS IN NEXT 3 STEPS

If you face any problems in the next 3 steps (Step 04, 05, or 06), feel free to skip hands-on and just watch them.

You can continue your hands-on from the next section on Eclipse

Introduction to Eclipse - First Java Programming Project

## Lecture 303 - Troubleshooting For Next Sections

The next sections need the latest version of Java and Eclipse Enterprise Edition.

If you face any problems, watch these sections again:

Installing the Latest Version of Java
Troubleshooting Java and Eclipse

## Lecture 330 - Notes for Next Lecture - Business Service, Data Service Code

Complete Code - https://github.com/in28minutes/java-a-course-for-beginners/blob/master/51-learn-spring-framework/5.md#srcmainjavacomin28minuteslearnspringframeworksampleenterpriseflowwebcontrollerjava

/src/main/java/com/in28minutes/learnspringframework/sample/enterprise/flow/business/BusinessService.java
```
//Business Logic
package com.in28minutes.learnspringframework.sample.enterprise.flow.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.sample.enterprise.flow.data.DataService;

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

/src/main/java/com/in28minutes/learnspringframework/sample/enterprise/flow/data/DataService.java
```
package com.in28minutes.learnspringframework.sample.enterprise.flow.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService {
	public List<Integer> retrieveData() {
		return Arrays.asList(12,34,56,78,90);
	}
	
}
```

## Lecture 354: Reference : Code

If you face any problems in the subsequent steps, you can compare your code vs the code from the course.

Here's the Github pages with the complete code: https://github.com/in28minutes/java-a-course-for-beginners/blob/master/52-learn-spring-boot/1.md

## Lecture 363: Notes for Next Lecture - Docker and MySQL Configuration

Launch MySQL using Docker
```
docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=courses-user --env MYSQL_PASSWORD=dummycourses --env MYSQL_DATABASE=courses --name mysql --publish 3306:3306 mysql:5.7
```

application.properties configuration
```
#spring.datasource.url=jdbc:h2:mem:testdb

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/courses
spring.datasource.username=courses-user
spring.datasource.password=dummycourses
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL57Dialect

#courses-user@localhost:3306
```


mysqlsh commands
```
mysqlsh
\connect courses-user@localhost:3306
\sql
use courses
select * from course;
\quit
```

Docker Commands
```
docker container ls
docker container stop ID
```

## Lecture 365 - Reference : Code at the end of the section

If you face any problems in the subsequent steps, you can compare your code vs the code from the course.

Here's the Github pages with the complete code: https://github.com/in28minutes/java-a-course-for-beginners/blob/master/52-learn-spring-boot/2.md

## Lecture 368 - Notes for Java and Eclipse Troubleshooting

Default Home Folder for JDK
- Windows: C:\Program Files\Java\jdk-{version}
	- Example for JDK 16 - C:\Program Files\Java\jdk-16
	- Example for JDK 17 - C:\Program Files\Java\jdk-17
- Mac: /Library/Java/JavaVirtualMachines/jdk-{version}.jdk/Contents/Home
	- Example for JDK 16 - /Library/Java/JavaVirtualMachines/jdk-16.jdk/Contents/Home
	- Example for JDK 17 - /Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home

Default Home Folder for JDK
- Windows: C:\Program Files\Java\jdk-{version}\bin
	- Example for JDK 16 - C:\Program Files\Java\jdk-16\bin
- Mac: /Library/Java/JavaVirtualMachines/jdk-{version}.jdk/Contents/Home/bin
	- Example for JDK 16 - /Library/Java/JavaVirtualMachines/jdk-16.jdk/Contents/Home/bin