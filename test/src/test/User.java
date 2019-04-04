package test;

import java.io.Serializable;

public class User implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8780798150539012824L;
	private int age;
	private String name;
	private Address address;
	public User(int age, String name, Address address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}
	
}
