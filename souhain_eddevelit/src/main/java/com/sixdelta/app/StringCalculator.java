package com.sixdelta.app;

public class StringCalculator {

	public int add(String numbers) {

		if (numbers.isEmpty()) {
			return 0;
		}
			String replace = numbers.replace("\n", ",");
				String[] parts = replace.split(",");
				int addArray = 0;
				for (int i = 0; i < parts.length; i++) {
					addArray += Integer.parseInt(parts[i]);
				}
				return addArray;
	}
}
