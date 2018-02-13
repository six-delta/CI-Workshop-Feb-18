package com.sixdelta.app;

public class Fibonacci {

  public int getForPosition(int n){
    return calculateFibonacci(n);
  }

  private int calculateFibonacci(int n){
    if(n < 2) return 1;
    return calculateFibonacci(n-1) + calculateFibonacci(n - 2);
  }

  public int[] getSequenceUntil(int n){
    int[] sequence = new int[n];
    for(int i = 0; i < n; i ++){
      sequence[i] = getForPosition(i+1);
    }
    return sequence;
  }

  public int getTheSumOfEvenNumbersUntil(int n){
    int[] sequence = getSequenceUntil(n);
    int accum = 0;
    for(int i = 0; i < sequence.length; i++){
      if(sequence[i] % 2 == 0)
        accum += sequence[i];
    }
    return accum;
  }
}

