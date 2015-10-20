package com.fabdy.parser;

import java.io.File;
import java.io.IOException;

import com.fabdy.bean.flipkart.product.ProductDetail;
import com.fabdy.bean.flipkart.product.ProductInfoList;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class FlipkartParserTest {
	public void testParser() throws JsonParseException, JsonMappingException, IOException {
		File file = new File("C:\\Users\\hp\\Downloads\\arc-response-2015 Oct 19 17-48-31.json");
		FlipkartParser parser = new FlipkartParser();
		String obj = "{"
                     + "\"productInfoList\": ["
                     + "{"
                     + "\"productBaseInfo\": {"
                     + "\"productIdentifier\": {"
                     + "\"productId\": \"TDHD8YQH2U5PUG6Z\","
                     + "\"categoryPaths\": {"
                     + "\"categoryPath\": ["
                     + "["
                     + "{"
                     + "\"title\": \"Lifestyle>Leather & Travel Accessories>Wallets & Clutches>Travel Document Holders & Card Holders>Travel Document Holders\""
                     + "}"
                     + "]"
                     + "]"
                     + "}"
                	 + "},"
                	 + "\"productAttributes\": {"
                	 + "\"title\": \"American Tourister Slim Fold Wallet\","
                	 + "\"productDescription\": \"You have never come across the perfect wallet for yourself. Finally you find the American Tourister Slim Fold Wallet – For Unisex. This wallet is durable and sure to show resilience to common damages like tearing and ripping. As this wallet is slim fold it is sure to slip into your back pocket without much hassle. In the compartments of this wallet you can keep your cash and other essentials for the day. The bi-fold design of this unisex wallet makes it compact and easy for you to reach your belongings. For your change and miscellaneous items, this American Tourister Wallet has been equipped with multiple card slots. This wallet along with being sleek is also functional and easy to use. Your change and other miscellaneous items can be stacked in the pockets of this wallet. Wallets are a must-have accessory for both men and women. A safe place to stack all your monetary essentials in, is what this accessory is all about. Keep your cash and other accessories comfortably stacked inside this American Tourister Slim Fold Wallet – Unisex. You can carry this wallet on daily basis or when you are travelling. Pair this wallet with both casual and formal wear.\","
                	 + "\"imageUrls\": {"
                	 + "\"400x400\": \"http://img5a.flixcart.com/image/wallet-card-wallet/g/p/u/16x-0-09-004-american-tourister-wallet-slim-fold-wallet-400x400-imad92ejsne8uz5j.jpeg\","
                     + "\"275x275\": \"http://img6a.flixcart.com/image/wallet-card-wallet/g/p/u/16x-0-09-004-american-tourister-wallet-slim-fold-wallet-275x275-imad92ejsne8uz5j.jpeg\","
                     + "\"75x75\": \"http://img5a.flixcart.com/image/wallet-card-wallet/g/p/u/16x-0-09-004-american-tourister-wallet-slim-fold-wallet-75x75-imad92ejsne8uz5j.jpeg\","
                     + "\"125x125\": \"http://img6a.flixcart.com/image/wallet-card-wallet/g/p/u/16x-0-09-004-american-tourister-wallet-slim-fold-wallet-125x125-imad92ejsne8uz5j.jpeg\","
                     + "\"40x40\": \"http://img5a.flixcart.com/image/wallet-card-wallet/g/p/u/16x-0-09-004-american-tourister-wallet-slim-fold-wallet-40x40-imad92ejsne8uz5j.jpeg\","
                     + "\"100x100\": \"http://img6a.flixcart.com/image/wallet-card-wallet/g/p/u/16x-0-09-004-american-tourister-wallet-slim-fold-wallet-100x100-imad92ejsne8uz5j.jpeg\","
                     + "\"1100x1360\": \"http://img6a.flixcart.com/image/wallet-card-wallet/g/p/u/16x-0-09-004-american-tourister-wallet-slim-fold-wallet-1100x1360-imad92ejsne8uz5j.jpeg\","
                     + "\"200x200\": \"http://img6a.flixcart.com/image/wallet-card-wallet/g/p/u/16x-0-09-004-american-tourister-wallet-slim-fold-wallet-200x200-imad92ejsne8uz5j.jpeg\","
                     + "\"unknown\": \"http://img5a.flixcart.com/image/wallet-card-wallet/g/p/u/16x-0-09-004-american-tourister-wallet-slim-fold-wallet-original-imad92ejsne8uz5j.jpeg\","
                     + "\"180x240\": \"http://img5a.flixcart.com/image/wallet-card-wallet/g/p/u/16x-0-09-004-american-tourister-wallet-slim-fold-wallet-180x240-imad92ejsne8uz5j.jpeg\","
                     + "\"275x340\": \"http://img5a.flixcart.com/image/wallet-card-wallet/g/p/u/16x-0-09-004-american-tourister-wallet-slim-fold-wallet-275x340-imad92ejsne8uz5j.jpeg\""
                     + "},"
                     + "\"maximumRetailPrice\": {"
                     + "\"amount\": 490,"
                     + "\"currency\": \"INR\""
                     + "},"
                     + "\"sellingPrice\": {"
                     + "\"amount\": 333,"
                     + "\"currency\": \"INR\""
                     + "},"
                     + "\"productUrl\": \"http://dl.flipkart.com/dl/american-tourister-slim-fold-wallet/p/itmd9264wskpdg6q?pid=TDHD8YQH2U5PUG6Z&affid=pshussain\","
                     + "\"productBrand\": \"American Tourister\","
                     + "\"inStock\": false,"
                     + "\"codAvailable\": true,"
                     + "\"emiAvailable\": null,"
                     + "\"discountPercentage\": 32,"
                     + "\"cashBack\": null,"
                     + "\"offers\": [],"
                     + "\"size\": null,"
                     + "\"color\": \"\","
                     + "\"sizeUnit\": \"\","
                     + "\"sizeVariants\": \"[]\","
                     + "\"colorVariants\": null,"
                     + "\"styleCode\": \"16X (0) 09 004\""
                	 + "}"
            		 + "},"
            		 + "\"productShippingBaseInfo\": {"
                + "\"shippingOptions\": null"
            + "},"
            + "\"offset\": null"
         + "}"
    + "]"
+ "}";
		
	ProductInfoList productInfoList = parser.parse(file);
	System.out.println(productInfoList.getProductInfoList().size());
	for(ProductDetail productDetail : productInfoList.getProductInfoList()) {
		System.out.println(productDetail.getProductBaseInfo().getProductAttribute().getProductBrand());
	}
	System.out.println(productInfoList.getProductInfoList().get(0).getProductBaseInfo().getProductAttribute().getProductBrand());
}}
