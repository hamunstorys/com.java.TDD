package com.money;

public class Sum implements Expression {

	public Expression augend;
	public Expression addend;

	public Sum(Expression augend, Expression addend) {

		this.augend = augend;
		this.addend = addend;

	}

	@Override
	public Money reduce(Bank bank, String to) {
		int amount = augend.reduce(bank, to).getAmount() + addend.reduce(bank, to).getAmount();
		return new Money(amount, to);
	}

	public Expression plus(Money expression) {
		return new Sum(this, expression);
	}

	public Expression times(int multiplier) {
		return new Sum(augend.times(multiplier), addend.times(multiplier));
	}


}
