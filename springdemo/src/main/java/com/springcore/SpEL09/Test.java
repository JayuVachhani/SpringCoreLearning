package com.springcore.SpEL09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context  =new ClassPathXmlApplicationContext("com/springcore/SpEL09/spel.xml");
		Expression e = (Expression)context.getBean("expression");
		System.out.println(e);
		
		
	}

}
