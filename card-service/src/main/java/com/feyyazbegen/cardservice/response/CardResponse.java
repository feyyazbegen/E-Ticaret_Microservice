package com.feyyazbegen.cardservice.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CardResponse {

    private Long id;

    private Long productId;

    private Long stockId;

    private String productName;

    private BigDecimal productPrice;

    private String productModel;

    private String productBrand;

}
