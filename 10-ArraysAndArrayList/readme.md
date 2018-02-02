# Introduction to Array and ArrayList

## Challenge
```java
Student student = new Student (name, list of marks);
int number = student.getNumberOfMarks();
int sum = student.getTotalSumOfMarks();
int maximumMark = student.getMaximumMark();
int minimumMark = student.getMinimumMark();
BigDecimal average = student.getAverageMarks();
student.addNewMark(35);
student.removeMarkAtIndex(5);
```

## Concepts
 - Arrays
 - ArrayList

## Why do we need an Array?
- Arrays allow storing multiple values of same type.

## Array Basics

```
//Declaring an array

//Declaring and creating an array in same line.
int marks2[] = new int[5];

//You can Declare, Create and Initialize Array on same line.
int marks3[] = { 25, 30, 50, 10, 5 };

//Accessing values from an array

int length = marks.length;//Length of an array: Property length

//Index of elements in an array runs from 0 to length - 1
marks[0] = 25;
marks[1] = 30;
marks[2] = 50;
marks[3] = 10;
marks[4] = 5;

System.out.println(marks[2]);//Printing a value from array
```
Exercise 
- Print all values in an array
- Find sum of all values in an array

## A few puzzles

- New Arrays are always initialized with default values.
   - byte,short,int,long    0 
   - float,double 0.0 
   - boolean false
   - object    null

- Storing values of same type


```
System.out.println(marks2[0]);//New Arrays are always initialized with default values - 0

//Declaring an Array
int[] marks;

// Creating an array
marks = new int[5]; // 5 is size of array

//Leaving additional comma is not a problem. (note that comma after 5)
int marks4[] = { 25, 30, 50, 10, 5, };

int marks5[] = { 25, 30, 50, 10, 5 };
System.out.println(marks5); //[I@6db3f829
System.out.println(
    Arrays.toString(marks5));//[25, 30, 50, 10, 5]

```

```
//int values[5];//Compilation Error!Declaration of an Array should not include size. 

//marks = new int[];//COMPILER ERROR! Size of an array is mandatory to create an array.

//Access 10th element when array has only length 5
//Runtime Exception: ArrayIndexOutOfBoundsException
//System.out.println(marks[10]);

//Array can contain only values of same type.

//COMPILE ERROR!!
//int marks4[] = {10,15.0}; //10 is int 15.0 is float

//Cross assigment of primitive arrays is ILLEGAL
int[] ints = new int[5];
short[] shorts = new short[5];
//ints = shorts;//COMPILER ERROR
//ints = (int[])shorts;//COMPILER ERROR

```

## More Basics about Arrays

Enhanced for loop can be used to loop around array's or List's.
```
int[] numbers = {1,2,3,4,5};

for(int number:numbers){
    System.out.print(number);
}
//Output - 12345
```

Changing content of an array
```
Arrays.fill(marks, 100); //All array values will be 100
```

Comparing Arrays

```
int[] numbers1 = { 1, 2, 3 };
int[] numbers2 = { 4, 5, 6 };

System.out.println(Arrays
.equals(numbers1, numbers2)); //false

int[] numbers3 = { 1, 2, 3 };

System.out.println(Arrays
.equals(numbers1, numbers3)); //true
```

Sorting an Array
```
int rollNos[] = { 12, 5, 7, 9 };
Arrays.sort(rollNos);
System.out.println(Arrays.toString(rollNos));//[5, 7, 9, 12]
```

## Let's create Student class now

```
Student student = new Student (name, list of marks);
int number = student.getNumberOfMarks();
int sum = student.getTotalSumOfMarks();
int maximumMark = student.getMaximumMark();
int minimumMark = student.getMinimumMark();
BigDecimal average = student.getAverageMarks();
```

## Variable Arguments

## Variable Argument Puzzles

## Arrays of Strings and Objects

```
Person[] persons = new Person[3];

//By default, an array of 3 reference variables is created.
//The person objects are not created
System.out.println(persons[0]);//null

//Let's create the new objects
persons[0] = new Person();
persons[1] = new Person();
persons[2] = new Person();

//Creating and initializing person array in one statement
Person[] personsAgain = { new Person(),new Person(),new Person()};

```

#### Exercise

- Create a string array with days of the week
   - "Sunday", "Monday", "Tuesday", "Wednesday"
   - "Thursday", "Friday", "Saturday"
- Find the day with most number of letters in it 
	- Longest String
- Print days of the week backwards


## Let's add methods to add and delete elements
```
student.addNewMark(35);
student.removeMarkAtIndex(5);
```

## Let's do ArrayList
Basics of ArrayList

## Using ArrayList for Previous Example


