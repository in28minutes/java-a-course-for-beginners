# Primitive Data Types in Depth

## Quick Revision

Primitive Data Types
- Integer
  - byte, short, int, long
- Floating Point 
  - float, double
- Boolean 
  - boolean
- Character
  - char

In-Depth
- Literals
- Operators
- Conversion (Casting)
- Use them in Classes

## Integer Data Types
- Default literal type is int. Long example - 40l or 40L
- There are 3 ways of representing an Integer Literal. 
  - Decimal. Examples: 343, 545
  - Octal. Digits 0 to 7. Place 0 before a number. Examples : 070,011
  - Hexadecimal. Digits 0 to 9 and alphabets A to F (10-15). Case insensitive.
- Operators are +, -, /, *, %, Increment and Decrement operators
- Implicit Conversion if literal fits in the variable type
- Explicit Conversion otherwise

```java
int eight = 010; 
int nine=011;  
int invalid = 089;//COMPILER ERROR! 8 and 9 are invalid in Octal
int sixteen = 0x10; 
int fifteen = 0XF; 
int fourteen = 0xe;
int x = 23,000;
long a = 123456789l; 
long b = 0x9ABCDEFGHL; 
long c = 0123456789L;

byte b = 10; //byte b = (int) 10; Example below compiles because compiler introduces an implicit cast.

short n1 = 5;
short n2 = 6;
//short sum = n1 + n2;//COMPILER ERROR
short sum = (short)(n1 + n2);//Needs an explicit cast

byte b = 5;
b += 5; //Compiles because of implicit conversion

int value = 100;
long number = value; //Implicit Casting

long number1 = 25678;
int number2 = (int)number1;//Explicit Casting
//int x = 35.35;//COMPILER ERROR
int x = (int)35.35;//Explicit Casting

int bigValue = 280;
byte small = (byte) bigValue;
System.out.println(small);//output 24. Only 8 bits remain.

//byte large = 128; //Literal value bigger than range of variable type causes compilation error
byte large = (byte) 128;//Causes Truncation!

int i = 25;
int j = ++i;//i is incremented to 26, assigned to j
System.out.println(i + " " + j);//26 26

i = 25;
j = i++;//i value(25) is assigned to j, then incremented to 26
System.out.println(i + " " + j);//26 25

```

Exercise
```java
   BiNumber numbers = new BiNumber(2, 3);
   System.out.println(numbers.add());
   System.out.println(numbers.multiply());
   numbers.double();//Double both numbers 
   System.out.println(numbers.getNumber1());
   System.out.println(numbers.getNumber2());
```

## Floating Point Data Types

- To declare a float, append f. Example: float f = 123.456f;
- Floating point literals are double by default.
- Appending d or D at end of double literal is optional Example: ```double d = 123.456D;```
- Same operators as Integer Data Types
- Conversion from double to float 
- Conversion from integer data types
- Floating Points are not accurate
  - BigDecimal
    - How to explore a class in JShell?

```java
float f = 100; //Implicit Casting 
//float avg = 36.01;//COMPILER ERROR. Default Double
float avg = (float) 36.01;//Explicit Casting
float avg1 = 36.01f;
float avg2 = 36.01F; //f or F is fine

```

Exercise

Simple Interest Formula 

Total Amount = principal + principal * interest * noOfYears;

```java
 SimpleInterestCalculator calculator = 
        new SimpleInterestCalculator("4500.00", "7.5");
 BigDecimal totalValue = 
        calculator.calculateTotalValue(5);// 5 years
 System.out.println(totalSum);
```

## Boolean Data Types
- Valid boolean values are true and false. 
- TRUE, FALSE or True, False are invalid.
- Operators


```java
boolean b = true; boolean b=false;
boolean b = TRUE;//COMPILATION ERROR
boolean b = 0; //COMPILER ERROR. This is not C Language

//Relational Operators
int number = 7;
System.out.println(number > 5);//true
System.out.println(number > 7);//false
System.out.println(number >= 7);//true
System.out.println(number < 9);//true
System.out.println(number < 7);//false
System.out.println(number <= 7);//true
System.out.println(number == 7);//true
System.out.println(number == 9);//false
System.out.println(number != 9);//true
System.out.println(number != 7);//false
System.out.println(number = 7);//7 Be Cautious

//Short Circult Operator
System.out.println(true || true);//true
System.out.println(true || false);//true
System.out.println(false || true);//true
System.out.println(false || false);//false

//System.out.println(5 || 6);//COMPILER ERROR

//Short circuit operators are Lazy 
int i = 10;
System.out.println(true || ++i==11);//true
System.out.println(false && ++i==11);//false
System.out.println(i);//i remains 10, as ++i expressions are not executed.

//Operator & and |
int j = 10;
System.out.println(true | ++j==11);//true
System.out.println(false & ++j==12);//false
System.out.println(j);//j becomes 12, as both ++j expressions are executed

//Operator exclusive-OR (^)
System.out.println(true ^ false);//true
System.out.println(false ^ true);//true
System.out.println(true ^ true);//false
System.out.println(false ^ false);//false

//Not Operator (!)
System.out.println(!false);//true
System.out.println(!true);//false


```
## Character Data Type
- Defining Character Literals
  - Unicode Representation also can be used. Prefix with \u. Example: char letterA = '\u0041';
  - A number value can also be assigned to character. Example: char letterB = 66; Numeric value can be from 0 to 65535;
  - Escape code can be used to represent a character that cannot be typed as literal. Example: char newLine = '\n';
- How are characters stored? 
  - Unicode
  - Same as integer types
- Same operators as Integer Data Types

```java
char ch = a;
char a = 97;
char ch1 = 66000; //COMPILER ERROR!
```


```
MyChar myChar = new MyChar('c');
System.out.println(myChar.isVowel());
        //'a', 'e', 'i', 'o', 'u' and Capitals
System.out.println(myChar.isDigit());
System.out.println(myChar.isAlphabet());
MyChar.printLowerCaseAlphabets();
MyChar.printUpperCaseAlphabets();
```