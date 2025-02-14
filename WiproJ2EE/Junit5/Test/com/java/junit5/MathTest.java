package com.java.junit5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MathTest {
	
	@Test
	void minValue() {
		int ActualValue = Math.min(20, 10);
		int ExpectedValue = 10;
		assertEquals(ExpectedValue,ActualValue); // we first pass expected value and actual value
	}
	
	@Test
	void maxValue() {
		int max = Math.max(20, 30);
		int exp = 30;
		assertEquals(exp,max);
	}
}
