package com.feyyazbegen.cardservice.proxy;

import com.feyyazbegen.cardservice.response.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "product-service")
public interface ProductServiceProxy {

    @GetMapping("/product/{productId}")
    ProductResponse getProduct(@PathVariable Long productId);
}
