package com.java.exceptionHandling;

import java.util.Scanner;

public class Except {
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter first number");
			int fno = sc.nextInt();
			
			System.out.println("enter second number");
			int sno = sc.nextInt();
			
			int addition = fno + sno;
			System.out.println("addition is : " + addition);
			
			sc.close();
			
		} 
		catch (Exception ime) {
			
			System.out.println("Please give numbers as input ");
			
		}

	}
}