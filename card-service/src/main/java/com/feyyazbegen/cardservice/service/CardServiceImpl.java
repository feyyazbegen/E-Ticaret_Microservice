package com.feyyazbegen.cardservice.service;

import com.feyyazbegen.cardservice.converter.CardConverter;
import com.feyyazbegen.cardservice.proxy.ProductServiceProxy;
import com.feyyazbegen.cardservice.request.CardCreateRequest;
import com.feyyazbegen.cardservice.response.CardResponse;
import com.feyyazbegen.cardservice.response.ProductResponse;
import com.feyyazbegen.cardservice.respository.CardRepository;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService{

   private final CardRepository cardRepository;
   private final ProductServiceProxy proxy;
   private final CardConverter converter;

    public CardServiceImpl(CardRepository cardRepository, ProductServiceProxy proxy, CardConverter converter) {
        this.cardRepository = cardRepository;
        this.proxy = proxy;
        this.converter = converter;
    }

    @Override
    public CardResponse addProductToCard(CardCreateRequest request) {
        Long productId = request.getProductId();
        ProductResponse product = proxy.getProduct(productId);
        if (product == null){
            throw new RuntimeException("/İlgili Ürün bulunamadı");
        }
        return converter.convertToCardResponse(request);
    }
}
