package com.java.collections;

public class Student {
	private long sid;
	private String sname;
	
	public Student(long sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public long getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}
	
	public String toString() {
		return sid + " " + sname;
		
	}
}
