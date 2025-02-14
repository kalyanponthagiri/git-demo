package com.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(20);
		set.add(30);
		
		System.out.println(set); // Does not allow the duplicate values.
		
		
		Set<Integer> obj1 = new LinkedHashSet<>();
		
		obj1.add(40);
		obj1.add(10);
		obj1.add(30);
		obj1.add(10);
		
		System.out.println(obj1); // Does not allow duplicate values and preserve the order of the insertion.
		
		Set<Integer> obj2 = new TreeSet<Integer>();
		
		obj2.add(40);
		obj2.add(10);
		obj2.add(30);
		obj2.add(10);
		
		System.out.println(obj2); // Does not allow duplicate values and sorted the values.
	}
	
}
