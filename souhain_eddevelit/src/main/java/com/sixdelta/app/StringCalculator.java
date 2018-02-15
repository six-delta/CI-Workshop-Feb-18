package com.sixdelta.app;

public class StringCalculator {

	public int add(String numbers) {

		if (numbers.isEmpty()) {
			return 0;
		}
		if (numbers.getClass().equals(String.class)) {
			String replace = numbers.replace("\n", ",");
			CharSequence comma = ",";
			boolean isComma = replace.contains(comma);
			if (isComma) {
				String[] parts = replace.split(",");
				int addArray = 0;
				for (int i = 0; i < parts.length; i++) {
					addArray += Integer.parseInt(parts[i]);
				}
				return addArray;
			}
		}
		return Integer.parseInt(numbers);
	}
}
