package com.springcore.standalonecollections07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalonecollections07/standalonecollections.xml");
		Person p = (Person)context.getBean("person1");
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());

		System.out.println("__________map________________");
		System.out.println(p.getFeestructure());
		System.out.println(p.getFeestructure().getClass().getName());
		
		System.out.println("__________property________________");
		System.out.println(p.getProps());
	}

}
