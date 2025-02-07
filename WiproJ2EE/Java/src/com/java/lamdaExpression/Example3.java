package com.java.lamdaExpression;


@FunctionalInterface
interface C{
	int sum(int a);    // When you taking one parameter you can the lamda expression.
}

public class Example3 {
	
	public static void main(String[] args) {
		C obj = a -> a;						// Like this.
		System.out.println(obj.sum(20));
	}
}
