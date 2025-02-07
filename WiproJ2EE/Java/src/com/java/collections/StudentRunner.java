package com.java.collections;

import java.util.TreeSet;

public class StudentRunner {

	public static void main(String[] args) {
		
		TreeSet<StudentComparable> hs = new TreeSet<>();
		
		hs.add(new StudentComparable(4,"Kalyan"));
		hs.add(new StudentComparable(6,"Lokesh"));
		hs.add(new StudentComparable(3,"Muzu"));
		hs.add(new StudentComparable(9,"Rishi"));
		hs.add(new StudentComparable(44,"Dr.Sai"));
		
		System.out.println(hs);
	}

}