package com.bb.standard.config.http.restTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author yanyuchi
 * @date 2019-10-06 20:00
 */
@Configuration
public class RestTemplateConfig {

    @Autowired
    @Qualifier("OKSpringCommonsRestTemplate")
    ClientHttpRequestFactory okHttpRequestFactory;

    @Bean
    @Qualifier("OKSpringCommonsRestTemplate")
    public RestTemplate createOKCustomRestTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(okHttpRequestFactory);
        return restTemplate;
    }

}
