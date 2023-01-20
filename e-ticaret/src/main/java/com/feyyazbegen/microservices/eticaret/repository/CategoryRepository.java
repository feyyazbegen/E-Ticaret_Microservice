package com.feyyazbegen.microservices.eticaret.repository;


import com.feyyazbegen.microservices.eticaret.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Categories,Long> {
}
