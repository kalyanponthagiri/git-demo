package com.java.interface_example1;

public class InterfaceRunner implements InterfaceA{

	public static void main(String[] args) {
		
		InterfaceRunner obj = new InterfaceRunner();
		obj.sum(10,20);
		obj.sub();
		
//		System.out.println(obj.pi);
		System.out.println(InterfaceA.pi);
	}

	@Override
	public void sum(int a,int b) {
		System.out.println(a+b);
		
	}

	@Override
	public void sub() {
		System.out.println("Hi i am sub");
		
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
	}

}
