package com.feyyazbegen.cardservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "card", schema = "e-ticaret")
public class Card {

    @Id
    @Column(name = "card_id")
    private Long id;

    @Column(name = "product_ıd")
    private Long productId;

    @Column(name = "Stock_id")
    private Long stockId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private BigDecimal productPrice;

    @Column(name = "product_model")
    private String productModel;

    @Column(name = "product_brand")
    private String productBrand;

}
