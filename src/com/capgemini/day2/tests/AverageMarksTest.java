package com.capgemini.day2.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Average;

class AverageMarksTest {

	@Test
	void Studenttest() {
		assertEquals(100,Average.calcStudentSum(20,50,30),0.02);
		assertEquals(120.752,Average.calcStudentSum(20.2,80.4,20.152),0.02);
		assertEquals(33,Average.calcStudentAverage(20,50,30),0.02);
		assertEquals(90,Average.calcSubjectSum(10,50,30),0.02);
		assertEquals(294,Average.calcStudentSum('a','b','c'),0.02);
		assertEquals(30,Average.calcSubjectAverage(10,50,30),0.02);
	}
		

}
