package com.money;

public class Franc extends Money {

    public Franc(int amount) {
    	setAmount(amount);
    }

    public Money times(int multiplier) {
        return new Franc(getAmount() * multiplier);
    }

}
