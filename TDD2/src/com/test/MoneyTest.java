package com.test;

import org.junit.Test;

import com.money.Bank;
import com.money.Dollar;
import com.money.Expression;
import com.money.Franc;
import com.money.Money;
import com.money.Sum;

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
		Money five = Money.franc(5);

		assertEquals(Money.franc(10), five.times(2));

		assertEquals(Money.franc(15), five.times(3));
	}

	@Test
	public void testEqualiy() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		;
		assertFalse(Money.dollar(5).equals(Money.franc(5)));

	}

	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());

	}

	@Test
	public void testDifferentClassEquality() {
		assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
	}

	@Test
	public void testSimpleAddition() {

		Money five = Money.dollar(5);
		Expression sum = five.plus(five);
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(10), reduced);

	}

	@Test
	public void testPlusReturnsSum() {
		Money five = Money.dollar(5);
		Expression result = five.plus(five);
		Sum sum = (Sum) result;
		assertEquals(five, sum.augend);
		assertEquals(five, sum.addend);
	}

	@Test
	public void testReduceSum() {
		Bank bank = new Bank();
		Money result = bank.reduce(Money.dollar(1), "USD");
		assertEquals(Money.dollar(1), result);
	}

}
