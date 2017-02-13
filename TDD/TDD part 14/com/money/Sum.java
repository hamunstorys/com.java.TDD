package com.money;

public class Sum implements Expression {

	public Money augend;
	public Money addend;

	public Sum(Money augend, Money addend) {

		this.augend = augend;
		this.addend = addend;

	}

	public Money reduce(String to) {
		int amount = augend.getAmount() + addend.getAmount();
		return new Money(amount, to);

	}

	@Override
	public Money reduce(Bank bank, String to) {
		int amount = augend.getAmount() + addend.getAmount();
		return new Money(amount, to);
	}
}
