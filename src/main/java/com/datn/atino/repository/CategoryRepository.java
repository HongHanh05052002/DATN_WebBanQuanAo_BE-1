package com.datn.atino.repository;

import com.datn.atino.domain.CategoryEntity;
import com.datn.atino.repository.custom.CategoryCustomRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer>, CategoryCustomRepository {
    CategoryEntity findByIdAndIsActiveTrue (Integer id);

    CategoryEntity findByCategoryNameAndIsActiveTrue(String categoryName);
}
