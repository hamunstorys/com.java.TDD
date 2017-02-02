package com.money;

public class Money {

	private int amount;

	@Override
	public boolean equals(Object obj) {

		Money money = (Money) obj;

		System.out.println("money.amount:" + money.amount);
		System.out.println("this.amount:" + this.amount);

		return money.amount == this.amount;
	}

	/* getter */

	public int getAmount() {
		return amount;
	}

	/* setter */

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
