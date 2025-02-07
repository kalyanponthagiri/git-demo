package com.java.collections;

public class Array {

	public static void main(String[] args) {
		
		int arr[];
		
		arr = new int[4];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		arr[0] = 4;
		arr[1] = 3;
		arr[2] = 2;
		arr[3] = 1;
		
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
