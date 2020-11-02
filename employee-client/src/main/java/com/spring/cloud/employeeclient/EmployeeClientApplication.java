package com.spring.cloud.employeeclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;



@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class EmployeeClientApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
