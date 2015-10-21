package com.fabdy.common;

import java.util.HashMap;
import java.util.Map;

public interface AffiliateCredential {
	Map<String, String> CREDENTIAL = new HashMap<String, String>() {
		{
			put("Fk-Affiliate-Id", "pshussain");
			put("Fk-Affiliate-Token", "e1b707b89b2647cf9ffb2d99c85f454a");
		}
	};
	public String AFF_PROP = "affiliate.";
	public String AFF_ID = AFF_PROP + "affiliate_id";
	public String AFF_TOKEN = AFF_PROP + "token";
	public String AFF_API_URL = AFF_PROP + "api_url";
	public String DB_USERNAME = AFF_PROP + "username";
	public String DB_PASSWORD = AFF_PROP + "password";
	public String DB_DATABASE = AFF_PROP + "database";
	public String DB_URL = AFF_PROP + "url";

}
