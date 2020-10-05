package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/reference.xml");
		A ar = (A) context.getBean("aref");
		System.out.println(ar.getX());
		System.out.println(ar.getObj().getY());
		System.out.println(ar);

	}

}
