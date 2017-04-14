package com.warehouse.sellercube.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Chenjing on 2017/4/14.
 */
@Configuration
public class RestTemplateConfig {
    @Value("${rest.connection.connection-request-timeout}")
    private Integer reqTimeout;
    @Value("${rest.connection.connect-timeout}")
    private Integer connTimeout;
    @Value("${rest.connection.read-timeout}")
    private Integer readTimeout;

    @Bean
    public HttpComponentsClientHttpRequestFactory customHttpRequestFactory() {
        HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory=new HttpComponentsClientHttpRequestFactory();
        httpComponentsClientHttpRequestFactory.setReadTimeout(readTimeout);
        httpComponentsClientHttpRequestFactory.setConnectionRequestTimeout(reqTimeout);
        httpComponentsClientHttpRequestFactory.setConnectTimeout(connTimeout);
        return httpComponentsClientHttpRequestFactory;
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate(this.customHttpRequestFactory());
    }
}
