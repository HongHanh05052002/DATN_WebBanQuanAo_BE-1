package com.datn.atino.repository;

import com.datn.atino.domain.BillProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductBillRepository extends JpaRepository<BillProductEntity, Integer> {

    List<BillProductEntity> findByBillId(Integer billId);

}
