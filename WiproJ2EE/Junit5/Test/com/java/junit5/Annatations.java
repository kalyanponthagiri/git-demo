package com.java.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Annatations {
	
	@BeforeEach
	void pritBefore() {
		System.out.println("Just Do It");
	}
	
	@AfterEach
	void printAfter() {
		System.out.println("Afert");
	}
	
	@Test
	void test1() {
		int num = 4;
		assertEquals(4,num);
	}
	
	@Test
	void test2() {
		System.out.println("Printed");
	}
	
	@Test
	void test3() {
		Integer num = null;
		assertEquals(null,num);
	}
}
