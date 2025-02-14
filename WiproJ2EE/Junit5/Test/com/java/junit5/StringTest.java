package com.java.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void test1() {
		int l = "string".length();
		int exp = 6;
		assertEquals(exp,l);
	}
	@Test
	void Test2() {
		String s = "ASDFGHJKL";
		boolean b = s.contains("JKL");
	//	assertEquals(true,b);
		assertTrue(b);
	}
	
	@Test
	void Test3() {
		String s = "ASDFGHJKL";
		//	assertEquals(true,b);
		assertTrue(s.contains("JKL")); // Inline in Eclipse
	}
}
