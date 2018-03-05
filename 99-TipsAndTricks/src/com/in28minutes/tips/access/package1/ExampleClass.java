package com.in28minutes.tips.access.package1;

public class ExampleClass {
	public void publicMethod() {}
	protected void protectedMethod() {}
	private void privateMethod() {}
	void defaultMethod() {}
	
	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.privateMethod();
		exampleClass.protectedMethod();
		exampleClass.publicMethod();
		exampleClass.defaultMethod();
	}
}
