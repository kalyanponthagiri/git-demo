package com.java.collections;

public class StudentComparable implements Comparable<StudentComparable>{

	private int sid;
	private String sname;
	
	public StudentComparable(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public int compareTo(StudentComparable o) {
//		if(this.getSid() < o.getSid())
//			return -1;
//		else if(this.getSid() > o.getSid())
//			return 1;
//		else
//			return 0;
		
		return this.getSname().compareTo(o.getSname());
			
	}
	
	@Override
	public String toString() {
		return sid + " " + sname;
	}
	
	
	
}
