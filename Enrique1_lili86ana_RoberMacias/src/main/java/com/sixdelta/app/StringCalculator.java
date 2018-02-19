package com.sixdelta.app;

public class StringCalculator {

<<<<<<< HEAD
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
=======
	private final int ZERO = 0;

	public int add(String numbers) {
		if (numbers.isEmpty())
			return ZERO;
		if (theStringContainsMoreThanOneNumber(numbers, ",") || theStringContainsMoreThanOneNumber(numbers, "\n"))
			return theSumOfTheNumbersInTheString(numbers);
		return converASingleStringIntoANumber(numbers);

	}

	// \n
	private int theSumOfTheNumbersInTheString(String numbers) {
		String cadenaConv = convStringeJumpTonumber(numbers, ",", "\n");
		String[] cadenaDiv = divStringeTonumber(cadenaConv, ",");
		int sumNumber = 0;
		for (int i = 0; i < cadenaDiv.length; i++) {
			sumNumber += converASingleStringIntoANumber(cadenaDiv[i]);
		}
		return sumNumber;
	}

	private String[] divStringeTonumber(String cadena, String charDiv) {
		return cadena.split(charDiv);
	}

	private String convStringeJumpTonumber(String cadena, String charCover, String charSust) {
		return cadena.replaceAll(charSust, charCover);
	}

	private boolean theStringContainsMoreThanOneNumber(String cadena, String charContains) {
		if (cadena.indexOf(charContains) == 1)
			return true;
		return false;
	}

	private int converASingleStringIntoANumber(String numbers) {
		return Integer.parseInt(numbers);
	}

>>>>>>> 6d3f290a993b82adda9806c9c76b9da42025fb13
}
