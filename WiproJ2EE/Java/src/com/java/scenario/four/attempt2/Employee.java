package com.java.scenario.four.attempt2;

public class Employee {
	
	private int ID;
	private String name;
	private String department;
	
	public Employee(int iD, String name, String department) {
		super();
		ID = iD;
		this.name = name;
		this.department = department;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
