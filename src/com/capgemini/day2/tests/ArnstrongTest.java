package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Armstrong;

class ArnstrongTest {

	@Test
	void test() {
		assertEquals(true,Armstrong.checkArmstrongNumber(153));
		assertEquals(true,Armstrong.checkArmstrongNumber(-153));
		assertEquals(false,Armstrong.checkArmstrongNumber(145));
		assertEquals(false,Armstrong.checkArmstrongNumber('a'));
		assertEquals(false,Armstrong.checkArmstrongNumber(0x153));
		assertEquals(false,Armstrong.checkArmstrongNumber(0456));
     	
    }

}
