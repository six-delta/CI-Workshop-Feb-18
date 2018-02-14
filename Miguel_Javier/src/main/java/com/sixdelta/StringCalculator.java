package com.sixdelta;

import java.util.ArrayList;

public class StringCalculator {

	public int add(String numbers) {
		//ArrayList<Integer> obtenerNumeros = new ArrayList<Integer>();
		int a=0;
		if(numbers.isEmpty()) {
			return 0;
			} 

		String[] numeros= numbers.split(",");
		for (int i=0; i<numeros.length; i++) {
		//obtenerNumeros.add(i, Integer.parseInt(numeros[i]));
		a= a + Integer.parseInt(numeros[i]);
		}return a;
		//else return Integer.parseInt(numbers);


		
	}
}

//String cadena = "mucho codigo";
//int resultado = cadena.indexOf("cho");

//if(resultado != -1) {
//    ...
//}