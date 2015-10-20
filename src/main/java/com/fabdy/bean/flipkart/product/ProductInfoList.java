package com.fabdy.bean.flipkart.product;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProductInfoList {
	@JsonProperty("nextUrl")
	String nextUrl;
	@JsonProperty("validTill")
	long validTill;
	@JsonProperty("productInfoList")
	List<ProductDetail> productInfoList;
	/**
	 * @return the nextUrl
	 */
	public String getNextUrl() {
		return nextUrl;
	}
	/**
	 * @return the validTill
	 */
	public long getValidTill() {
		return validTill;
	}
	/**
	 * @return the productInfoList
	 */
	public List<ProductDetail> getProductInfoList() {
		return productInfoList;
	}
	
}
