package com.junit;

import org.junit.Test;

import com.money.Bank;
import com.money.Dollar;
import com.money.Expression;
import com.money.Money;
import com.money.Sum;

import junit.framework.TestCase;

public class MoneyTest extends TestCase {

	@Test
	public void testEquality() {
		assertTrue(new Money(5, "$").equals(new Dollar(5, "$")));
		assertFalse(new Money(5, "$").equals(new Dollar(6, "$")));

	}

	@Test
	public void testSimpleAddition() {
		Money five = Money.dollar(5);
		Expression sum = five.plus(five);
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum, "$");
		assertEquals(Money.dollar(10), reduced);

	}

	@Test
	public void testPlusReturnSum() {
		Money five = Money.dollar(5);
		Expression result = five.plus(five);
		Sum sum = (Sum) result;
		Bank bank = new Bank();
		assertEquals(five, sum.augend);
		assertEquals(five, sum.addend);

	}

	@Test
	public void testReduceMoney() {
		Bank bank = new Bank();
		bank.addRate("¢æ", "$", 2);
		Money result = bank.reduce(Money.franc(2), "$");
		assertEquals(Money.dollar(1), result);
	}

//	@Test
//	public void testArraEquals() {
//		assertEquals(new Object[] { "abc" }, new Object[] { "abc" });
//	}
//	
	@Test
	public void testIdenityRate() {
		assertEquals(1, new Bank().rate("$", "$"));
		
	}
	
}