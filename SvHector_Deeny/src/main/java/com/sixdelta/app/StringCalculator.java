package com.sixdelta.app;

public class StringCalculator {

	public int add(String numbers) {
		int sumaString = 0;
		if (numbers.isEmpty()) {
			return 0;
		}
		String[] stringParsear;
		numbers = numbers.replaceAll("\n", ",");
		numbers = numbers.replaceAll(",,", ",");

		stringParsear = numbers.split(",");
		for (int a = 0; a < stringParsear.length; a++) {
			sumaString = sumaString + Integer.parseInt(stringParsear[a]);
		}
		return sumaString;
	}
}