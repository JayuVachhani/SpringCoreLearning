package com.springcore.autowire;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// AbstractApplicationContext is a parent interface of ApplicationContext
		//here we use AbstractApplicationContext to get access of lifecycle hooks
//			registerShutdownHook will call destroy method
			
		ApplicationContext context = new  ClassPathXmlApplicationContext("com/springcore/autowire/autowire.xml");
		
		Employee e = (Employee)context.getBean("emp");
		System.out.println(e);	
			
//	by default autowire supports bytyte
//		System.out.println("________________________Annotations________________________________");
		Emploee1 e1 = (Emploee1)context.getBean("emp1");
		System.out.println(e1);
	}

	
}