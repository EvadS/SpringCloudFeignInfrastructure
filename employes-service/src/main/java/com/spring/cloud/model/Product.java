package com.spring.cloud.model;


import lombok.Data;

@Data
public class Product {

    private int id;
    private String name;
    private String price;
    private String customerId;
}