package com.fabdy.bean.flipkart.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDetail {
	@JsonProperty("productBaseInfo")
	ProductBaseInfo productBaseInfo;
	/**
	 * @return the productBaseInfo
	 */
	public ProductBaseInfo getProductBaseInfo() {
		return productBaseInfo;
	}
	/**
	 * @return the productShippingBaseInfo
	 */
	public ProductShippingBaseInfo getProductShippingBaseInfo() {
		return productShippingBaseInfo;
	}
	/**
	 * @return the offset
	 */
	public String getOffset() {
		return offset;
	}
	@JsonProperty("productShippingBaseInfo")
	ProductShippingBaseInfo productShippingBaseInfo;
	@JsonProperty("offset")
	String offset;
}
