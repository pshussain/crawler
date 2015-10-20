package com.fabdy.bean.flipkart.category;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class AvailableVariants {
	@JsonProperty("v0.1.0")
	ApiDetail v010;
}
