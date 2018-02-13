package com.sixdelta.app;

import org.junit.*;
import static org.junit.Assert.*;

public class TestCase {

  @Test
  public void firstTest(){
    assertEquals(1,1);
  }

  @Test
  public void testFibonnacciWithOneNumber(){
    Fibonacci fibonacci = new Fibonacci();
    int n = fibonacci.getForPosition(3);
    assertEquals(n,3);
    n = fibonacci.getForPosition(4);
    assertEquals(n,5);
    n = fibonacci.getForPosition(5);
    assertEquals(n,8);
    n = fibonacci.getForPosition(6);
    assertEquals(n,13);
    n = fibonacci.getForPosition(10);
    assertEquals(n,89);
  }

  @Test
  public void testFibonnaccSequence(){
    Fibonacci fibonacci = new Fibonacci();
    int[] result = fibonacci.getSequenceUntil(10);
    int[] expectedResult = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89} ;
    assertArrayEquals( expectedResult, result );
  }

  @Test
  public void testSumFibonnacciEvenNumbers(){
    Fibonacci fibonacci = new Fibonacci();
    int n = fibonacci.getTheSumOfEvenNumbersUntil(10);
    assertEquals(n,44);
    System.out.println(fibonacci.getTheSumOfEvenNumbersUntil(4000000));
  }

}