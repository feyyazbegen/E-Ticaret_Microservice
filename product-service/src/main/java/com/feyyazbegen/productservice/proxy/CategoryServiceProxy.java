package com.feyyazbegen.productservice.proxy;

import com.feyyazbegen.productservice.response.CategoryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "category-service")
public interface CategoryServiceProxy {
    @GetMapping("/category/{categoryId}")
    CategoryResponse getByCategoryId(@PathVariable Long categoryId);
}
