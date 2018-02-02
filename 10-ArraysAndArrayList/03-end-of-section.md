<!---
Current Directory : /in28Minutes/git/java-a-course-for-beginners/10-ArraysAndArrayList
-->

## Complete Code Example


### /src/com/in28minutes/arrays/StringRunner.java

```java
package com.in28minutes.arrays;

public class StringRunner {

	public static void main(String[] args) {

		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		String dayWithMostCharacters = "";

		for (String day : daysOfWeek) {
			if (day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		}

		System.out.println("Day with Most number of characters " + dayWithMostCharacters);

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}

	}

}
```
---

### /src/com/in28minutes/arrays/Student.java

```java
package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;

		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(marks);
	}

	public int getMinimumMark() {
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
		
	}
}
```
---

### /src/com/in28minutes/arrays/StudentRunner.java

```java
package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
				
		Student student = new Student("Ranga", 97, 98, 100);
				
		int number = student.getNumberOfMarks();
		System.out.println("number of marks : " + number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("sum of marks : " + sum);
		
		int maximumMark = student.getMaximumMark();
		System.out.println("maximum of marks : " + maximumMark);
		
		int minimumMark = student.getMinimumMark();
		System.out.println("minimum of marks : " + minimumMark);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("average : " + average);
		
		System.out.println(student);
		
		student.addNewMark(35);
		
		System.out.println(student);

		student.removeMarkAtIndex(1);
		
		System.out.println(student);
		
	}

}
```
---
