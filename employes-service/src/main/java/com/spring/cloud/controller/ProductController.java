package com.spring.cloud.controller;

import com.spring.cloud.model.DataStore;
import com.spring.cloud.model.Product;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/all")
    public List listProducts() {
        return DataStore.listProducts();
    }

    @GetMapping("/{id}")
    private Product getProductById(@PathVariable int id) {
        return DataStore.listProducts()
                .stream()
                .filter(prd -> prd.getId() == id)
                .findFirst()
                .get();
    }

    @PostMapping
    private Product getProductById(@RequestBody Product product) {
        product.setId(RandomUtils.nextInt());
        return product;
    }

    @GetMapping("/customer/{custId}")
    public List listProductsByCustomerId(@PathVariable String custId) {
        return DataStore.listProducts()
                .stream()
                .filter(product -> product.getCustomerId().equalsIgnoreCase(custId))
                .collect(Collectors.toList());
    }
}

