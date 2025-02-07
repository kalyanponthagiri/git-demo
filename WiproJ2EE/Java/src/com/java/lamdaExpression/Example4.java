package com.java.lamdaExpression;

@FunctionalInterface
interface D{
	int sum(int a, int b); // multiple parameters
}


public class Example4 {

		public static void main(String[] args) {
			
			D obj = (a, b) -> { 		// you write lambda expression like this.
				int sum = a+b;			// you just write (return a+b) it will also give the same output.
				return sum;				
			};
			
			System.out.println(obj.sum(10,20));
		}
}

/*
 * code look like this:
 * 
 *  D obj = (a,b) -> return a+b;
 *  
 */