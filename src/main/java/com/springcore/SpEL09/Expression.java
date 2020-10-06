package com.springcore.SpEL09;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Expression {
//	we can give any type of expression
//	we can also call static methods, object methods, variables using SpEL
	
	@Value("#{ 22+11 }")
	private int x ;
	
	@Value(" #{ 3+4*6 } ")
	private int y;
	
//	here we can call static method of any class by following below format
//	T(classname).method(param) similarly for variable T(classname).variable
	@Value("#{ T(java.lang.Math).sqrt(64) }")
	private double z;
	
	@Value("#{ T(java.lang.Math).PI }")
	private double pi;
	
	
//	we can create object simply by passing class name
	@Value("#{ new String('Jay') }")
	private String name;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Expression [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + "]";
	}
	
	
	
}
