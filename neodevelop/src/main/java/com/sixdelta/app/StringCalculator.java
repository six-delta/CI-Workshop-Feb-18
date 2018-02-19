package com.sixdelta.app;

import java.util.List;

public class StringCalculator {

	public int add(String numbers) {
		if(numbers.isEmpty()) return 0;
		String[] sequenceNumbers = numbers.split(",");
    int acumm = 0;
    for(String n : sequenceNumbers){
      acumm += Integer.parseInt(n);
    }
    return  acumm;
	}
}
