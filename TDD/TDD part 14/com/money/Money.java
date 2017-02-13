package com.money;

public class Money implements Expression {

	private int amount;
	private String currency;

	public Money(int amount, String currency) {
		setAmount(amount);
		setCurrency(currency);
	}

	public static Money dollar(int amount) {
		return new Money(amount, "$");
	}

	public static Money franc(int amount) {
		return new Money(amount, "€");
	}

	public Money times(int multiplier) {
		return new Money(getAmount() * multiplier, getCurrency());
	}

	/*
	 * augend : 피가산수 
	 * addend : 가산수 
	 * 
	 * ($5 + 5$)*2 = 피가산수 *2 + 가산수 *2
	 */

	public Expression plus(Money addend) {

		return new Sum(this, addend);
	}

	@Override
	public Money reduce(String to) {
		int rate = (currency.equals("€") && to.equals("$")) ? 2 : 1;
		return new Money(amount / rate, to);

	}
	
	@Override
	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(currency, to);
		return new Money(amount / rate, to);

	}

	@Override
	public boolean equals(Object o) {
		Money money = (Money) o;
		System.out.println(toString());
		return amount == money.amount && getCurrency().equals(money.getCurrency());
	}

	public String toString() {
		return getAmount() + " " + getCurrency();
	}

	/* getter */

	public int getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}

	/* setter */

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}