package com.fabdy.bean.flipkart.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MaximumRetailPrice {
	@JsonProperty("amount")
	double amount;
	@JsonProperty("currency")
	String currency;
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
}
