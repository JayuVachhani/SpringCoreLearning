package com.springcore.alternateofxml10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
//		here we are using pure java configuration class instead of XML file
//		that means total control is taken by Java class
//		so longer use of ClassPathXmlApplicationContext
//		instead of it we have to use AnnotationConfigApplicationContext for path of java class
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student st = context.getBean("student",Student.class);
		st.read();
		
		ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfigwithBean.class);
//		here we have to pass get methodname to access that object i.e. getWithoutComponentAnnotation
		WithoutComponentAnnotation nocom = (WithoutComponentAnnotation) con.getBean("getWithoutComponentAnnotation");
		nocom.run();
	}

}
