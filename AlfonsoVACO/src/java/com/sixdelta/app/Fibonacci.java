package com.sixdelta.app;

public class Fibonacci {

	private int inicio_fibonaci = 1, consecutivo_fibonacci = 2;
	private int itera = 0, suma_todos = 0;

	public int getForPosition(int numero) {
		if (numero < 2)
			return 1;
		return getForPosition(numero - 1) + getForPosition(numero - 2);
	}

	public int[] getSequenceUtil(int numero) {
		return (int[]) getFibonacci(numero);
	}

	public int getTheSumOfEvenNumbersUntil(int numero) {
		getFibonacci(numero);
		return suma_todos;
	}

	private int[] getFibonacci(int numero_limite) {

		int[] list_result = new int[numero_limite];
		suma_todos = 0;
		itera = 1;
		list_result[0] = inicio_fibonaci;
		
		for (int i = 2; i <= numero_limite; i++) {

			if (consecutivo_fibonacci >= 4000000)
				return null;

			consecutivo_fibonacci = inicio_fibonaci + consecutivo_fibonacci;
			inicio_fibonaci = consecutivo_fibonacci - inicio_fibonaci;

			list_result[itera] = inicio_fibonaci;
			itera++;

			if (inicio_fibonaci % 2 == 0)
				suma_todos += inicio_fibonaci;
		}

		return list_result;
	}

}
