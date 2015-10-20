package com.fabdy.bean.flipkart.category;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Api {
	@JsonProperty("title")
	String title;
	@JsonProperty("description")
	String description;
	@JsonProperty("apiGroups")
	ApiGroup apiGroups;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @return the apiGroups
	 */
	public ApiGroup getApiGroups() {
		return apiGroups;
	}
}
