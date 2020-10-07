package com.springcore.constructorinjection;

public class Person {
	private int pid;
	private String pname;
	
	
	public Person(int pid, String pname) {
//		super();
		this.pid = pid;
		this.pname = pname;
		
		
	}


	@Override
	public String toString() {
		return this.pid + " : " +this.pname;
	}
	
	

}
