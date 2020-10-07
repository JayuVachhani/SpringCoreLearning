package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collections.xml");
		Student st = (Student) context.getBean("collestudent");
		System.out.println(st.getName());
		System.out.println(st.getPhoneno());
		System.out.println(st.getAddresses());
		System.out.println(st.getCourses());
	}

}
