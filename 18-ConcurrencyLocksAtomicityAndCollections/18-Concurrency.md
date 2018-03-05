<!---
Current Directory : /in28Minutes/git/java-a-course-for-beginners/18-ConcurrencyLocksAtomicityAndCollections
-->

## Complete Code Example


### /src/com/in28minutes/concurrency/BiCounter.java

```java
package com.in28minutes.concurrency;

public class BiCounter {
	private int i = 0;
	private int j = 0;
	
	synchronized public void incrementI() {
		i++; 
		//get i
		//increment  
		//set i
	}

	public int getI() {
		return i;
	}
	
	synchronized public void incrementJ() {
		j++; 
		//get j
		//increment  
		//set j
	}

	public int getJ() {
		return j;
	}

}
```
---

### /src/com/in28minutes/concurrency/BiCounterWithAtomicInteger.java

```java
package com.in28minutes.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomicInteger {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();
		
	public void incrementI() {		
		i.incrementAndGet();
	}

	public int getI() {
		return i.get();
	}
	
	public void incrementJ() {
		j.incrementAndGet(); 
	}

	public int getJ() {
		return j.get();
	}

}
```
---

### /src/com/in28minutes/concurrency/BiCounterWithLock.java

```java
package com.in28minutes.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	private int i = 0;
	private int j = 0;
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	public void incrementI() {		
		lockForI.lock();//Get Lock For I 
		i++;
		lockForI.unlock();
		//Release Lock For I
	}

	public int getI() {
		return i;
	}
	
	public void incrementJ() {
		lockForJ.lock();//Get Lock For J
		j++; 
		lockForJ.unlock();//Release Lock For J
	}

	public int getJ() {
		return j;
	}

}
```
---

### /src/com/in28minutes/concurrency/ConcurrencyRunner.java

```java
package com.in28minutes.concurrency;

public class ConcurrencyRunner {

	public static void main(String[] args) {
		Counter counter = new Counter();
		counter.increment();
		counter.increment();
		counter.increment();
		System.out.println(counter.getI());

	}

}
```
---

### /src/com/in28minutes/concurrency/ConcurrentMapRunner.java

```java
package com.in28minutes.concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();
		
		String str = "ABCD ABCD ABCD";

		for(char character:str.toCharArray()) {
			occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
		}
		
		System.out.println(occurances);
				

	}

	/*
	 		Map<Character, LongAdder> occurances = new Hashtable<>();
		
		String str = "ABCD ABCD ABCD";
		for(char character:str.toCharArray()) {
			LongAdder longAdder = occurances.get(character);
			if(longAdder == null) {
				longAdder = new LongAdder();
			}
			longAdder.increment();
			occurances.put(character, longAdder);
		}
		
		System.out.println(occurances);

	 */
}
```
---

### /src/com/in28minutes/concurrency/CopyOnWriteArrayListRunner.java

```java
package com.in28minutes.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {
	
	//add - copy
	//get

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		
		//Threads - 3
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");
		
		//Threads - 10000
		for(String element:list) {
			System.out.println(element);
		}
		
		// TODO Auto-generated method stub

	}

}
```
---

### /src/com/in28minutes/concurrency/Counter.java

```java
package com.in28minutes.concurrency;

public class Counter {
	private int i = 0;
	
	synchronized public void increment() {
		i++; 
		//get i
		//increment  
		//set i
	}

	public int getI() {
		return i;
	}
}
```
---
