package com.sixdelta;

public class StringCalculator {

	public int add(String numbers) {
		int a=0;
		if(numbers.isEmpty()) {
			return 0;
			} 
		
		numbers=numbers.replace("\n",",");
		String[] numeros= numbers.split(",");
		for (int i=0; i<numeros.length; i++) {
		a= a + Integer.parseInt(numeros[i]);
		}return a;
	}
}
