package com.fabdy.bean.flipkart.category;

public class ApiDetail {
	String category;
	String url;
	public ApiDetail(String category, String url) {
		this.category = category;
		this.url = url;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	
}
