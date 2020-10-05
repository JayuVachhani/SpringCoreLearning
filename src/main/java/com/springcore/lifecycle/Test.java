package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// AbstractApplicationContext is a parent interface of ApplicationContext
		//here we use AbstractApplicationContext to get access of lifecycle hooks
//			registerShutdownHook will call destroy method
			
		AbstractApplicationContext context = new  ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle.xml");
		context.registerShutdownHook();	
		Demo1 d = (Demo1)context.getBean("demo1");
		System.out.println(d);		
		
		
		System.out.println("----------------------------Interface methods--------------------------");
		Demo2 d2 = (Demo2) context.getBean("demo2");
		System.out.println(d2);
		context.registerShutdownHook();
	
		System.out.println("________________________Annotations________________________________");
		Demo3 d3 =(Demo3)context.getBean("demo3");
		System.out.println(d3);
	}

	
}
