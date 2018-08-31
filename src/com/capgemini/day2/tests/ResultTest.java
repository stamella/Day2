package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Results;

class ResultTest {

	@Test
	void test() {
		assertEquals("pass",Results.grade(70,80,90));
		assertEquals("promote",Results.grade(40,80,90));
		assertEquals("fail",Results.grade(20,50,90));
     	assertEquals("pass",Results.grade(60,60,60));
		assertEquals("fail",Results.grade(40,10,90));
		assertEquals("fail",Results.grade(0,0,0));
		assertEquals(null,Results.grade(7000,1080,9025));
		assertEquals("fail",Results.grade(-10,-20,0));
		assertEquals("fail",Results.grade(0.789624,0.2355,0.52));
		assertEquals("promote",Results.grade('a',70,50));
		assertEquals(null,Results.grade(0456,20,90));
		assertEquals("promote",Results.grade(0x12,70,80));
		
		
	}

}
