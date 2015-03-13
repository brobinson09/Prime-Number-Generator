package com.primenumber.test;

import junit.framework.TestCase;

import org.junit.*;
 

import com.primenumber.impl.PrimeNumberGenerator;
import com.primenumber.impl.RangeOfPrimes;

public class PrimeNumberGeneratorTest extends TestCase {

	private PrimeNumberGenerator primes;
	
	@BeforeClass
	public void setUp(){
		primes = new RangeOfPrimes();
	}
	
	@Test
	public void testZero(){
		
	}
	
	@Test
	public void testNegativeOne(){
		
	}
	
	@Test
	public void testOne(){
		
	}
	
	
	@Test
	public void testIsPrimeZero(){
		assertFalse(primes.isPrime(0));
	}
	
	@Test
	public void testIsPrimeNegative(){
		
	}
}
