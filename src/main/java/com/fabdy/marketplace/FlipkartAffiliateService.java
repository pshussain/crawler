package com.fabdy.marketplace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.configuration.Configuration;

import com.fabdy.bean.flipkart.category.Api;
import com.fabdy.common.AffiliateCredential;
import com.fabdy.db.ConnectionManager;
import com.fabdy.http.HttpHandler;
import com.fabdy.parser.FlipkartParser;

public class FlipkartAffiliateService {
	
	private final String categoryApi;
	private final String affiliateToken;
	private final Map<String, String> credential;
	private String affiliateId;
	private FlipkartParser parser;
	private List<String> productFeedUrls;
	private ConnectionManager manager;
	private String username;
	private String password;
	private String database;
	private String url;
	public FlipkartAffiliateService(Configuration config) throws Exception {
		this.categoryApi = config.getString(AffiliateCredential.AFF_API_URL);
		this.affiliateId = config.getString(AffiliateCredential.AFF_ID);
		this.affiliateToken = config.getString(AffiliateCredential.AFF_TOKEN);
		this.credential = new HashMap<String, String>() {
			{
				put("Fk-Affiliate-Id", affiliateId);
				put("Fk-Affiliate-Token", affiliateToken);
			}
		};
		this.username = config.getString(AffiliateCredential.DB_USERNAME);
		this.password = config.getString(AffiliateCredential.DB_PASSWORD);
		this.database = config.getString(AffiliateCredential.DB_DATABASE);
		this.url = config.getString(AffiliateCredential.DB_URL);
		
		this.parser = new FlipkartParser();
		this.productFeedUrls = new ArrayList<String>();
		this.manager = ConnectionManager.getInstance(username, password, url, database);
	}
	
	public void fetchCategory() throws Exception {
		final String apiRes = HttpHandler.doGet(categoryApi, credential);
		final Api api = parser.parseApi(apiRes);
		System.out.println(api.getDescription());
	}
	
	public void fetchProducts() {
		
	}
}
