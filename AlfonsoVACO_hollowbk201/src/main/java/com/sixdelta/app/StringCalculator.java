package com.sixdelta.app;

public class StringCalculator {
	
	public int add(String numbers) {
		int sumOfNumbersResult = 0;
		if (numbers.isEmpty())
			return 0;
		if(!isSingleNumber(numbers)) {
			String[] numbersToSum = numbers.split(",");
			int[] sumOfNumbers = new int[numbersToSum.length];
			for(int i = 0;i<numbersToSum.length; i++) {
				sumOfNumbers[i] = convertToInt(numbersToSum[i]);
			}
			for(int i : sumOfNumbers) {
				sumOfNumbersResult += i;
			}
			System.out.println(sumOfNumbersResult);
			return sumOfNumbersResult;
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
	
}
