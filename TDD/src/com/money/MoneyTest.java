package com.money;

import org.junit.Test;

import junit.framework.TestCase;

public class MoneyTest extends TestCase {

	@Test
	public void testMultiplication() {
		/*fail("Not yet implemented");*/
		Dollar five = new Dollar(5);
	
		five.times(2);
		assertEquals(10, five.amount);
	}

}
