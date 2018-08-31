package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Duplicate;

class DuplicateTest {

	@Test
	void test() {
		assertEquals("ab",Duplicate.RemoveDuplicate("abb"));
	}

}
