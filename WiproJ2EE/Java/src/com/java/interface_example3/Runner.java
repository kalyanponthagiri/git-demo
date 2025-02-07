package com.java.interface_example3;

public class Runner {
	public static void main(String[] args) {
		Shape triangle = new Triangle(3,4);
		Shape Rectangle = new Rectangle(3,4);
		
		System.out.println("Area of the Trianle : "+triangle.area());
		System.out.println("Area of the Rectangle : "+Rectangle.area());
	}
}
