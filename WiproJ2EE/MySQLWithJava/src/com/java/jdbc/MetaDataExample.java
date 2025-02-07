package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaDataExample {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Work?useSSL=false","root",null);
		
		Statement st = connection.createStatement();
		
		ResultSet resultSet = st.executeQuery("select * From student");
		
		ResultSetMetaData metaData = resultSet.getMetaData();
		
		int columnCount = metaData.getColumnCount();
		System.out.println(columnCount);
		
		System.out.println("-----------------------");
		
		for(int i=1; i<=columnCount; i++) {
			System.out.println(metaData.getColumnName(i) + " " + metaData.getColumnTypeName(i) + " " + metaData.getPrecision(i));
		}
		
		System.out.println("-----------------------");
		
		System.out.println(metaData.getTableName(1));
		
		connection.close();
	}
}
