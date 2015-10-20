package com.fabdy.bean.flipkart.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SellingPrice {
	@JsonProperty("amount")
	double amout;
	@JsonProperty("currency")
	String currency;
	/**
	 * @return the amout
	 */
	public double getAmout() {
		return amout;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
}
