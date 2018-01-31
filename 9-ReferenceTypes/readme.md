## Reference Types 
- Reference Types vs Primitive Types
  - memory
  - assignment
  - initialization (null)
- Predefined classes in Java
  - String, StringBuffer, StringBuilder 
  - Wrapper Classes
- Reading an API and using a Java API
  - Date

### Reference Variables

```
Animal dog = new Animal();
```

The instance of new Animal - Animal object - is created in memory. The memory address of the object created is stored in the dog reference variable.

Reference Variables contains a reference or a guide to get to the actual object in memory.

#### Puzzles

```
Animal dog1 = new Animal();
dog1 = new Animal();
```

What will happen?
Two objects of type Animal are created. Only one reference variable is created.

```
Animal animal1 = new Animal();
Animal animal2 = new Animal();
animal1 = animal2;

```

What will happen? What would happen if the same was done with primitive variables?

#### == (equals) operator
Let's look at how == equals operator works with primitives and reference variables.

#### Primitive Variables

- Equality for Primitives only compares values

```
int a = 5;
int b = 5;
```

Below statement compares if a and b have same value.

```
System.out.println(a == b);//true
```
#### Reference Variables

```
Integer aReference = new Integer(5);
Integer bReference = new Integer(5);
```

For reference variables, == compares if they are referring to the same object.

```
System.out.println(aReference == bReference);//false

bReference = aReference;

//Now both are referring to same object
System.out.println(aReference == bReference);//true
```

### String Class

- A String class can store a sequence of characters. String is not a primitive in Java but a Class in its own right.

#### Strings are immutable

- Value of a String Object once created cannot be modified. Any modification on a String object creates a new String object.

```
String str3 = "value1";
str3.concat("value2");
System.out.println(str3); //value1
```

Note that the value of str3 is not modified in the above example.  The result should be assigned to a new reference variable (or same variable can be reused).

```
String concat = str3.concat("value2");
System.out.println(concat); //value1value2
```

## Where are string literals stored in memory?
All strings literals are stored in "String constant pool". If compiler finds a String literal,it checks if it exists in the pool. If it exists, it is reused.
Following statement creates 1 string object (created on the pool) and 1 reference variable.
```
String str1 = "value"; 
```
However, if new operator is used to create string object, the new object is created on the heap. Following piece of code create 2 objects.
```
//1. String Literal "value" - created in the "String constant pool"
//2. String Object - created on the heap
String str2 = new String("value");
```
## String vs StringBuffer vs StringBuilder
- Immutability : String
- Thread Safety : String(immutable), StringBuffer
- Performance : StringBuilder (especially when a number of modifications are made.)
- [Example 1](src/main/java/com/in28minutes/java/string/StringBufferBuilderExamples.java)


#### String Constant Pool

- All strings literals are stored in "String constant pool". If compiler finds a String literal,it checks if it exists in the pool. If it exists, it is reused.

- Following statement creates 1 string object (created on the pool) and 1 reference variable.

```
String str1 = "value"; 
```

- However, if new operator is used to create string object, the new object is created on the heap. Following piece of code create 2 objects.

```
//1. String Literal "value" - created in the "String constant pool"
//2. String Object - created on the heap
String str2 = new String("value");
```

#### String Method Examples

String class defines a number of methods to get information about the string content.

```
String str = "abcdefghijk";
```

##### Get information from String

Following methods help to get information from a String.

```
//char charAt(int paramInt)
System.out.println(str.charAt(2)); //prints a char - c
System.out.println("ABCDEFGH".length());//8
System.out.println("abcdefghij".toString()); //abcdefghij
System.out.println("ABC".equalsIgnoreCase("abc"));//true

//Get All characters from index paramInt
//String substring(int paramInt)
System.out.println("abcdefghij".substring(3)); //cdefghij

//All characters from index 3 to 6
System.out.println("abcdefghij".substring(3,7)); //defg
```

#### String Manipulation methods

Most important thing to remember is a String object cannot be modified. When any of these methods are called, they return a new String with the modified value. The original String remains unchanged.

```
//String concat(String paramString)
System.out.println(str.concat("lmn"));//abcdefghijklmn

//String replace(char paramChar1, char paramChar2)
System.out.println("012301230123".replace('0', '4'));//412341234123

//String replace(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
System.out.println("012301230123".replace("01", "45"));//452345234523

System.out.println("ABCDEFGHIJ".toLowerCase()); //abcdefghij

System.out.println("abcdefghij".toUpperCase()); //ABCDEFGHIJ

//trim removes leading and trailings spaces
System.out.println(" abcd  ".trim()); //abcd
```
### String Concatenation Operator

#### Three Rules of String Concatenation
- RULE1: Expressions are evaluated from left to right.Except if there are parenthesis.
- RULE2: number + number = number
- RULE3: number + String = String

```
System.out.println(5 + "Test" + 5); //5Test5
System.out.println(5 + 5 + "Test"); //10Test
System.out.println("5" + 5 + "Test"); //55Test
System.out.println("5" + "5" + "25"); //5525
System.out.println(5 + 5 + "25"); //1025
System.out.println("" + 5 + 5 + "25"); //5525
System.out.println(5 + (5 + "25")); //5525
System.out.println(5 + 5 + 25); //35
```



### Wrapper Classes

- Wrapper Classes
   - Creation - valueOf vs Constructor
      - Look at the code of Integer.valueOf
   - Reasons why we need Wrapper Classes
      - • null is a possible value
      - • use it in a Collection
      - • Methods that support Object like creation from other types.. like String Integernumber2=newInteger("55");//String
   - Autoboxing
      - Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.Auto Boxing helps in saving memory by reusing already created Wrapper objects. Auto Boxing uses the static valueOf methods.                

- [Example 1](src/main/java/com/in28minutes/java/wrapper/WrapperExamples.java)
- A wrapper class wraps (encloses) around a data type and gives it an object appearance
- Wrapper: Boolean,Byte,Character,Double,Float,Integer,Long,Short 
- Primitive: boolean,byte,char ,double, float, int , long,short
- Examples of creating wrapper classes are listed below.
  - Integer number = new Integer(55);//int;
  - Integer number2 = new Integer("55");//String
  - Float number3 = new Float(55.0);//double argument  
  - Float number4 = new Float(55.0f);//float argument  
  - Float number5 = new Float("55.0f");//String 
  - Character c1 = new Character('C');//Only char constructor 
  - Boolean b = new Boolean(true); 
- Reasons
  - null is a possible value
  - use it in a Collection
  - Object like creation from other types.. like String

- A primitive wrapper class in the Java programming language is one of eight classes provided in the java.lang package to provide object methods for the eight primitive types. All of the primitive wrapper classes in Java are immutable.

Wrapper classes are final and immutable.


#### Creating Wrapper Classes

```
Integer number = new Integer(55);//int
Integer number2 = new Integer("55");//String

Float number3 = new Float(55.0);//double argument
Float number4 = new Float(55.0f);//float argument
Float number5 = new Float("55.0f");//String

Character c1 = new Character('C');//Only char constructor
//Character c2 = new Character(124);//COMPILER ERROR

Boolean b = new Boolean(true);

//"true" "True" "tRUe" - all String Values give True
//Anything else gives false
Boolean b1 = new Boolean("true");//value stored - true
Boolean b2 = new Boolean("True");//value stored - true
Boolean b3 = new Boolean("False");//value stored - false
Boolean b4 = new Boolean("SomeString");//value stored - false

b = false;
```
#### Wrapper Class Utility Methods

- A number of utility methods are defined in wrapper classes to create and convert them.

#### valueOf  Methods

Provide another way of creating a Wrapper Object

```
Integer seven = 
    Integer.valueOf("111", 2);//binary 111 is converted to 7

Integer hundred = 
    Integer.valueOf("100");//100 is stored in variable
```

#### xxxValue methods 

xxxValue methods help in creating primitives

```
Integer integer = Integer.valueOf(57);
int primitive = seven.intValue();//57
float primitiveFloat = seven.floatValue();//57.0f

Float floatWrapper = Float.valueOf(57.0f);
int floatToInt = floatWrapper.intValue();//57
float floatToFloat = floatWrapper.floatValue();//57.0f
```

#### parseXxx methods

parseXxx methods are similar to valueOf but they return primitive values

```
int sevenPrimitive = 
    Integer.parseInt("111", 2);//binary 111 is converted to 7

int hundredPrimitive = 
    Integer.parseInt("100");//100 is stored in variable
```

#### static toString method

Look at the example of the toString static method below.

```
Integer wrapperEight = new Integer(8);
System.out.println(Integer.
toString(wrapperEight));//String Output: 8
```

#### Overloaded static toString method

2nd parameter: radix

```
System.out.println(Integer
.toString(wrapperEight, 2));//String Output: 1000
```

#### static toYyyyString methods. 

Yyyy can be Hex,Binary,Octal

```
System.out.println(Integer
.toHexString(wrapperEight));//String Output:8 
System.out.println(Integer
.toBinaryString(wrapperEight));//String Output:1000
System.out.println(Integer
.toOctalString(wrapperEight));//String Output:10
```

#### Wrapper Class , Auto Boxing
```
Integer ten = new Integer(10);
ten++;//allowed. Java does the work behind the screen for us

```
#### Boxing and new instances
- Auto Boxing helps in saving memory by reusing already created Wrapper objects. However wrapper classes created using new are not reused.
- Two wrapper objects created using new are not same object.

```
Integer nineA = new Integer(9);
Integer nineB = new Integer(9);
System.out.println(nineA == nineB);//false
System.out.println(nineA.equals(nineB));//true
```

- Two wrapper objects created using boxing are same object.

```
Integer nineC = 9;
Integer nineD = 9;
System.out.println(nineC == nineD);//true
System.out.println(nineC.equals(nineD));//true
```



### Basic of LocalDate API

```
import java.time.LocalDate;
LocalDate now = LocalDate.now();
now.getDayOfMonth()
now.getDayOfWeek()
now.getDayOfYear()
now.getEra()
now.getMonth()
now.getMonthValue()
now.isBefore(LocalDate.now())
now.isBefore(LocalDate.of(2020,1,1))
now.isLeapYear()
now.plusDays(10)
now.plusMonths(10)
now.plusYears(10)
now.lengthOfMonth()
now.lengthOfYear()
```