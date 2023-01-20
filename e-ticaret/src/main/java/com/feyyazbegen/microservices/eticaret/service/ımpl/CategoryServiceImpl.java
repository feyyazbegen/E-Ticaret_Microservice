package com.feyyazbegen.microservices.eticaret.service.ımpl;

import com.feyyazbegen.microservices.eticaret.converter.CategoryConverter;
import com.feyyazbegen.microservices.eticaret.entities.Categories;
import com.feyyazbegen.microservices.eticaret.repository.CategoryRepository;
import com.feyyazbegen.microservices.eticaret.request.CategoryRequest;
import com.feyyazbegen.microservices.eticaret.response.CategoryResponse;
import com.feyyazbegen.microservices.eticaret.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;
    private final CategoryConverter categoryConverter;

    public CategoryServiceImpl(CategoryRepository repository, CategoryConverter categoryConverter) {
        this.repository = repository;
        this.categoryConverter = categoryConverter;
    }

    @Override
    public CategoryResponse getByCategoryId(Long categoryId) {
        Optional<Categories> byId = repository.findById(categoryId);
        if (!byId.isPresent()) {
            throw new RuntimeException("Kategory Bulunamadı");
        }
        return categoryConverter.convertToCategoryResponse(byId.get());
    }

    @Override
    public List<CategoryResponse> getAllCategories() {
        List<Categories> categories = repository.findAll();
        return categories.stream().map(categoryConverter::convertToCategoryResponse).collect(Collectors.toList());
    }

    @Override
    public CategoryResponse addCategory(CategoryRequest request) {
        Categories categories = new Categories();
        categories.setCategoryName(request.getCategoryName());
        repository.save(categories);
        return categoryConverter.convertToCategoryResponse(categories);
    }

}
