package com.fabdy.bean.flipkart.category;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiGroup {

	@JsonProperty("affiliate")
	Affiliate affiliate;

	/**
	 * @return the affiliate
	 */
	public Affiliate getAffiliate() {
		return affiliate;
	}
}
