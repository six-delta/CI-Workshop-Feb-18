package com.sixdelta.app;

public class Fibonacci { 
	public static void main (String[]aegs) {
		int num= 1,n2,cantidad;
		int n1=num-1; System.out.print("\nNumero 1:"+num);
		for (cantidad=1; cantidad<35; cantidad++) {
			n2=num+n1; System.out.println("\nNumero 1:"+(cantidad)+":"+n2);
			n1=num; num=n2;
		}
	}
	

	public int getForPosition(int i) {
		// TODO Auto-generated method stub
		return 0;
	}


	public int[] getSequenceUntil(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	public int getTheSumOfEvenNumbersUntil(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
