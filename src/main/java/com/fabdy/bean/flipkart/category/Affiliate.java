package com.fabdy.bean.flipkart.category;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Affiliate {
	@JsonProperty("name")
	String name;
	@JsonProperty("apiListings")
	ApiListing apiListings;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the apiListings
	 */
	public ApiListing getApiListings() {
		return apiListings;
	}
}
