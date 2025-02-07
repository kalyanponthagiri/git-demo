package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Example4 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Work?useSSL=false","root",null);
		
		PreparedStatement ds = connection.prepareStatement("delete from student where ID = ?");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID of the student to delete");
		int num = sc.nextInt();
		ds.setInt(1, num);
		

		int x = ds.executeUpdate();
		System.out.println(x + " rows Deleted");
		System.out.println();
		
		ResultSet res = ds.executeQuery("select * from student");
		
		System.out.println("ID    Name");
		System.out.println("---------------------------");
		while(res.next()) {
			System.out.println(res.getInt(1) + "	" + res.getString(2));
		}
		
		connection.close();
		sc.close();
	}
}
