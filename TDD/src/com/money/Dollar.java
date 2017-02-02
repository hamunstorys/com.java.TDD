package com.money;

public class Dollar extends Money {

	public Dollar(int amount) {
		setAmount(amount);
	}

	public Dollar times(int multiplyer) {
		return new Dollar(getAmount() * multiplyer);
	}

}