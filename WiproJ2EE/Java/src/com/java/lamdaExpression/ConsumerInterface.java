package com.java.lamdaExpression;

import java.util.function.Consumer;

public class ConsumerInterface {
	// public interface Consumer<T>
	//  void accept(T t);
	
	public static void main(String[] args) {
		
		Consumer<Integer> obj = (n) -> 
								{
									if(n % 2 == 0)
											System.out.println(n + " is even number");
									else
											System.out.println(n + " is odd number");
			
								};
			obj.accept(10012);
	}
}
