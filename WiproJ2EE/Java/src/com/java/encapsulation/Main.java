package com.java.encapsulation;

public class Main {

	public static void main(String[] args) {
		
		BankingApp obj = new BankingApp("12345","Mario",10000);
		
		int balance = obj.getBalance();
		System.out.println(balance);
		
		//Check the condition and passed value to the setBalance method is 0 
		//it did not satisfy the if condition
		
		obj.setBalance(0);
		
		System.out.println(obj.getBalance());
		
		
		// Hear it satisfied the if condition So, the balanced is updated
		
		obj.setBalance(4000);
		
		System.out.println(obj.getBalance());

	}

}
