package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
	static Map<Integer, String> hash = new HashMap<>(); //can be used anywhere in the class
	
	public static void main(String[] args) {
		
		hash.put(101, "kalyan");
		hash.put(102, "lokesh");
		hash.put(103, "muzu");
		hash.put(104, "rishi");
		hash.put(106, "aarif");
		hash.put(105, "subbu");
		
		System.out.println(hash);
		System.out.println(hash.get(102));
		System.out.println(hash.containsKey(104));
		System.out.println(hash.containsValue("mario"));
		System.out.println(hash.remove(101));
		System.out.println(hash);
		System.out.println(hash.keySet());
		System.out.println(hash.values());
		System.out.println(hash.entrySet());
	}
}
