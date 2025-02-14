package com.java.collections;

import java.util.SortedMap;
import java.util.TreeMap;
 
public class HashMapExample2 {
 
	
	public static void main(String[] args) {
		
		//create the object of Map interface
		
		//Map<Integer,String> map = new HashMap<>();
		
		/*SortedMap<Integer,String> map = new TreeMap<>(new MyComparator());
			
		map.put(100, "B");
		
		
		map.put(20, "C");
		
		map.put(200, "A");
		
		
		for( Object o: map.entrySet()) {
			
			System.out.println(o);
		}
		
		*/
		
		SortedMap<Student,Long> sm  = new TreeMap<>(new StudentNameComparator());
		
		Student mario = new Student(100,"B");
		Student luigi = new Student(400,"C");
		Student peach = new Student(530,"A");
		
		sm.put(mario, 9848426L);
		sm.put(luigi, 76577767L);
		sm.put(peach, 876767868L);
		
		for(Object o: sm.entrySet())
		{
			System.out.println(o);
		}
		
	}
}
 