package com.money;

import java.util.Hashtable;

public class Bank {

	private Hashtable rates = new Hashtable();

	public Money reduce(Expression expression, String to) {
		return expression.reduce(this, to);
	}

	public void addRate(String from, String to, int rate) {
		this.rates.put(new Pair(from, to), rate);
	}

	public int rate(String from, String to) {
		if (from.equals(to)) {
			return 1;
		}

		Integer rate = (Integer) this.rates.get(new Pair(from, to));
		return rate.intValue();
	}

	private class Pair {

		private String from;
		private String to;

		Pair(String from, String to) {
			this.from = from;
			this.to = to;
		}

		@Override
		public boolean equals(Object o) {
			Pair pair = (Pair) o;
			return this.from.equals(pair.from) && this.to.equals(pair.to);
		}

		@Override
		public int hashCode() {
			return 0;
		}
	}
}
