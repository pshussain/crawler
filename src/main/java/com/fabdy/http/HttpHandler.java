package com.fabdy.http;

import java.net.URI;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

public class HttpHandler {
	private static String execute(HttpGet get) throws Exception {
        final CloseableHttpResponse response = HttpManager.getInstance()
                .getHttpClient().execute(get);
        try {
            final HttpEntity httpEntity = response.getEntity();
            return EntityUtils.toString(httpEntity);
        } finally {
            response.close();
        }
    }
	
	/**
     * doGet method to execute the GET request
     *
     * @throws Exception
     */
    public static String doGet(String url) throws Exception {
        final HttpGet get = new HttpGet();
        get.setURI(new URI(url));
        return execute(get);

    }
    
    /**
     * doGet method to execute the GET request
     *
     * @throws Exception
     */
    public static String doGet(String url, Map<String,String> parameters) throws Exception {
        final HttpGet get = new HttpGet();
        get.setURI(new URI(url));
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
        	get.setHeader(entry.getKey(), entry.getValue());
		}

        return execute(get);

    }

}
