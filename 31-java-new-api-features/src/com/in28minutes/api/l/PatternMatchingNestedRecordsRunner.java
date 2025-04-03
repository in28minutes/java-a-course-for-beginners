package com.in28minutes.api.l;

record Customer(String name, String email) {}

record Product(String name, double price) {}

record Order(Customer customer, Product product) {}


public class PatternMatchingNestedRecordsRunner {
 
	public static void processOrder(Object obj) {
        if (obj instanceof Order(
                Customer(String name, String email), 
                Product(String productName, double price))) {
            System.out.println("Customer " + name + 
                    " ordered " + productName + " for $" + price);
        }
    }

    public static void main(String[] args) {
        processOrder(new Order(
        		new Customer("Ranga","Email"), 
                new Product("Cricket Bat",100)));
    }
}