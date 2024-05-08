package com.datn.atino.repository.custom;

import com.datn.atino.domain.ShopEntity;
import com.datn.atino.service.model.PageFilterInput;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ShopRepositoryCustom {

    public Page<ShopEntity> getAll(PageFilterInput<ShopEntity> input, Pageable pageable);

}
