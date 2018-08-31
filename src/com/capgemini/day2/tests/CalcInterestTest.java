package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.CalcInterest;

class CalcInterestTest {

	@Test
	void test() {
		assertEquals(5000.0,CalcInterest.simpleInterest(10000,2,25));
		assertEquals(-5000.0,CalcInterest.simpleInterest(-10000,2,25));
		assertEquals(0.0,CalcInterest.simpleInterest(0,0,0));
		assertEquals(97000.0,CalcInterest.simpleInterest(100000,1,'a'));
		assertEquals(5625.0,CalcInterest.CompoundInterest(10000,2,25));
		assertEquals(-5625.0,CalcInterest.CompoundInterest(-10000,2,25));
		assertEquals(0.0,CalcInterest.CompoundInterest(0,0,0));
		assertEquals(97000.0,CalcInterest.CompoundInterest(100000,1,'a'));
		assertEquals(3842.3124850590175,CalcInterest.CompoundInterest(25000.45,1.5,10));
	}

}
