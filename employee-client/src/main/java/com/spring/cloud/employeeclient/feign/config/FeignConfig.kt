package com.spring.cloud.employeeclient.feign.config

import feign.codec.Encoder
import feign.form.spring.SpringFormEncoder
import org.springframework.beans.factory.ObjectFactory
import org.springframework.boot.autoconfigure.http.HttpMessageConverters
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.cloud.openfeign.support.SpringEncoder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableFeignClients
open class FeignConfig {

    @Bean
    open fun clientFeignEncoder(messageConverters: ObjectFactory<HttpMessageConverters?>?): Encoder? {
        return SpringFormEncoder(SpringEncoder(messageConverters))
    }
}