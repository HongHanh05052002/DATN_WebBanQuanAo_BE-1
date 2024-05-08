package com.datn.atino.repository;

import com.datn.atino.domain.ProductImportEntity;
import com.datn.atino.repository.custom.ProductImportCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImportRepository extends JpaRepository<ProductImportEntity, Integer>, ProductImportCustom {

    ProductImportEntity findByIdAndIsActiveTrue(Integer id);

}
