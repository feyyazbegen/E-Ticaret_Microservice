package com.feyyazbegen.microservices.eticaret.converter;

import com.feyyazbegen.microservices.eticaret.entities.Categories;
import com.feyyazbegen.microservices.eticaret.response.CategoryResponse;
import org.springframework.stereotype.Component;

@Component
public class CategoryConverter {

    public CategoryResponse convertToCategoryResponse(Categories categories){
        CategoryResponse categoryResponse = new CategoryResponse();
        categoryResponse.setCategoryId(categories.getId());
        categoryResponse.setCategoryName(categories.getCategoryName());
        return categoryResponse;
    }
}
