package com.fabdy.marketplace;

import java.util.HashMap;
import java.util.Map;

import com.fabdy.bean.flipkart.category.Api;
import com.fabdy.http.HttpHandler;
import com.fabdy.parser.FlipkartParser;

public class FlipkartAffiliateService {
	
	private final String categoryApi;
	private final String affiliateToken;
	private final Map<String, String> credential;
	private String affiliateId;
	private FlipkartParser parser;
	public FlipkartAffiliateService(String categoryApi, String affId, String token) {
		this.categoryApi = categoryApi;
		this.affiliateId = affId;
		this.affiliateToken = token;
		this.credential = new HashMap<String, String>() {
			{
				put("Fk-Affiliate-Id", affiliateId);
				put("Fk-Affiliate-Token", affiliateToken);
			}
		};
		this.parser = new FlipkartParser();
		
	}
	
	public void fetchCategory() throws Exception {
		final String apiRes = HttpHandler.doGet(categoryApi, credential);
		final Api api = parser.parseApi(apiRes);
		System.out.println(api.getDescription());
	}
}
