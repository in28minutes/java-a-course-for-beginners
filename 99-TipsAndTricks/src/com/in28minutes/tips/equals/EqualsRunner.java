package com.in28minutes.tips.equals;

class Client {
	private int id;

	public Client(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object that) {
		if (this == that)
			return true;
		
		if (that == null)
			return false;
		if (getClass() != that.getClass())
			return false;
		Client other = (Client) that;
		if (id != other.id)
			return false;
		return true;
	}
	
	//equals
	//hashcode
	
	
	
}

public class EqualsRunner {

	public static void main(String[] args) {
		Client c1 = new Client(1);
		Client c2 = new Client(1);
		Client c3 = new Client(2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		
	}

}
