package com.bb.standard.config.http.impl;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.springframework.cloud.commons.httpclient.OkHttpClientFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author yanyuchi
 * @date 2019-10-06 19:50
 * OkHttpClient配置
 */
public class OkHttpClientFactoryImpl implements OkHttpClientFactory {
    @Override
    public okhttp3.OkHttpClient.Builder createBuilder(boolean disableSslValidation) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        ConnectionPool okHttpConnectionPool = new ConnectionPool(50,30,TimeUnit.SECONDS);
        builder.connectionPool(okHttpConnectionPool);
        builder.connectTimeout(20,TimeUnit.SECONDS);
        builder.retryOnConnectionFailure(false);
        return builder;
    }
}
