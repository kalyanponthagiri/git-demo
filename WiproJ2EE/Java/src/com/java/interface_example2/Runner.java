package com.java.interface_example2;

public class Runner implements A,B{

	public static void main(String[] args) {
		
		new Runner().print();
		
		int sum = new Runner().sum(10,20);
		System.out.println(sum);
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sum(int a, int b) {
		
		return a + b;
	}

	@Override
	public String print() {
		System.out.println("Print method is running");
		return null;
	}

}
