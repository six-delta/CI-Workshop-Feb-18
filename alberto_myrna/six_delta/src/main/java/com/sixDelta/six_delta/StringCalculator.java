package com.sixDelta.six_delta;

	public class StringCalculator{
		
		public int add(String numbers) {
			int sumaDeValoresEnStringEntrante=0;
			String delimitadores = "(\\n|,)";
			if(numbers.isEmpty()){return 0;} 
			else{
				String [] cadenasAParsear;
				cadenasAParsear = numbers.split(delimitadores);
				for(int a=0;a<cadenasAParsear.length;a++){
					sumaDeValoresEnStringEntrante=sumaDeValoresEnStringEntrante+Integer.
					parseInt(cadenasAParsear[a]);
				}
				return sumaDeValoresEnStringEntrante;
			}
		}
}
