package com.money;

public interface Expression {

	Money reduce(Bank bank, String to);

	Expression plus(Money money);

	Expression times(int multiplier);

}
