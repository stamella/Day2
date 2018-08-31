package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.ReverseString;

class ReverseStringTest {

	@Test
	void test() {
		assertEquals(" ihtaws ih",ReverseString.printReverse("hi swathi"));
	}

}
