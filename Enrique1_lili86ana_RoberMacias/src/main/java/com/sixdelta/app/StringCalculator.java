package com.sixdelta.app;

public class StringCalculator {

	public int add(String numbers) {
		if (numbers.isEmpty())
			return 0;
		else if (containChar(numbers, ",")) {
			return sumString(numbers);
		}
		return Integer.parseInt(numbers);

	}
	
	private boolean containChar(String cadena, String charContains) {
		if (cadena.indexOf(charContains) == 1) return true;
		return false;		
	}

	private  int sumString(String numbers) {
		String[] numero = numbers.split(",");
		int sumNum = 0;
		for (int i = 0; i < numero.length; i++) {
			sumNum += Integer.parseInt(numero[i]);
		}
		return sumNum;
	}
}
