package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Multidimensional;

class MultidimensionTest {

	@Test
	void test() {
		assertEquals("Found",Multidimensional.searchElement(new int[][] {{1,2},{3,4}}));
	}

}
