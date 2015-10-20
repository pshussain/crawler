package com.fabdy.affiliate;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import com.fabdy.bean.flipkart.category.Api;
import com.fabdy.common.AffiliateCredential;
import com.fabdy.http.HttpHandler;
import com.fabdy.marketplace.FlipkartAffiliateService;
import com.fabdy.parser.FlipkartParser;

public class AffiliateService {
	
	final ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
	private final String affiliateApiUrl;
	private final String affiliateId;
	private final String affiliateToken;
	public static void main(String[] args) throws Exception {
		final String propFile = args[0];
		if(propFile == null) {
			System.exit(0);
		}
		AffiliateService service = new AffiliateService(propFile);
		service.start();
		
	}
	
	public AffiliateService(String confPath) throws ConfigurationException {
		final Configuration config = new PropertiesConfiguration(confPath);
		this.affiliateApiUrl = config.getString(AffiliateCredential.AFF_API_URL);
		this.affiliateId = config.getString(AffiliateCredential.AFF_ID);
		this.affiliateToken = config.getString(AffiliateCredential.AFF_TOKEN);
	}
	
	public void start() throws Exception {
		FlipkartAffiliateService service = new FlipkartAffiliateService(affiliateApiUrl, affiliateId, affiliateToken);
		service.fetchCategory();
	}
	
	
	
}
