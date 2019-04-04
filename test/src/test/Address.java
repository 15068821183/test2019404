package test;

import java.io.Serializable;

public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 960029300976412150L;
	private String country;
	private String province;
	public Address(String country, String province) {
		super();
		this.country = country;
		this.province = province;
	}
	
}
