package com.test;

import org.junit.Test;

import com.money.Dollar;
import com.money.Franc;
import com.money.Money;

import junit.framework.TestCase;

public class MoneyTest extends TestCase {

	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);

		assertEquals(Money.dollar(10), five.times(2));

		assertEquals(Money.dollar(15), five.times(3));
	}

	@Test
	public void testFrancMultiplication() {
		Money five = Money.Franc(5);

		assertEquals(Money.Franc(10), five.times(2));

		assertEquals(Money.Franc(15), five.times(3));
	}

	@Test
	public void testEqualiy() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.Franc(5).equals(Money.Franc(5)));
		assertFalse(Money.Franc(5).equals(Money.Franc(6)));
		assertFalse(Money.dollar(5).equals(Money.Franc(5)));

	}

}
