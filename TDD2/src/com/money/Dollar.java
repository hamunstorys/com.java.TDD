package com.money;

public class Dollar extends Money {

	public Dollar(int amount, String currency) {
		super(amount, currency);
	}

	public String currency() {
		return currency;

	}

}
