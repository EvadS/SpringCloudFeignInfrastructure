package com.spring.cloud.model;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    public static  List<Product> listProducts(){
        List<Product> products = new ArrayList<>();
        for(int i = 1; i < 6; i++){
            Product product = new Product();
            product.setId(i);
            product.setName("Product Name " + 1);
            product.setPrice("USD " + 100 + i);
            product.setCustomerId("CUST" + i);
            products.add(product);
        }
        return products;
    }
}