package com.fabdy.bean.flipkart.category;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiDetail {
	@JsonProperty("resourceName")
	String resourceName;
	@JsonProperty("get")
	String get;
}
