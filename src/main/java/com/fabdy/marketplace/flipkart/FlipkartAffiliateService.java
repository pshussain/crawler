package com.fabdy.marketplace.flipkart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.commons.configuration.Configuration;

import com.fabdy.bean.flipkart.category.Api;
import com.fabdy.bean.flipkart.category.ApiDetail;
import com.fabdy.common.AffiliateCredential;
import com.fabdy.common.FlipkartCategory;
import com.fabdy.db.ConnectionManager;
import com.fabdy.http.HttpHandler;
import com.fabdy.parser.FlipkartParser;

import net.minidev.json.JSONObject;

public class FlipkartAffiliateService {
	
	private final String categoryApi;
	private final String affiliateToken;
	private final Map<String, String> credential;
	private String affiliateId;
	private ConnectionManager manager;
	private String username;
	private String password;
	private String database;
	private String url;
	FlipkartParser parser;
	ExecutorService service = Executors.newCachedThreadPool();
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
//		this.manager = ConnectionManager.getInstance(username, password, url, database);
	}
	
	public void fetchCategory() throws Exception {
		final String apiRes = HttpHandler.doGet(categoryApi, credential);
		final JSONObject resObj = parser.parseApi(apiRes);
		getAllCategoryApis(resObj);
		
	}
	
	private void getAllCategoryApis(JSONObject resObj) throws InterruptedException {
		final JSONObject apiGropups = (JSONObject) resObj.get("apiGroups");
		final JSONObject affiliate = (JSONObject) apiGropups.get("affiliate");
		final JSONObject apiListing = (JSONObject) affiliate.get("apiListings");
		for(String category : FlipkartCategory.CATEGORY) {
			final JSONObject categoryDetail = (JSONObject) apiListing.get(category);
			final JSONObject availableVariants = (JSONObject) categoryDetail.get("availableVariants");
			final JSONObject version = (JSONObject) availableVariants.get("v0.1.0");
			final String resourceName = (String) version.get("resourceName");
			final String api = (String) version.get("get");
			service.submit(new FlipkartProductFeeder(api, resourceName, credential));
			
		}
		service.shutdown();
	    final boolean done = service.awaitTermination(1, TimeUnit.MINUTES);
	    System.out.println(done);
		
	}

	public void fetchProducts() {
		
	}
}
