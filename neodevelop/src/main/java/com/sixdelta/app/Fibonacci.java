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
    int[] sequence = {1,2,3,4,5};
    return sequence;
  }

  public int getTheSumOfEvenNumbersUntil(int n){
    return 0;
  }
}
