package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Work?useSSL=false","root",null);
		PreparedStatement statement = connection.prepareStatement("insert into student values(?,?)");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ID number");
		int num = sc.nextInt();
		
		System.out.println("Enter student name");
		String name = sc.next();
		
		statement.setInt(1, num);
		statement.setString(2, name);
		
		int x = statement.executeUpdate();
		System.out.println(x + " rows inserted");
		System.out.println();
		
		ResultSet res = statement.executeQuery("select * from student");
		
		System.out.println("ID    Name");
		System.out.println("---------------------------");
		while(res.next()) {
			System.out.println(res.getInt(1) + " " + res.getString(2));
		}
		
		connection.close();
		sc.close();
	}
}
