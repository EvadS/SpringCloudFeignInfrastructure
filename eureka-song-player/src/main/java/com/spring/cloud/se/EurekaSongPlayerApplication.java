package com.spring.cloud.se;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaSongPlayerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSongPlayerApplication.class, args);
    }

}
