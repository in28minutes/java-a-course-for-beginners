package com.in28minutes.api.g;

public class TextBlocksRunner {

	public static void main(String[] args) {
		String str1 = """
				fsadfjklasjf""";
		String str = """
				"Line 1"   
				   "Line 2"  
				   Line 3  
				       Line 4 
				       Line 5      
				Line 6""";

		String textBlock = """
			Line 1: %s
			Line 2: %s
			Line 3
			Line 4
			""".formatted("Some Value", "Some Other Value");

		System.out.print(textBlock);

	}

}
