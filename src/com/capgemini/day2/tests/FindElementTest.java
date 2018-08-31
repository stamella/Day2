package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Search;

class FindElementTest {

	@Test
	void test() {
		assertEquals("present",Search.FindElement(19));
		assertEquals("present",Search.FindElement(47));
		assertEquals("not present",Search.FindElement(-19));
		assertEquals("not present",Search.FindElement('a'));
		assertEquals("present",Search.FindElement(19.00));
		assertEquals("not present",Search.FindElement(31.523));
	}

}
