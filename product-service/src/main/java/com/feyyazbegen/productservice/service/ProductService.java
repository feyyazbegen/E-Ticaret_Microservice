package com.feyyazbegen.productservice.service;

import com.feyyazbegen.productservice.request.CreateProductRequest;
import com.feyyazbegen.productservice.response.CategoryResponse;
import com.feyyazbegen.productservice.response.ProductResponse;

import java.util.List;

public interface ProductService {

    ProductResponse addProduct(CreateProductRequest request);

    ProductResponse getProduct(Long productId);

    List<ProductResponse> getProductByCategoryId(Long categoryId);
}
