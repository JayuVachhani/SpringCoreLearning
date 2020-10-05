package com.springcore.constructorinjection;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a, int b) {		
		this.a = a;
		this.b = b;
		System.out.println("Constructor");
	}
	public Addition(double a, double b) {		
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Double Constructor");		
	}
	public Addition(String a, String b) {		
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("String Constructor");
	}
	public void doSum() {
		
		System.out.println("Value of A is "+this.a+" and B is "+this.b);
		System.out.println("Sum is "+ (this.a + this.b) +".");
	}
	
}
//it will print string constructor if any string value present in constructor
//it is a ambiguity because by default values are string
//we can solve this ambiguity by providing (type) property in xml bean
//now based on type it will call appropriate constructor 