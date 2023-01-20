package com.feyyazbegen.microservices.eticaret.controller;

import com.feyyazbegen.microservices.eticaret.response.CategoryResponse;
import com.feyyazbegen.microservices.eticaret.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/{categoryId}")
    public CategoryResponse getByCategoryId(@PathVariable Long categoryId) {
        return categoryService.getByCategoryId(categoryId);
    }
}
