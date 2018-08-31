package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Missing;

class MissingElement {

	@Test
	void test() {
		assertEquals(2,Missing.calculate(new int[] {0,1,3}));
		assertEquals(8,Missing.calculate(new int[] {0,1,2,3,4,5,6,7,9}));
	}

}
