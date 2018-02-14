package com.sixdelta.app;

public class StringCalculator {

	public int add(String numbers) {

		if (numbers.isEmpty()) {
			return 0;
		}
		//if(numbers) {}
		if(numbers.getClass().equals(String.class)) {
			String numero = numbers;
			String[] partes = numero.split(",");
			System.out.println(partes[1]);
			if(partes[0] != null)
			{
				String part1 = partes[0]; 
				String part2 = partes[1]; 
				int a = Integer.parseInt(part1);
				int b = Integer.parseInt(part2);
				return (a + b);
			}
		}
		return Integer.parseInt(numbers);
		
	}
}
