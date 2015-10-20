package com.fabdy.http;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.SocketConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

public class HttpManager {

	PoolingHttpClientConnectionManager connMgr;
    CloseableHttpClient httpClient;
    static HttpManager manager;
    
    /**
     * Constructor to create a http pool connection manager
     *
     * @throws Exception
     */
    private HttpManager() throws Exception {
        connMgr = new PoolingHttpClientConnectionManager();
        connMgr.setMaxTotal(25);
        connMgr.setDefaultMaxPerRoute(20);
        SocketConfig defaultSocketConfig = SocketConfig.custom()
                .setTcpNoDelay(true).setSoKeepAlive(false).build();
        httpClient = HttpClients
                .custom()
                .setConnectionManager(connMgr)
                .setDefaultRequestConfig(
                        RequestConfig.custom()
                                .setConnectionRequestTimeout(300000).build())
                .build();
    }
    /**
     * To return singleton connection manager object
     *
     * @param username
     * @param password
     * @return manager
     * @throws Exception
     */
    public static HttpManager getInstance() throws Exception {
        if (manager == null)
            return new HttpManager();
        else
            return manager;
    }
    
    /**
     * To return closeable http client object to execute the requests
     *
     * @return
     */
    public CloseableHttpClient getHttpClient() {
        return httpClient;
    }


}
