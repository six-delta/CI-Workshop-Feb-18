package com.sixdelta.app;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	public int add(String numbers) {

		if (numbers.isEmpty())
			return 0;
		if (!isSingleNumber(numbers)) {
			String[] numbersToSum = numbers.split(",");
			if (numbers.indexOf("\n") != -1)
				return sumNumbersInStringArray(numbers.replace("\n", ",").split(","));
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
		convertArrayStringToArrayInt(numbersToBeInSum).forEach(i -> System.out.println(i));
		int sumOfNumbersResult = 0;
		int[] sumOfNumbers = new int[numbersToBeInSum.length];
		for (int i = 0; i < numbersToBeInSum.length; i++)
			sumOfNumbers[i] = convertToInt(numbersToBeInSum[i]);
		for (int i : sumOfNumbers)
			sumOfNumbersResult += i;
		return sumOfNumbersResult;
	}
	
	private List<Integer> convertArrayStringToArrayInt(String[] numeros) {
		List<Integer> sumOfNumbers = new ArrayList<Integer>();
		for (int i = 0; i < numeros.length; i++)
			sumOfNumbers.add(convertToInt(numeros[i]));
		return sumOfNumbers;
	}

}
