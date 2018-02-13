package com.sixdelta.app;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;

import com.sixdelta.app.FibonacciSequenceGenerator;

public class TestCase {

    //@Ignore
    @Test
    public void firstTest(){
        assertEquals(1,1);
    }

    @Test
    public void fibonacciTestWithOneNumber(){
        FibonacciSequenceGenerator fibonacci = new FibonacciSequenceGenerator();
        long n = fibonacci.getForPosition(2);
        assertEquals(3,n);
        n = fibonacci.getForPosition(3);
        assertEquals(5,n);
        n = fibonacci.getForPosition(4);
        assertEquals(8,n);
        n = fibonacci.getForPosition(5);
        assertEquals(13,n);
        n = fibonacci.getForPosition(9);
        assertEquals(89,n);
    }

    @Test
    public void fibonacciTestWithSequence(){
        FibonacciSequenceGenerator fibonacci = new FibonacciSequenceGenerator();
        long[] result = fibonacci.getSequenceUntil(10);
        long[] expectedResult = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testSumFibonnacciEvenNumbers(){
        FibonacciSequenceGenerator fibonacci = new FibonacciSequenceGenerator();
        long n = fibonacci.getTheSumOfEvenNumbersUntil(10);
        assertEquals(44,n);
        System.out.println("La suma de los numeros pares del fibonacci menores a 4M es = " + fibonacci.getTheSumOfEvenNumbersUntil(32));
    }

}
