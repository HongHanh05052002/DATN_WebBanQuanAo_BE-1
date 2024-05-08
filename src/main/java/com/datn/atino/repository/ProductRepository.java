package com.datn.atino.repository;

import com.datn.atino.domain.ProductEntity;
import com.datn.atino.repository.custom.ProductRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>, ProductRepositoryCustom {

}
