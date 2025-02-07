package com.java.exceptionHandling;

import java.util.Scanner;

public class HandlingException_03 {	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		try {
			int ans = a/b;
			System.out.println(ans);
		}
		catch(Exception s) {
			System.out.println("Please enter the number greater than zero");
		}
		finally {
			System.out.println("Finally Block is Executed");
		}
		sc.close();
	}
}
