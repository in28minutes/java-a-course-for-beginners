package com.in28minutes.api.h;

public class RecordsRunner {
	
	record Person(String name, String email, String phoneNumber) {
		Person {
			if(name == null)
				throw new IllegalArgumentException("name is null");
		}
		
		public String name() {
			System.out.println("Do Something");
			return name;
		}
		
	}

	public static void main(String[] args) {
		Person person = new Person("Ranga", "ranga@in28minutes.com","123-456-7890");
		System.out.println(person.name());

		
//		Person person1 = new Person("Ranga", "ranga@in28minutes.com","123-456-7890");
//		Person person2 = new Person("Ranga1", "ranga@in28minutes.com","123-456-7890");
//		System.out.println(person.equals(person1));
//		System.out.println(person.equals(person2));

	}

}
