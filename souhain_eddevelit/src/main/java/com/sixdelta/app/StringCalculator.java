package com.sixdelta.app;

public class StringCalculator {

	public int add(String numbers) {

		
		//prueba 1 
		if (numbers.isEmpty()) {
			return 0;
		}

		//Evalua si es tipo string
		if (numbers.getClass().equals(String.class)) {
			//Reemplaza los saltos de linea
			String remplazo = numbers.replace("\n", ",");
			//Tiene coma ?
			CharSequence coma = ",";
			boolean tieneComa = remplazo.contains(coma);
			//
			if (tieneComa) {
				String[] partes = remplazo.split(",");
				int sumaArray = 0;
				for (int i = 0; i < partes.length; i++) {
					sumaArray += Integer.parseInt(partes[i]);
				}
				return sumaArray;
			}

		}
		return Integer.parseInt(numbers);

	}
}
