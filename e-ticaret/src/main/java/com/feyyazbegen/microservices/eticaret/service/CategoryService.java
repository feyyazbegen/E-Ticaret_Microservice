package com.feyyazbegen.microservices.eticaret.service;

import com.feyyazbegen.microservices.eticaret.entities.Categories;
import com.feyyazbegen.microservices.eticaret.request.CategoryRequest;
import com.feyyazbegen.microservices.eticaret.response.CategoryResponse;

import java.util.List;

public interface CategoryService {

     CategoryResponse getByCategoryId(Long categoryId);

     List<CategoryResponse> getAllCategories();

}
