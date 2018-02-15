package com.sixdelta.app;

import org.junit.Test;
import static org.junit.Assert.*;

<<<<<<< HEAD
=======
import org.junit.Ignore;

>>>>>>> 6d3f290a993b82adda9806c9c76b9da42025fb13
public class StringCalculatorTests {
	
	@Test
	public void testEmptyString() {
		StringCalculator stringCalculator = new StringCalculator();
		int res = stringCalculator.add("");
		assertEquals(0, res);
	}
	
	@Test
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
<<<<<<< HEAD
=======
	
	@Test
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
	public void testMoreNumbersWishJumpLineInTheString() {
		StringCalculator stringCalculator = new StringCalculator();
		int res = stringCalculator.add("1\n2\n3");
		assertEquals(6, res);
		res = stringCalculator.add("2\n3\n4");
		assertEquals(9, res);
		res = stringCalculator.add("4\n5\n6");
		assertEquals(15, res);
		res = stringCalculator.add("5\n6\n7\n8\n9");
		assertEquals(35, res);
	}

>>>>>>> 6d3f290a993b82adda9806c9c76b9da42025fb13

}
