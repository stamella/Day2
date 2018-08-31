package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Discount;

class DiscountTest {

	@Test
	void test() {
		assertEquals(780,Discount.calcDiscount(1200));
		assertEquals(65,Discount.calcDiscount(100));
	}

}
