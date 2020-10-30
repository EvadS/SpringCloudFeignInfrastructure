package com.spring.cloud.employeeclient.controller;


import com.spring.cloud.employeeclient.feign.client.RemoteCallService;
import com.spring.cloud.employeeclient.model.Product;
import feign.Feign;
import feign.Logger;
import feign.Target;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log
@RequestMapping("/customers")
@RestController
public class ProductController {

    @Autowired
    private RemoteCallService productClient;

    @GetMapping("/all")
    public List<Product> getCustomerById(){
        List products = productClient.getData();

        return products;
    }

    @GetMapping("/read")
    String read() {
        RemoteCallService client =  Feign.builder()
                .contract(new SpringMvcContract())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(new Logger.ErrorLogger())
                .logLevel(Logger.Level.FULL)
                .target(Target.EmptyTarget.create(RemoteCallService.class));

        List<Product> users = client.getData();

        return String.format("Retrieved %d users total", users.size());
    }


    @GetMapping("/{id}")
    public Product getCustomerById(@PathVariable int id){
        log.info("Get product by id: " + id);
        Product product = productClient.getProductById(id);
        return product;
    }
}
