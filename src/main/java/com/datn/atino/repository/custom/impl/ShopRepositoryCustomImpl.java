package com.datn.atino.repository.custom.impl;

import com.datn.atino.domain.QShopEntity;
import com.datn.atino.domain.ShopEntity;
import com.datn.atino.repository.custom.ShopRepositoryCustom;
import com.datn.atino.service.model.PageFilterInput;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class ShopRepositoryCustomImpl implements ShopRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Page<ShopEntity> getAll(PageFilterInput<ShopEntity> input, Pageable pageable) {
        ShopEntity filter = input.getFilter();
        QShopEntity qShopEntity = QShopEntity.shopEntity;

        JPAQuery<ShopEntity> query = new JPAQueryFactory(entityManager)
                .selectFrom(qShopEntity);

        return null;
    }
}
