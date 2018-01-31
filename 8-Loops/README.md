# Loops - For, While, Do While

A loop is used to run same code again and again.

### For Loop

For loop is used to loop code specified number of times.

For Loop Example 1
```java
for (int i = 0; i < 10; i++) {
    System.out.print(i);
}
//Output - 0123456789

```
Syntax - For loop statement has 3 parts
- Initialization => int i=0. Initialization happens the first time a for loop is run.
- Condition => i<10. Condition is checked every time before the loop is executed.
- Operation (Increment or Decrement usually) => i++. Operation is invoked at the start of every loop (except for first time).


For Loop Puzzles
- Any of 3 parts in a for loop can be empty.
- There can be multiple statements in Initialization or Operation separated by commas

Exercises

```java
MyNumber number = new MyNumber(9);

number.isPrime(); //Is a number Prime? 
//Hint : 5 => true, 7 => true, 11 => true, 6 => false

int sum = number.sumUptoN();//Sum of numbers upto n?
//1 + 2 + 3 + 4 + 5 + 6

number.printPrimesUptoN();
//Print all prime numbers upto n

number.printANumberTriangle;
//1
//1 2
//1 2 3
//1 2 3 4 
//1 2 3 4 5
```

### While Loop
```
int count = 0;

while(count < 5){//while this condn is true, loop is executed.
    System.out.print(count);
    count++;
}
//Output - 01234
```

While loop Example 2

```java
count = 5;
while(count < 5){//condn is false. So, code in while is not executed.
    System.out.print(count);
    count++;
}//Nothing is printed to output
```

> Do not forget the increment!

- While Loop
  - Print all squares of numbers less than a given limit.
     - For limit = 30, output would be 1 4 9 16 25
  - Print all cubes of numbers less than a given limit.
    - For limit = 30, output would be 1 8 27

### Do While Loop
- The difference between a while and a do while is that the code in do while is executed at least once. 
- In a do while loop, condition check occurs after the code in loop is executed once.

Do While loop Example 1
```java
int count = 0;
do{
    System.out.print(count);
    count++;
}while(count < 5);//while this condn is true, loop is executed.
//output is 01234
```

Do While loop Example 2
```java
count = 5;
do{
    System.out.print(count);
    count++;
}while(count < 5);
//output is 5
```

### Break Statement

Break statement breaks out of a loop

Example 1
```java
for (int i = 0; i < 10; i++) {
    System.out.print(i);
    if (i == 5) {
         break;
    }
}

//Output - 012345
//Even though the for loop runs from 0 to 10, execution stops at i==5 because of the break statement. ÒBreak statementÓ stops the execution of the loop and takes execution to the first statement after the loop.
```

Break can be used in a while also.
```java
int i = 0;
while (i < 10) {
    System.out.print(i);
    if (i == 5) {
break;
    }
    i++;
}
//Output - 012345
```

Break statement takes execution out of inner most loop.
```java
for (int j = 0; j < 2; j++) {
    for (int k = 0; k < 10; k++) {
System.out.print(j + "" + k);
if (k == 5) {
    break;//Takes out of loop using k
}
    }
}
//Output - 000102030405101112131415
//Each time the value of k is 5 the break statement is executed. 
//The break statement takes execution out of the k loop and proceeds to the next value of j.

```

### Continue Statement
- Continue statement skips rest of the statements in the loop and starts next iteration

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
      continue;
    }
    System.out.print(i);
}

//Output => 012346789

//Note that the output does not contain 5. 
//When i==5 continue is executed. Continue skips rest of the code and goes to next loop iteration. 
//So, the print statement is not executed when i==5.

```
Continue can be used in a while also
```java
int i = 0;
while (i < 10) {
    i++;
    if (i == 5) {
        continue;
    }
    System.out.print(i);
}
//Output - 1234678910
```

Continue statement takes execution to next iteration of inner most loop.
```java
for (int j = 0; j < 2; j++) {
    for (int k = 0; k < 10; k++) {
       if (k == 5) {
          continue;//skips to next iteration of k loop
        }
        System.out.print(j + "" + k);
    }
}
//Output - 000102030406070809101112131416171819
//When k==5 the print statement in the loop is skipped due to continue. 
//So 05 and 05 are not printed to the console.

```

- For Loop
Exercise
  - loop in loop
- Check out these test files - DoWhileLoopTest, WhileLoopTest, ForLoopTest, Enhanced For Loop Test
- Loops deep dive
  - Sum of digits for a number
  - Reverse a Number
  - Sum of divisors
  - Perfect Number - A positive integer is called a perfect number if it is equal to the sum of all of its positive divisors, excluding itself. For example, 6 is the first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1.  Find all the four perfect numbers less than 10,000.
- Do While 
   - do{System.out.print("Do you want to play again (yes/no)? "); playAgain = usersConsole.nextLine();
   - } while ("yes".equals(playAgain));
    - Accepting a Menu from a User
      - 1 - action1
      - 2 - action2
      - 3 - action3
      - 4 - action4
      - 5 - quit
- While, Do While and For Loop
  - Count 1 to 100
  - Count 100 to 1
