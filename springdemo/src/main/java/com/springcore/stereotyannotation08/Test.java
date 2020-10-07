package com.springcore.stereotyannotation08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotyannotation08/stereo.xml");
		
		Student s = (Student)context.getBean("student");
//		Student s = context.getBean("student",Student.class);
		System.out.println(s);

	}

}
