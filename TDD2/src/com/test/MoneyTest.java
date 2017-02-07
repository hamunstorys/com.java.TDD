package com.test;

import org.junit.Test;

import com.money.Dollar;

import junit.framework.TestCase;

public class MoneyTest extends TestCase {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);

		assertEquals(new Dollar(10), five.times(2));

		assertEquals(new Dollar(15), five.times(3));
	}

	@Test
	public void testEqualiy() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}

}