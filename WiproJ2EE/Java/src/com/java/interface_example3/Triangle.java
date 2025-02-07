package com.java.interface_example3;

public class Triangle implements Shape {
	
	private int base;
	private int height;
	
	public Triangle(int a, int b) {
		this.base = a;
		this.height = b;
	}

	@Override
	public int area() {
		
		return (base*height)/2;
	}

}
