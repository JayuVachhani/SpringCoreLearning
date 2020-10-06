package com.springcore.autowire;

public class Address1 {
	private String state;
	private String country;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address1() {
		super();
	}
	public Address1(String state, String country) {
		super();
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address1 [state=" + state + ", country=" + country + "]";
	}

}
