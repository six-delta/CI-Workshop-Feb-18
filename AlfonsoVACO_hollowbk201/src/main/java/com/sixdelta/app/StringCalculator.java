package com.sixdelta.app;

public class StringCalculator {
	
	public int add(String numbers) {
		if (numbers.isEmpty())
			return 0;
		else if(numbers.contains(",")) {
			String[] numeros_a_sumar = numbers.split(",");
			return Integer.sum(convertToInt(numeros_a_sumar[0]), convertToInt(numeros_a_sumar[1]));
		}
		else
			return Integer.parseInt(numbers);
		
		
	}
	
	public int convertToInt(String cadena) {
		return Integer.parseInt(cadena);
	}
	
	
	
}
