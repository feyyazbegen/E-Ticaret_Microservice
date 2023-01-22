package com.feyyazbegen.productservice.response;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class ProductResponse {

    private Long id;
    private String productName;
    private String model;
    private String brand;
    private BigDecimal price;
    private CategoryResponse category;
}
