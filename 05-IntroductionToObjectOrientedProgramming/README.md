# Introduction To Object Oriented Programming

Build a Motor Bike Class 
 - adjust speed and gears.  

We would want to create a few objects and play with them 
- Understand concepts of Class, Object, State, Behavior
- Understand basics of Encapsulation and Abstraction


## Procedural/Structured Programming

- Thinking in terms of procedures/methods/functions

```
    //Global Data

    fly() {       
      travelToAirport();
      findCheckInCounter();
      checkIn();
      passSecurityCheck();
      waitForBoardingCall();
      boardTheFlight();
      wishTheAirHostess();
      takeOff();
      haveFun();
      landing();
    }
```

## Object Oriented Programming

- Thinking about Objects
  - Class, Object
    - Data (state)
    - Actions (behaviour)

Aeroplane
- airline, make, type, position //data
- takeoff(), land(), cruise() //actions
   
AirHostess
- name, address //data
- wish(), serve() //actions
    
Passenger
- name, address //data
- takeCab(), checkin(), walk(), smile() //actions

## Object Oriented Terminology

```
class Planet {
     name, location, distanceFromSun //data/state/fields
         revolve(), rotate()     //actions/behavior/methods
}
```

```
Planet earth = new Planet();
Planet venus = new Planet();
```

Terminology
- Class - Template ex : Planet, Person
- Objects/Instances - ex : earth, venus, mahatmaGandhi, nelsonMandela
- Member Data/State/Fields - Data present in each object - name, location, distanceFromSun
- Actions/Methods/Behaviour - What actions can be performed on each object?

## Exercises

### Online Shopping System
  - Customer
    - name, address
    - login(), logout(), selectProduct(product)
  - Shopping Cart
    - items
    - add(item), remove(item)
  - Product
    - name, price, quantityAvailable
    - order(), changePrice()

### Person
 
 - name, address, hobbies, work 
 - walk(), run(), sleep(), eat(), drink() 
        