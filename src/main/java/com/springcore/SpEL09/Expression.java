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
	@Override
	public String toString() {
		return "Expression [x=" + x + ", y=" + y + "]";
	}
	
}
