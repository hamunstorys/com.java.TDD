package com.money;

public class Franc extends Money {

	public Franc(int amount) {
		setAmount(amount);
	}

	public Franc times(int multiplyer) {
		return new Franc(getAmount() * multiplyer);
	}

}
