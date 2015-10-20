package com.fabdy.bean.flipkart.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductBaseInfo {
	@JsonProperty("productIdentifier")
	ProductIdentifier productIdentifier;
	@JsonProperty("productAttributes")
	ProductAttribute productAttribute;
	/**
	 * @return the productIdentifier
	 */
	public ProductIdentifier getProductIdentifier() {
		return productIdentifier;
	}
	/**
	 * @return the productAttribute
	 */
	public ProductAttribute getProductAttribute() {
		return productAttribute;
	}
}
