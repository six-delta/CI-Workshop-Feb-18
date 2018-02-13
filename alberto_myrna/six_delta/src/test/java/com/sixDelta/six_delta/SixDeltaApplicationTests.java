package com.sixDelta.six_delta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
import com.sixDelta.six_delta.Fibonacci;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SixDeltaApplicationTests {

	@Test
	public void simple() {
		assertEquals(1,1);

	}


	@Test
	public void fibonacciDeUnNumeroDado(){
		Fibonacci fibo = new Fibonacci();
		assertEquals(3524578,fibo.calculaPara(32));
	}

	@Test
	public void sumaDeNumeros(){
		Fibonacci fibo = new Fibonacci();
		assertEquals(4613732,fibo.calculaSumaDeNNumeros(32));
	}
}
