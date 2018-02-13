package com.sixdelta.app;

public class StringCalculator {

	public int add(String numbers) {

		if (numbers.isEmpty())
			return 0;
		if (!isSingleNumber(numbers)) {
			String[] numbersToSum = numbers.split(",");
			if (numbers.indexOf("\n") != -1)
				return sumaNumeros(numbers.replace("\n", ",").split(","));

			return sumaNumeros(numbersToSum);
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

	private int sumaNumeros(String[] numeros) {
		int sumOfNumbersResult = 0;

		int[] sumOfNumbers = new int[numeros.length];
		for (int i = 0; i < numeros.length; i++)
			sumOfNumbers[i] = convertToInt(numeros[i]);

		for (int i : sumOfNumbers)
			sumOfNumbersResult += i;

		return sumOfNumbersResult;
	}

}
