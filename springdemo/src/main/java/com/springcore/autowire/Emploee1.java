package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emploee1 {
	@Autowired
//	qualifier is used to get reference of specific bean
	@Qualifier("address11")
	private Address1 address1;	

	public Address1 getAddress1() {
		return address1;
	}

	public void setAddress1(Address1 address1) {
		this.address1 = address1;
	}

	public Emploee1() {
		super();
	}

	@Override
	public String toString() {
		return "Employee1 [address=" + address1 + "]";
	}
	
	

}