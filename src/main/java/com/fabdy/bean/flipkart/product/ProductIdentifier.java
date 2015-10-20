package com.fabdy.bean.flipkart.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductIdentifier {
	@JsonProperty("productId")
	String productId;
	@JsonProperty("categoryPaths")
	CategoryPaths categoryPaths;
}
