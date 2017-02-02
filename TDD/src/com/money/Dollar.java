package com.money;

public class Dollar extends Money {

	public Dollar(int amount) {
		setAmount(amount);
	}

	public Money times(int multiplier) {
		return new Dollar(getAmount() * multiplier);
	}

}
