package com.java.encapsulation;


public class BankingApp {
	
	private String accountNumber;
	private String accountHolderName;
	private int balance;
	
	
	public BankingApp(String accountNumber, String accountHolderName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int amount) {
		
		if(amount > 0) {
			this.balance += amount;
		}
	}
	
	
	
}
