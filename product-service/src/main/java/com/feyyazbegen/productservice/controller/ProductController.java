package com.feyyazbegen.productservice.controller;

import com.feyyazbegen.productservice.request.CreateProductRequest;
import com.feyyazbegen.productservice.response.CategoryResponse;
import com.feyyazbegen.productservice.response.ProductResponse;
import com.feyyazbegen.productservice.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/")
    public ProductResponse addProduct(@RequestBody CreateProductRequest request){
        return productService.addProduct(request);
    }

    @GetMapping("/{productId}")
    public ProductResponse getProduct(@PathVariable Long productId){
        return productService.getProduct(productId);
    }

    @GetMapping("/category/{categoryId}")
    public List<ProductResponse> getProductByCategoryId(@PathVariable Long categoryId){
        return productService.getProductByCategoryId(categoryId);
    }

}
