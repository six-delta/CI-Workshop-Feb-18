package com.sixDelta.six_delta;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalulatorTests {
	
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


	@Test
	public void testManyNumbersInTheString() {
		StringCalculator stringCalculator = new StringCalculator();
		int res = stringCalculator.add("1,2,1,2,1,2");
		assertEquals(9, res);
		res = stringCalculator.add("2,3,4,5,3");
		assertEquals(17, res);
		res = stringCalculator.add("3,4,10,12,10,100");
		assertEquals(139, res);
	}


	@Test
	public void testNNumbersWithBreakLineInTheString() {
		StringCalculator stringCalculator = new StringCalculator();
		int res = stringCalculator.add("1,2\n1,2\n1,2");
		assertEquals(9, res);
		res = stringCalculator.add("2,3,\n4,5,\n3");
		assertEquals(17, res);
		res = stringCalculator.add("3,\n4,\n10,12,10,\n100");
		assertEquals(139, res);
	}

}