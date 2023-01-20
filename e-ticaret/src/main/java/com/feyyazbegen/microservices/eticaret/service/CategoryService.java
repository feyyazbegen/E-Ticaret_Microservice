package com.feyyazbegen.microservices.eticaret.service;

import com.feyyazbegen.microservices.eticaret.response.CategoryResponse;

public interface CategoryService {

     CategoryResponse getByCategoryId(Long categoryId);
}
