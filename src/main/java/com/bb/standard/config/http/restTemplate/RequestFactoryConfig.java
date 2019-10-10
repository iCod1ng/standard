package com.bb.standard.config.http.restTemplate;

import com.bb.standard.config.http.impl.OkHttpClientFactoryImpl;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.commons.httpclient.OkHttpClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;

/**
 * @author yanyuchi
 * @date 2019-10-06 20:14
 */
@Configuration
public class RequestFactoryConfig {
    @Bean
    @Qualifier("OKSpringCommonsRestTemplate")
    public ClientHttpRequestFactory createOKCommonsRequestFactory(){
        OkHttpClientFactoryImpl httpClientFactory = new OkHttpClientFactoryImpl();
        OkHttpClient client = httpClientFactory.createBuilder(false).build();
        return new OkHttp3ClientHttpRequestFactory(client);
    }
}
