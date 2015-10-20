package com.fabdy.bean.flipkart.product;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoryPaths {
	@JsonProperty("categoryPath")
	List<List<Category>> categoryPath;

	/**
	 * @return the categoryPath
	 */
	public List<List<Category>> getCategoryPath() {
		return categoryPath;
	}
}
