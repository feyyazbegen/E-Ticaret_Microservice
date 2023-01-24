package com.feyyazbegen.productservice.converter;

import com.feyyazbegen.productservice.entity.Product;
import com.feyyazbegen.productservice.request.CreateProductRequest;
import com.feyyazbegen.productservice.response.CategoryResponse;
import com.feyyazbegen.productservice.response.ProductResponse;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {

    public Product convertToProduct(CreateProductRequest request){
        Product product = new Product();
        product.setProductName(request.getProductName());
        product.setBrand(request.getBrand());
        product.setModel(request.getModel());
        product.setCategoryId(request.getCategoryId());
        product.setPrice(request.getPrice());
        return product;
    }
    public ProductResponse convertToProductResponse(Product product ,CategoryResponse categoryResponse){
        ProductResponse productResponse= new ProductResponse();
        productResponse.setProductName(product.getProductName());
        productResponse.setCategory(categoryResponse);
        productResponse.setBrand(product.getBrand());
        productResponse.setModel(product.getModel());
        return productResponse;
    }

    public ProductResponse convertToProductResponse(Product product){
        ProductResponse productResponse = new ProductResponse();
        productResponse.setId(product.getId());
        productResponse.setProductName(product.getProductName());
        productResponse.setBrand(product.getBrand());
        productResponse.setModel(product.getModel());
        productResponse.setPrice(product.getPrice());
        return productResponse;
    }

}
