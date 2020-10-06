package com.springcore.stereotyannotation08;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//we can give any name of onject by passing object name @Component("object name")
@Component
public class Student {
//	to enter value
	@Value("Jay")
	private String name;
	@Value("Mumbai")
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	

}
