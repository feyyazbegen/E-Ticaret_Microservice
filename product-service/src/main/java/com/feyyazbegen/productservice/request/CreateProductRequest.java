package com.feyyazbegen.productservice.request;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class CreateProductRequest {

    private Long categoryId;
    private String productName;
    private String model;
    private String brand;
    private BigDecimal price;

}
