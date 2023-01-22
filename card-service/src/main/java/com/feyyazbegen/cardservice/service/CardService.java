package com.feyyazbegen.cardservice.service;


import com.feyyazbegen.cardservice.request.CardCreateRequest;
import com.feyyazbegen.cardservice.response.CardResponse;

public interface CardService {
    CardResponse addProductToCard(CardCreateRequest request);
}
