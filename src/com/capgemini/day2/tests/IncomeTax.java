package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.IncomeTaxes;

class IncomeTax {

	@Test
	void test() {
		assertEquals(80000,IncomeTaxes.calcTax(400000));
		assertEquals(2,IncomeTaxes.calcTax(-400000));
     	assertEquals(80000.025,IncomeTaxes.calcTax(400000.125),0.02);
     	assertEquals(1,IncomeTaxes.calcTax(1200000000));
     	assertEquals(0,IncomeTaxes.calcTax('a'));
	}
}
