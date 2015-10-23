package com.fabdy.affiliate;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;

import com.fabdy.marketplace.flipkart.FlipkartAffiliateService;

public class AffiliateService {
	
	final ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
	FlipkartAffiliateService flipkartService;
	public static void main(String[] args) throws Exception {
		final String propFile = args[0];
		if(propFile == null) {
			System.exit(0);
		}
		AffiliateService service = new AffiliateService(propFile);
		service.start();
	}
	
	public AffiliateService(String confPath) throws Exception {
		final Configuration config = new PropertiesConfiguration(confPath);	
		flipkartService = new FlipkartAffiliateService(config);
	}
	
	public void start() throws Exception {
		flipkartService.fetchCategory();
	}
	
	
	
}
