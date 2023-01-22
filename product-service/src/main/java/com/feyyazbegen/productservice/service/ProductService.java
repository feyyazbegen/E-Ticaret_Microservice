package com.feyyazbegen.productservice.service;

import com.feyyazbegen.productservice.request.CreateProductRequest;
import com.feyyazbegen.productservice.response.ProductResponse;

public interface ProductService {

    ProductResponse addProduct(CreateProductRequest request);

    ProductResponse getProduct(Long productId);
}
