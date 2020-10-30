package com.spring.cloud.employeeclient.feign.client;

import com.spring.cloud.employeeclient.feign.config.CustomFeignConfig;

import com.spring.cloud.employeeclient.model.Product;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="product-service"
       ,configuration = CustomFeignConfig.class
         )
public interface RemoteCallService {
    @RequestMapping(method=RequestMethod.GET, value="/products/all")
    List<Product> getData();

  //  @GetMapping("/products/{id}")


    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET, produces = "application/json",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    Product getProductById(@PathVariable int id);


//    @RequestMapping(method = RequestMethod.POST, value = "/stores/{storeId}", consumes = "application/json")
 //   @Headers("Content-Type: application/json")
//    Store update(@PathVariable("storeId") Long storeId, Store store);

}
