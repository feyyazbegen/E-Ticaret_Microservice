package com.feyyazbegen.cardservice.request;

import lombok.Data;

@Data
public class CardCreateRequest {

    private Long id;

    private Long productId;

    private Long stockId;

}
