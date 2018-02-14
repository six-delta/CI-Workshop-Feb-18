package com.sixdelta.app;

import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

import static org.junit.Assert.*;

public class StringCalculatorTests {
	

	@Test
	@Ignore
	public void testEmptyString() {
		StringCalculator stringCalculator = new StringCalculator();
		int res = stringCalculator.add("");
		assertEquals(0, res);
	}

	@Test
	@Ignore
	public void testOneNumberInTheString() {
		StringCalculator stringCalculator = new StringCalculator();
		int res = stringCalculator.add("1");
		assertEquals(1, res);
		res = stringCalculator.add("2");
		assertEquals(2, res);
		res = stringCalculator.add("3");
		assertEquals(3, res);
		res = stringCalculator.add("5");
		assertEquals(5, res);
	}

	@Test
	@Ignore
	public void testTwoNumbersInTheString() {
		StringCalculator stringCalculator = new StringCalculator();
		int res = stringCalculator.add("1,2");
		assertEquals(3, res);
		res = stringCalculator.add("2,3");
		assertEquals(5, res);
		res = stringCalculator.add("3,4");
		assertEquals(7, res);
		res = stringCalculator.add("5,6");
		assertEquals(11, res);
	}
	
	@Test
	@Ignore
	public void testMoreNumbersInTheString() {
		StringCalculator stringCalculator = new StringCalculator();
		int res = stringCalculator.add("1,2,3");
		assertEquals(6, res);
		res = stringCalculator.add("2,3,4");
		assertEquals(9, res);
		res = stringCalculator.add("4,5,6");
		assertEquals(15, res);
		res = stringCalculator.add("5,6,7,8,9");
		assertEquals(35, res);
	}
	
	@Test
	public void testWithBackLineNumberInTheString() {
		StringCalculator stringCalculator = new StringCalculator();
		int res = stringCalculator.add("0,1\n2,3");
		assertEquals(6,res);
		res = stringCalculator.add("56,88,345\n7777,999,1");
		assertEquals(9266,res);
		res = stringCalculator.add("4,5\n6");
		assertEquals(15, res);
	}


}
