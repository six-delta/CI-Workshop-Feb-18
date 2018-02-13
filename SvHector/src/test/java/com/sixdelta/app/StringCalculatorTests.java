package com.sixdelta.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTests {
	
	@Test
	public void testEmptyString() {
		StringCalculator stringCalculator = new StringCalculator();
		int res = stringCalculator.add("");
		assertEquals(0, res);
	}
	
	
	@Test
	public void testOneNumberInTheString() {
		
	}
	
	

}
