package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private String name;
	private List<String> phoneno;
	private Set<String> addresses;
	
	
	public Student() {
		super();
	}
	
	public Student(String name, List<String> phoneno, Set<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.addresses = addresses;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(List<String> phoneno) {
		this.phoneno = phoneno;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	private Map<String, String> courses;


	@Override
	public String toString() {
		return "Student [name=" + name + ", phoneno=" + phoneno + ", addresses=" + addresses + ", courses=" + courses
				+ "]";
	}
	
	
	
}
