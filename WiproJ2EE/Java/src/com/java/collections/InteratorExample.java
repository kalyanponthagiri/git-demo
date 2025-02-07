package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorExample {

	public static void main(String[] args) {
		
//		List l = new ArrayList();
//		
//		l.add(100);
//		l.add("Mario");
//		l.add(200);
//		l.add(true);
//		l.add(40.5);
//		
//		for(Object o : l) {
//			System.out.println(o);
//		}
		
		List ll = new ArrayList();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		
		Iterator i = ll.iterator();
		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		while(i.hasNext()) {
			Integer n = (Integer) i.next();
			if (n%2 != 0) {
				i.remove();
			}
		}
		System.out.println(ll);
	}

}
