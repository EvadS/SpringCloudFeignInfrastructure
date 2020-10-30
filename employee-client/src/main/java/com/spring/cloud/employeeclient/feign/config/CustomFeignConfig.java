package com.spring.cloud.employeeclient.feign.config;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;


public class CustomFeignConfig {

//    @Bean
//    public Contract GlobalContract() {
//        return new Contract.Default();
//    }


    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("user", "password");
    }
}