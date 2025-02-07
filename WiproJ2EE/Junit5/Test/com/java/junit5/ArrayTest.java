package com.java.junit5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ArrayTest {
	
	@Test
	void compareArrays() {
		String s = "ASD FGH JKL";
		String[] actual = s.split(" ");
		String[] exp = {"ASD","FGH","JKL"};
		assertArrayEquals(exp,actual);
	}
}
