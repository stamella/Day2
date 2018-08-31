package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Square;

class SquareTest {

	@Test
	void test() {
		assertEquals(25,Square.calSquare(5));
    	assertEquals(25,Square.calSquare(-5));
    	assertEquals(0,Square.calSquare(0));
    	assertEquals(9409,Square.calSquare('a'));
////     	assertEquals(0,Square.calSquare(0x153));
		assertEquals(91204,Square.calSquare(0456));
	}

}
