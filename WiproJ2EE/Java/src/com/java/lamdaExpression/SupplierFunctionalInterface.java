package com.java.lamdaExpression;

import java.util.function.Supplier;

public interface SupplierFunctionalInterface {
	
	public static void main(String[] args) {
		
		Supplier<Integer> obj = () -> 100;
		
		System.out.println(obj.get());
	}
}
