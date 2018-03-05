package com.in28minutes.tips.eclipse;

import java.math.BigDecimal;

//PAIR PROGRAMMING

class TestBean {
	private int i; //i is awesome
	private String str;
	
	
	
	public TestBean() {
		/*
		 fsadjflkas
		 fskljdfalsk
		 */
		super();	
	}
	
	public TestBean(int i, String str) {
		super();
		this.i = i;
		this.str = str;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TestBean other = (TestBean) obj;
		if (i != other.i) {
			return false;
		}
		return true;
	}
	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}
	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}
	/**
	 * @return the str
	 */
	public String getStr() {
		return str;
	}
	/**
	 * @param str the str to set
	 */
	public void setStr(String str) {
		this.str = str;
	}
	
	
	
}

class Test implements Comparable<String> {

	@Override
	public int compareTo(String arg0) {
		return 0;
	}
	
}

public class EclipseTipsAndTricks {
	
	public static void main(String[] args) throws InterruptedException {
		
		DummyForTest dt = new DummyForTest();
		dt.doSomething();
		BigDecimal bd = new BigDecimal(25);
		Thread.sleep(returnSomething());
	}

	private static int returnSomething() {
		return 1000 * 45 * 456;
	}

}
