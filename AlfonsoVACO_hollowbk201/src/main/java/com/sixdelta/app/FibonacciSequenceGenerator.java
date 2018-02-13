package com.sixdelta.app;

import java.util.Arrays;

public class FibonacciSequenceGenerator {

    long[] getSequenceUntil(int n){        
	long[] fibonacciSeq = new long[n];
	fibonacciSeq[0] = 1;
	fibonacciSeq[1] = 2;
        for(int i = 2; i<n; i++){
            fibonacciSeq[i] = fibonacciSeq[i-1] + fibonacciSeq[i-2];
        }
	return fibonacciSeq;
    }

    long getForPosition(int n){
	long[] fiboSeq = new long[n];
	fiboSeq = getSequenceUntil(n+1);
	return fiboSeq[n];
    }

    long getTheSumOfEvenNumbersUntil(int n){
	long pairSum = 0;
	long[] pairSumArray = new long[n];
	long[] fiboSeq = new long[n];
	fiboSeq = getSequenceUntil(n);
	//System.out.print(Arrays.toString(fiboSeq));
	for (int i = 0; i < fiboSeq.length; i++){
	    if (fiboSeq[i] % 2 == 0) {
                pairSumArray[i] = fiboSeq[i];
                i++;
     	    }
	}
	//System.out.print(Arrays.toString(pairSumArray));
	for (long i : pairSumArray){
    	    pairSum += i;
	}
	return pairSum;
    }

}

