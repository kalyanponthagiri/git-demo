package com.java.lamdaExpression;

@FunctionalInterface
interface B{
	void print();
}


public class Example2 {

	public static void main(String[] args) {
		
		B obj = () -> {
			
			System.out.println("I am getting printed");
			System.out.println("I am getting printed");
		};
		obj.print();

	}

}
