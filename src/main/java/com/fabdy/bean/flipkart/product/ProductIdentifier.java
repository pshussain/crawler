package com.fabdy.bean.flipkart.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductIdentifier {
	@JsonProperty("productId")
	String productId;
	@JsonProperty("categoryPaths")
	CategoryPaths categoryPaths;
	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * @return the categoryPaths
	 */
	public CategoryPaths getCategoryPaths() {
		return categoryPaths;
	}
}
