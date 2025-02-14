package com.java.lamdaExpression;

import java.util.TreeSet;

public class StudentRunner {

	public static void main(String[] args) {
		
		TreeSet<Student> obj = new TreeSet<>((o1,o2) -> o1.getsName().compareTo(o2.getsName()));
		
		obj.add(new Student(101,"Beck"));
		obj.add(new Student(102,"Camp"));
		obj.add(new Student(103,"Frog"));
		obj.add(new Student(104,"Apple"));
		obj.add(new Student(105,"Dock"));
		
		obj.forEach(x -> System.out.println(x));
		

	}

}
