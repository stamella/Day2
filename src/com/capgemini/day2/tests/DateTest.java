package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Date;

class DateTest {

	@Test
	void test() {
	   
	   assertEquals("15/May/1995",Date.checkDate(15,05,1995));
		assertEquals("15/June/1995",Date.checkDate(15,06,1995));
	}

}
