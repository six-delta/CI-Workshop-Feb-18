package com.sixdelta.app;

public class StringCalculator {

	private final int ZERO = 0;

	public int add(String numbers) {
		if (numbers.isEmpty())
			return ZERO;
		if (containsMoreTheOneNumber(numbers, ","))
			return sumNumberTheString(numbers);
		return convertTheStringToNumber(numbers);
	}

	private boolean containsMoreTheOneNumber(String cadena, String foundChar) {
		if (cadena.indexOf(foundChar) == 1)
			return true;
		return false;
	}

	private int sumNumberTheString(String numbers) {
		String[] numero = separatorTheString(numbers, ",");
		int sumNumTheString = 0;
		for (int i = 0; i < numero.length; i++) {
			sumNumTheString += convertTheStringToNumber(numero[i]);
		}
		return sumNumTheString;
	}

	private String removeSpecialCharTheString(String cadena, String removeChar) {

		return cadena;
	}

	private String replaceString(String cadena) {
		String[] cadenaSeparada = separatorTheString(cadena, "\n");
		String cadenaRemplazada = "";
		for (int i = 0; i < cadenaSeparada.length; i++) {
			cadenaRemplazada += cadenaSeparada[i];
		}
		return cadenaRemplazada;

	}

	private int convertTheStringToNumber(String number) {
		return Integer.parseInt(number);
	}

	private String[] separatorTheString(String cadena, String charSeparator) {
		return cadena.split(charSeparator);
	}

}
