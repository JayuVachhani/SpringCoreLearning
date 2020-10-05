package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demo2 implements InitializingBean, DisposableBean  {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Demo2() {
		super();
	}

	@Override
	public String toString() {
		return "Demo2 [price=" + price + "]";
	}

//	this is a method of InitializingBean interface and work as init method
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Taking value");
	}

	public void destroy() throws Exception {
	// TODO Auto-generated method stub
		System.out.println("Throwing value");
}
	
	
	
}
