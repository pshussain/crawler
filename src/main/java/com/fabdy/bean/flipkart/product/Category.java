package com.fabdy.bean.flipkart.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {
	@JsonProperty("title")
	String title;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
}
