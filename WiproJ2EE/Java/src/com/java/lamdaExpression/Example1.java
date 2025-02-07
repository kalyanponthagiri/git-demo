package com.java.lamdaExpression;

@FunctionalInterface
interface A{
	void print();
}

public class Example1 {

	public static void main(String[] args) {
		A obj = () -> System.out.println("I am getting printed");
		obj.print();

	}

}
