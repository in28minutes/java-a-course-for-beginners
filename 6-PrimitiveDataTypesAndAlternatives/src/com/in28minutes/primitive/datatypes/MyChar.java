package com.in28minutes.primitive.datatypes;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		//'a' e i o u or A E I O U
		if(ch == 'a')
			return true;

		if(ch == 'e')
			return true;
		
		if(ch == 'i')
			return true;
		
		if(ch == 'o')
			return true;
		
		if(ch == 'u')
			return true;
		
		return false;
	}

}
