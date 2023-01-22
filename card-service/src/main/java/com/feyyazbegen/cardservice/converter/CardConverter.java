package com.feyyazbegen.cardservice.converter;

import com.feyyazbegen.cardservice.request.CardCreateRequest;
import com.feyyazbegen.cardservice.response.CardResponse;
import org.springframework.stereotype.Component;

@Component
public class CardConverter {


    public CardResponse convertToCardResponse(CardCreateRequest request){
        CardResponse cardResponse = new CardResponse();
        cardResponse.setId(request.getId());
        return cardResponse;
    }
}
