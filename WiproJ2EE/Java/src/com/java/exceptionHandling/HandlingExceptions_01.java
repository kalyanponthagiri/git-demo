package com.java.exceptionHandling;

import java.util.Scanner;

public class HandlingExceptions_01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number a : ");
		int a = sc.nextInt();
		System.out.print("Enter the number b : ");
		int b = sc.nextInt();
		
		try {
		
		int div = a/b;
		System.out.println("Result : "+div);
		
		}
		catch(ArithmeticException re) {
			System.out.println("Please enter the number greater than zero");
		}
		sc.close();
	}
}