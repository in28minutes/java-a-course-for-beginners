# Arrays


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
```


## Why do we need arrays?
- Arrays allow storing multiple values of same type.


## Array Basics


Declaring an array
```
//Declaring an Array
int[] marks;

// Creating an array
marks = new int[5]; // 5 is size of array

//Declaring and creating an array in same line.
int marks2[] = new int[5];

//You can Declare, Create and Initialize Array on same line.
int marks3[] = { 25, 30, 50, 10, 5 };

//Leaving additional comma is not a problem. (note that comma after 5)
int marks4[] = { 25, 30, 50, 10, 5, };

```

Accessing values from an array
```
int length = marks.length;//Length of an array: Property length

System.out.println(marks2[0]);//New Arrays are always initialized with default values - 0

//Index of elements in an array runs from 0 to length - 1
marks[0] = 25;
marks[1] = 30;
marks[2] = 50;
marks[3] = 10;
marks[4] = 5;

System.out.println(marks[2]);//Printing a value from array
```

Printing content of an array
```
int marks5[] = { 25, 30, 50, 10, 5 };
System.out.println(marks5); //[I@6db3f829
System.out.println(
    Arrays.toString(marks5));//[25, 30, 50, 10, 5]

```

## More Basics about Arrays

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

## Array Puzzles

- Once An Array is created, its size cannot be increased or decreased. 
- Storing values of same type
- New Arrays are always initialized with default values.
   - byte,short,int,long    0 
   - float,double 0.0 
   - boolean false
   - object    null

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

## Array Exercise
- Array as argument and return value

## Arrays of Strings and Objects
String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

## Variable Arguments

## 2D Arrays

Best way to visualize a 2D array is as an array of arrays.

```
int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };

int[][] matrixA = new int[5][6]; 

//Each row in a 2D Array can have a different size. This is called a Ragged Array.
matrixA = new int[3][];//FINE
matrixA[0] = new int[3];
matrixA[0] = new int[4];
matrixA[0] = new int[5];

//Accessing elements from 2D array:
System.out.println(matrix[0][0]); //1
System.out.println(matrix[1][2]); //6

//Looping a 2D array
for (int[] array: matrix) {
    for (int number: array) {
         System.out.println(number);
    }
}

// Printing a 2D Array
int[][] matrix3 = { { 1, 2, 3 }, { 4, 5, 6 } };
System.out.println(matrix3); //[[I@1d5a0305
System.out.println(

Arrays.toString(matrix3)); 
//[[I@6db3f829, [I@42698403]

System.out.println(Arrays.deepToString(matrix3)); 
//[[1, 2, 3], [4, 5, 6]]

System.out.println(matrix3[0]);//[I@86c347 - matrix3[0] is a 1D Array
System.out.println(Arrays.toString(matrix3[0]));//[1, 2, 3]
```

## Array of Objects

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

//Another example
Person[][] persons2D = 
    {
		{ new Person(),new Person(),new Person()},
		{ new Person(),new Person()}
    };
```
