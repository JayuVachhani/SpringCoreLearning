package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		
		StudentDaoImpl sdi=con.getBean("studentdaoimpl",StudentDaoImpl.class);
		Student s = new Student();
//		-------------insert---------------
//		s.setSid(4);
//		s.setName("Yash");
//	s.setCity("Manali");
//		
//		int result = sdi.insert(s);
//	System.out.println("Student Added.."+result);
		
		
//		-----------------update------------------------
//		s.setSid(2);
//		s.setName("Ankur");
//		s.setCity("Jamnagar");
//		int result = sdi.update(s);
//		System.out.println("Data updated");
		
//		----------------delete----------------------
//		s.setSid(4);
//		int  result = sdi.delete(s);
//		System.out.println("Data deleted");
		
//		------------------single data------------------
//		Student s1=sdi.getStudent(2);
//		System.out.println(s1);
		
//		------------------multiple----------
		List<Student> students = sdi.getAllStudents();
		for(Student st : students) {
			System.out.println(st);
		}
			
	}

}
