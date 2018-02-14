package com.sixdelta.app;

public class StringCalculator {

	public int add(String numbers) {

		if (numbers.isEmpty())
			return 0;
		if (!isSingleNumber(numbers)) {
			numbers = numbers.replaceAll("[^0-9]+", " ");
			String[] numbersToSum = numbers.trim().split(" ");
			return sumNumbersInStringArray(numbersToSum);
		}
		return Integer.parseInt(numbers);
	}

	public int convertToInt(String numberInString) {
		return Integer.parseInt(numberInString);
	}

	private boolean isSingleNumber(String number) {
		return !isMultipleNumber(number);
	}

	private boolean isMultipleNumber(String number) {
		return number.split(",").length > 1;
	}

	private int sumNumbersInStringArray(String[] numbersToBeInSum) {
		int sumOfNumbersResult = 0;
		int[] sumOfNumbers = new int[numbersToBeInSum.length];
		for (int i = 0; i < numbersToBeInSum.length; i++)
			sumOfNumbers[i] = convertToInt(numbersToBeInSum[i]);
		for (int i : sumOfNumbers)
			sumOfNumbersResult += i;
		return sumOfNumbersResult;
	}

}
