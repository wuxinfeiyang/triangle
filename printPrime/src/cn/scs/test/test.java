package cn.scs.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cn.scs.st.PrintPrime;

public class test {
	public PrintPrime prime;
	
	@Before
	public void setUp(){
		prime = new PrintPrime();
	}
	
	@Test
	public void testCase(){
		
		assertEquals("null235711", prime.printPrimes(5));
	}


}
