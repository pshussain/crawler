package com.fabdy.marketplace.flipkart;

import java.util.Map;
import java.util.logging.Logger;

import com.fabdy.bean.flipkart.product.ProductDetail;
import com.fabdy.bean.flipkart.product.ProductInfoList;
import com.fabdy.http.HttpHandler;
import com.fabdy.parser.FlipkartParser;

public class FlipkartProductFeeder implements Runnable {
	private String api;
	private Map<String, String> credential;
	private String category;
	private Logger LOG = Logger.getLogger("ProductFeeder");
	FlipkartParser parser;
	public FlipkartProductFeeder(String api, String category, Map<String, String> credential) {
		this.api = api;
		this.category = category;
		this.credential = credential;
		this.parser = new FlipkartParser();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String apiRes = null;
		try {
			apiRes = HttpHandler.doGet(api, credential);
			if (apiRes != null) {
				final ProductInfoList product = parser.parse(apiRes);
				for(ProductDetail detail : product.getProductInfoList()) {
//					System.out.println(detail.getProductBaseInfo().getProductAttribute().getTitle() +  " : " + detail.getProductBaseInfo().getProductIdentifier().getProductId() + " : "+ detail.getProductBaseInfo().getProductAttribute().getSellingPrice().getAmout());
				}
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOG.info("Error in Parsing the result : " + e.toString() + " and the result is : " + apiRes);
			
			
		}
	}

}
