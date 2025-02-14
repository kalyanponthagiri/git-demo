package com.java.transactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Transactions?useSSL=false", "root", null);
		
		connection.setAutoCommit(false);
		
		Statement st = connection.createStatement();
		
		int x = st.executeUpdate("update BankOne set Balance = Balance - 1000 where AccountNumber = 12345");
		System.out.println(x);
		
		int y = st.executeUpdate("update BankTwo set Balance = Balance + 1000 where AccountNumber = 67890");
		System.out.println(y);
		
		if(x > 0) {
			connection.commit();
			System.out.println("Transaction Completed");
		}
		else {
			connection.rollback();
			System.out.println("Transactions Failed");
		}
	}
}