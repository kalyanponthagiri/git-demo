package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		List ll = new ArrayList();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		l.add(420);
		l.add(true);
		l.add("Sample");
		l.add(420);
		l.add(42.5);
		
		System.out.println(l);
		
		System.out.println(l.isEmpty());
		System.out.println(l.contains(42.5));
		System.out.println(l.indexOf(420));
		System.out.println(l.lastIndexOf(420));
		System.out.println(l);
		System.out.println(ll);
		l.addAll(ll);
		System.out.println(l);
		l.remove("Sample");
		System.out.println(l);
		l.remove(0);
		System.out.println(l);
		System.out.println(ll);
		
		
		

	}

}
