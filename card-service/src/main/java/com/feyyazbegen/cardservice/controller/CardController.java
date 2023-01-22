package com.feyyazbegen.cardservice.controller;

import com.feyyazbegen.cardservice.request.CardCreateRequest;
import com.feyyazbegen.cardservice.response.CardResponse;
import com.feyyazbegen.cardservice.service.CardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    public CardResponse addProductToCard(CardCreateRequest request) {
        return cardService.addProductToCard(request);
    }
}
