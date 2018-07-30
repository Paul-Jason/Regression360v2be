package com.paul.regression360v2.configuration;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;

import java.util.function.Supplier;

import javax.net.ssl.SSLContext;


public class RestClientCertTestConfiguration {

	private char[] allPassword = "changeit".toCharArray();

    public RestTemplate restTemplate(RestTemplateBuilder builder) throws Exception {

        SSLContext sslContext = SSLContextBuilder
                .create()
                .loadKeyMaterial(ResourceUtils.getFile("C:/Windows/System32/clientkeystore.jks"), allPassword, allPassword)
                .loadTrustMaterial(ResourceUtils.getFile("C:/Windows/System32/clienttruststore.jks"), allPassword)
                .build();

        HttpClient client = HttpClients.custom()
                .setSSLContext(sslContext)
                .build();

        return builder
                .requestFactory((Supplier<ClientHttpRequestFactory>) new HttpComponentsClientHttpRequestFactory(client))
                .build();
    }
}

