# Conditionals

## Exercise : Designing a Menu

- Ask User for input
  - Enter two numbers 
  - Choose an Operation
      - add
      - multiply
      - divide 
      - subtract

```
Enter Number1: 
2

Enter Number2: 
4

1 - Add
2 - Subtract
3 - Divide
4 - Multiply
Choose Operation: 4

Result is - 8
```

```

```
## Basics of If Statement

- Conditionally execute code! 

> Code inside If is executed only if the condition is true.

// Basic Example
```
if(true){
    System.out.println("Will be printed");
}

if(false){
    System.out.println("Will NOT be printed");//Not executed
}

//Example 1
int x = 5;

if(x==5){
    System.out.println("x is 5");//executed since x==5 is true
}

//Example 2
x = 6;
if(x==5){
    System.out.println("x is 5");//Not executed since x==5 is false
}

//Example 3
int y = 10;

if(y==10){
    System.out.println("Y is 10");//executed-condn y==10 is true
} else {
    System.out.println("Y is Not 10");
}

//Example 4
y = 11;

if(y==10){
    System.out.println("Y is 10");//NOT executed
} else {
    System.out.println("Y is Not 10");//executed
}

//Example 5
int z = 15;
//Only one condition is executed. Rest of the conditions are skipped.
if(z==10){
    System.out.println("Z is 10");//NOT executed
} else if(z==12){
    System.out.println("Z is 12");//NOT executed
} else if(z==15){
    System.out.println("Z is 15");//executed. 
} else {
    System.out.println("Z is Something Else.");//NOT executed
}

z = 18;
if(z==10){
    System.out.println("Z is 10");//NOT executed
} else if(z==12){
    System.out.println("Z is 12");//NOT executed
} else if(z==15){
    System.out.println("Z is 15");//NOT executed
} else {
    System.out.println("Z is Something Else.");//executed
}

//If else Example: without Blocks
int number = 5;
if(number < 0) 
    number = number + 10; //Not executed
    number++; //This statement is not part of if. Executed.
System.out.println(number);//prints 6
```
## If else Puzzles

```
//Puzzle 1
int k = 15;
if (k > 20) {
    System.out.println(1);
} else if (k > 10) {
    System.out.println(2);
} else if (k < 20) {
    System.out.println(3);
} else {
    System.out.println(4);
}
```
//Output is 2. 
//Once a condition in nested-if-else is true the rest of the code is not executed.  
```
//Puzzle 2
int l = 15;

if(l<20)
    System.out.println("l<20");
if(l>20)
    System.out.println("l>20");
else
    System.out.println("Who am I?");
//Output is "l<20" followed by "Who am I?" on next line. 
//else belong to the last if before it unless brackets ({}) are used.
```

Puzzle 3

```
int m = 15;

if(m>20)
    if(m<20)
System.out.println("m>20");
    else
System.out.println("Who am I?");

//Nothing is printed to output. 

//Code above is similar to the code snippet shown below

if(m>20) {//Condn is false. So, code in if is not executed
    if(m<20)
System.out.println("m>20");
    else
System.out.println("Who am I?");
}
```

Puzzles Continued

```

//Puzzle 4

int x1 = 0;
//Condition in if should always be boolean
//if(x1) {} //COMPILER ERROR
//if(x1=0) {}//COMPILER ERROR. Using = instead of ==
//If else condition should be boolean
```

```
//Puzzle 5

boolean isTrue = false;

if(isTrue==true){
    System.out.println("TRUE TRUE");//Will not be printed
}

if(isTrue=true){
    System.out.println("TRUE");//Will be printed.
}

//Condition is isTrue=true. This is assignment. Returns true. So, code in if is executed.
```

Puzzle - Variables in a block

#### If Else Exercises
- Largest of two numbers
- Largest of three numbers
- public char getSimpleGrade(int score) { A,B
- public char getComplexGrade(int score) { A,B,C,D
- Sum of digits for a 2 digit number
- Sum of digits for a 3 digit number
- Is it a good triangle? With sides. Length of two sides should always be greater than the third side.
- Is n a leap year?

## Implementing Menu with if else

```
package com.in28minutes.primitive.datatypes;

import java.util.Scanner;

public class BasicMenu {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter Number1: ");
    int number1 = scanner.nextInt();
    
    System.out.println("Enter Number2: ");
    int number2 = scanner.nextInt();
    
    System.out.println("Add: 1");
    System.out.println("Subtract: 2");
    System.out.println("Choose Operation: ");
    int choice = scanner.nextInt();
    
    int result = 0;
    if(choice==1) {
      result = number1 + number2;
    } else if(choice == 2) {
      result = number1 - number2;
    }
    
    System.out.println(result);
  }

}

```


### Switch Statement
- Choose between a set of options.

```
//Example 1

int number = 2;
switch (number) {
case 1:
    System.out.println(1);
    break;
case 2:
    System.out.println(2);//PRINTED
    break;
case 3:
    System.out.println(3);
    break;
default:
    System.out.println("Default");
    break;
}
// Output of above example is 2.The case which is matched is executed.

```
Important Tips
- There is a break statement in every case. If there is no break statement, switch continues to execute other cases.
- There is a case named default.  If none of the cases match default case is executed.


```
//Switch Statement Example 2 , No Breaks
number = 2;
switch (number) {
case 1:
    System.out.println(1);
case 2:
    System.out.println(2);
case 3:
    System.out.println(3);
default:
    System.out.println("Default");
}
```

Output of above switch
```
2
3
Default
```

Since there is no break after case 2, execution falls through to case 3. There is no break in case 3 as well. So, execution falls through to default. 

> Code in switch is executed from a matching case until a break or end of switch statement is encountered.


Switch Statement Example 3 , Few Break's
```
number = 2;
switch (number) {
case 1:
    System.out.println(1);
    break;
case 2:
case 3:
    System.out.println("Number is 2 or 3");
    break;
default:
    System.out.println("Default");
    break;
}
```
Program Output 
```
Number is 2 or 3.
```
Case 2 matches. Since there is no code in case 2, execution falls through to case 3, executes the println. Break statement takes execution out of the switch.

Switch Statement Example 4 , Let's Default
- default is executed if none of the case's match. 

```
number = 10;
switch (number) {
case 1:
    System.out.println(1);
    break;
case 2:
    System.out.println(2);
    break;
case 3:
    System.out.println(3);
    break;
default:
    System.out.println("Default");
    break;
}
```
Code Output
```
Default
```

Switch Statement Example 5 - Default need not be Last 
```
number = 10;
switch (number) {
default:
    System.out.println("Default");
    break;
case 1:
    System.out.println(1);
    break;
case 2:
    System.out.println(2);
    break;
case 3:
    System.out.println(3);
    break;
}
```
Output 
```
Default
```
#### Switch statement Example 6


Switch can be used only with char, byte, short, int, String or enum
```
long l = 15;
/*switch(l){//COMPILER ERROR. Not allowed.
}*/

Case value should be a compile time constant.
```
number = 10;
switch (number) {
//case number>5://COMPILER ERROR. Cannot have a condition
//case number://COMPILER ERROR. Should be constant.
}    
```

#### Switch Exercises
- public boolean isHoliday(int dayNumber) {
- public String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
- switch (month) case 1: result = "January";
- switch (month)
  - case 1: System.out.println("January"); break;
  - case 2: System.out.println("February"); break;
- switch (day)
    - case 0: System.out.print("Sunday"); break;
    - case 1: System.out.print("Monday"); break;

#### Implement the Menu with Switch

- Introduce Math class and check out the API
- Comments
- Conditional Operator
  - Conditional Operator is a Ternary Operator (3 Operands)
  - syntax : ```booleanCondition ? ResultIfTrue: ResultIfFalse;```
  - age >= 18 ? "Can Vote": "Cannot Vote"
- Puzzles around return values
  - Is it valid to return two times?
  - What if the else is removed?
  - Will code after return be executed?
  - Can I have code after return?
  - Can I return from a void function?
  - Can I return a different type?