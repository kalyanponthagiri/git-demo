package com.java.lamdaExpression;

import java.util.function.Function;

public class FunctionInterface {
	
	// public interface Function<T, R> 
	// R apply(T t);

	public static void main(String[] args) {
		
		Function<String, Integer> obj = (a) -> a.length();
		System.out.println("Length of the string : " + obj.apply("Link"));
	}

}
