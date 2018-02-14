package com.sixdelta.app;

public class StringCalculator {

	public int add(String numbers) {
		
	

		if (numbers.isEmpty()) {
			return 0;
		}

		if (numbers.getClass().equals(String.class)) {

			String contiene = numbers;
			CharSequence cs1 = ",";
			boolean retval = contiene.contains(cs1);
			if (retval) {
				String numero = numbers;
				String[] partes = numero.split(",");
				int numeroArray = 0;
				for (int i = 0; i< partes.length; i++){
			    numeroArray += Integer.parseInt(partes[i]) ;
			 
			        }
				return numeroArray;
			}
			
		}
		return Integer.parseInt(numbers);

	}
}
