package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Demo3 {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Demo3() {
		super();
	}

	@Override
	public String toString() {
		return "Demo3 [subject=" + subject + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("Starting demo3 method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Ending demo3 method");
	}

}
