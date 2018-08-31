package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.StringPalindrome;

class StringPalindromeTest {

	@Test
	void test() {
		assertEquals("tat",StringPalindrome.checkStringpalindrome("dado","not","bye","hello","tat"));
	}

}
