package com.sixdelta.app;

import java.util.Arrays;

public class StringCalculator {

	public int add(String numbers) {

		if (numbers.isEmpty())
			return 0;
		numbers = numbers.replaceAll("[^-?0-9]+", " ");
		if (!isSingleNumber(numbers)) {
			if(isNegativeNumber(numbers)){
				return convertToInt(makeArrayOfNegativeNumbers(numbers));
			}
			String[] numbersToSum = numbers.trim().split(" ");
			return sumNumbersInStringArray(numbersToSum);
		}
		return convertToInt(numbers);
	}

	public int convertToInt(String numberInString) {
		if(!numberInString.matches("(-[0-9]+)+"))
			return Integer.parseInt(numberInString);
		return 0;
	}

	private boolean isSingleNumber(String number) {
		return !isMultipleNumber(number);
	}

	private boolean isMultipleNumber(String number) {
		return number.split(" ").length > 1;
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
	
	private boolean isNegativeNumber(String numbers) {
		if(numbers.contains("-")) {
			return true;
		}
		return false;
	}
	
	private String makeArrayOfNegativeNumbers(String numbers) {
		numbers = numbers.replaceAll(" [0-9]+", "");
		String[] negativeNumbers = numbers.trim().split(" ");
		System.out.println("Esta calculadora no permite numeros negativos y se detectó lo siguiente: " + Arrays.toString(negativeNumbers));
		String multipleNegativeNumbers = Arrays.toString(negativeNumbers);
		return multipleNegativeNumbers.replaceAll("[^-?0-9]+", "");
	}

}
