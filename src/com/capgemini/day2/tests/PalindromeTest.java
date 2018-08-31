package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Palindrome;

class PalindromeTest {

	@Test
	void test() {
		assertEquals(true,Palindrome.checkPalindrome(151));
		assertEquals(false,Palindrome.checkPalindrome(-151));
		assertEquals(false,Palindrome.checkPalindrome('a'));
		assertEquals(false,Palindrome.checkPalindrome(0456));
		assertEquals(false,Palindrome.checkPalindrome(0x12));
		
	}

}
