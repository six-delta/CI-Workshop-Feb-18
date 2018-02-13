package com.sixdelta.app;

public class StringCalculator {

	public int add(String numbers) {
		
		if(numbers.isEmpty()) { return 0;
		}
		
		else {
	    String[] parts = numbers.split(",");
		String part1 = parts[1];
		String part2 = parts[2];
			return Integer.parseInt(part1+part2);
		}
	}
}
