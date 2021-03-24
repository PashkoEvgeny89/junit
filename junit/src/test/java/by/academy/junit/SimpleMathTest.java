package by.academy.junit;

import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SimpleMathTest extends Assert {
	
	@Test
	@Ignore
	public void testFail() {
		System.out.println("@testFail");
		fail();
	}
	
	@Test
	public void testMathSum() {
		System.out.println("@testMathSum");
		assertEquals(4, Calculator.getSum(2, 2));
	}
	
	@Test (timeout=1000)
	@Ignore
	public void testTimeout() {
		while (true) {
			System.out.println("alalal");
		}
			}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@Test
	public void testMathMultiple() {
		System.out.println("@testMathMultiple");
		assertEquals(6, Calculator.getMultiple(2, 3));
	}
	
	@Test(timeout=100)
	public void test() throws IOException {
		for (;;) {
			
		}
	}
	

}
