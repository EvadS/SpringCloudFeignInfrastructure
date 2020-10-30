package com.spring.cloud.employeeclient.model;


import lombok.Data;

import java.util.Objects;

@Data
public class Product {

    private int id;
    private String name;
    private String price;
    private String customerId;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Objects.equals(name, product.name) &&
                Objects.equals(price, product.price) &&
                Objects.equals(customerId, product.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, customerId);
    }
}