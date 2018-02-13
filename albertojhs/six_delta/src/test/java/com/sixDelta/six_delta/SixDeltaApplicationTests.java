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
	public void pruebaSimple() {
		assertEquals(1,1);

	}


	@Test
	public void pruebaFibonacciDeUnNumeroDado(){
		Fibonacci fibo = new Fibonacci();
		assertEquals(89,fibo.calculaPara(10));
	}

}
