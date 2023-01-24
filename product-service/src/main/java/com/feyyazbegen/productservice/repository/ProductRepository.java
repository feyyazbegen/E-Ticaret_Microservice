package com.feyyazbegen.productservice.repository;

import com.feyyazbegen.productservice.entity.Product;
import com.feyyazbegen.productservice.response.ProductResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query(value = "select * from product where category_id=:categoryId ",nativeQuery = true)
    List<Product> findByProductCategoryId(Long categoryId);
}
