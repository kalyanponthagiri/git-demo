package com.java.interface_example3;

public class Rectangle implements Shape {
	
	private int length;
	private int breath;
	
	Rectangle(int l, int b){
		this.length = l;
		this.breath = b;
	}
	

	@Override
	public int area() {
		
		return length * breath;
	}

}
