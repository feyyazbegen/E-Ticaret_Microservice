package com.feyyazbegen.microservices.eticaret.controller;

import com.feyyazbegen.microservices.eticaret.converter.CategoryConverter;
import com.feyyazbegen.microservices.eticaret.request.CategoryRequest;
import com.feyyazbegen.microservices.eticaret.response.CategoryResponse;
import com.feyyazbegen.microservices.eticaret.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    private final CategoryService categoryService;
    private final CategoryConverter categoryConverter;

    public CategoryController(CategoryService categoryService, CategoryConverter categoryConverter) {
        this.categoryService = categoryService;
        this.categoryConverter = categoryConverter;
    }

    @GetMapping("/{categoryId}")
    public CategoryResponse getByCategoryId(@PathVariable Long categoryId) {
        return categoryService.getByCategoryId(categoryId);
    }

    @GetMapping("/")
    public List<CategoryResponse> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping("/")
    public CategoryResponse addCategory(@RequestBody CategoryRequest request){
        return categoryService.addCategory(request);
    }

}
