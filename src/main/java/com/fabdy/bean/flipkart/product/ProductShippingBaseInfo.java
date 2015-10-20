package com.fabdy.bean.flipkart.product;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductShippingBaseInfo {
	/**
	 * @return the shippingOptions
	 */
	public List<ShippingOption> getShippingOptions() {
		return shippingOptions;
	}

	@JsonProperty("shippingOptions")
	List<ShippingOption> shippingOptions;
}
