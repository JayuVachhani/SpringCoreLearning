package com.springcore.lifecycle;

public class Demo1 {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Value set for price");
		this.price = price;
	}

	public Demo1() {
		super();
	}

	@Override
	public String toString() {
		return "Demo1 [price=" + price + "]";
	}
	
//	we can give any name of init and destroy method
	public void init() {
		System.out.println("Inside Init method");
		
	}
	public void destroy() {
		System.out.println("Inside Destroy method");
	}
	
}
