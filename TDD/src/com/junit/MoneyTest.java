package com.junit;

import org.junit.Test;

import com.money.Dollar;
import com.money.Franc;
import com.money.Money;

import junit.framework.TestCase;

public class MoneyTest extends TestCase {

	/* Dollar Test */

	@Test
	public void testMiltiplication() {
		Money five = Money.dollar(5);

		assertEquals(Money.dollar(10), five.times(2));

		five.setAmount(5);
		assertEquals(new Dollar(15), five.times(3));

	}

	@Test

	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));

		/* part 7 Dollar¿Í Franc ºñ±³ */

		assertFalse(new Dollar(5).equals(new Franc(5)));

	}

	@Test
	public void tesFranctMiltiplication() {
		Franc five = new Franc(5);

		assertEquals(new Franc(10), five.times(2));

		five.setAmount(5);
		assertEquals(new Franc(15), five.times(3));

	}

}