package com.java.accessModifier;

public class Runner {

	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.sum());
		
		B b = new B();
		
		System.out.println(b.sum());
	}

}
