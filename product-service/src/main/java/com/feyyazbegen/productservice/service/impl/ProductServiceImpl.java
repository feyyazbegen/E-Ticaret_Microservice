package com.feyyazbegen.productservice.service.impl;

import com.feyyazbegen.productservice.converter.ProductConverter;
import com.feyyazbegen.productservice.entity.Product;
import com.feyyazbegen.productservice.proxy.CategoryServiceProxy;
import com.feyyazbegen.productservice.repository.ProductRepository;
import com.feyyazbegen.productservice.request.CreateProductRequest;
import com.feyyazbegen.productservice.response.CategoryResponse;
import com.feyyazbegen.productservice.response.ProductResponse;
import com.feyyazbegen.productservice.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryServiceProxy categoryServiceProxy;
    private final ProductConverter productConverter;

    public ProductServiceImpl(ProductRepository productRepository, CategoryServiceProxy categoryServiceProxy, ProductConverter productConverter) {
        this.productRepository = productRepository;
        this.categoryServiceProxy = categoryServiceProxy;
        this.productConverter = productConverter;
    }

    @Override
    public ProductResponse addProduct(CreateProductRequest request) {
        Long categoryId = request.getCategoryId();
        CategoryResponse byCategoryId = categoryServiceProxy.getByCategoryId(categoryId);
        if (byCategoryId == null){
            throw new RuntimeException("İlgili Kategori Bulunamadı");
        }
        Product product = productConverter.convertToProduct(request);
        productRepository.save(product);
        return productConverter.convertToProductResponse(product, byCategoryId);
    }

    @Override
    public ProductResponse getProduct(Long productId) {
        Optional<Product> byId = productRepository.findById(productId);
        if (!byId.isPresent()){
            throw new RuntimeException("Post Bulunamadı");
        }
        return productConverter.convertToProductResponse(byId.get());
    }
}
