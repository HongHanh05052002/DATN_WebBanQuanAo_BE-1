package com.datn.atino.repository.custom.impl;

import com.datn.atino.domain.CategoryEntity;
import com.datn.atino.domain.QCategoryEntity;
import com.datn.atino.repository.custom.CategoryCustomRepository;
import com.datn.atino.service.model.PageFilterInput;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public class CategoryCustomRepositoryImpl implements CategoryCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Page<CategoryEntity> getAll(PageFilterInput<CategoryEntity> input, Pageable pageable) {
        QCategoryEntity qCategoryEntity = QCategoryEntity.categoryEntity;
        JPAQuery<CategoryEntity> query = new JPAQueryFactory(entityManager)
                .selectFrom(qCategoryEntity);

        BooleanBuilder booleanBuilder = new BooleanBuilder();
        booleanBuilder.and(qCategoryEntity.isActive.isTrue());

        CategoryEntity filter = input.getFilter();

        if(StringUtils.hasText(input.getCommon())){
            booleanBuilder.and(
                    qCategoryEntity.categoryName.containsIgnoreCase(input.getCommon())
            );
        }

        if(StringUtils.hasText(filter.getCategoryName())){
            booleanBuilder.and(qCategoryEntity.categoryName.containsIgnoreCase(filter.getCategoryName()));
        }

        query.where(booleanBuilder);
        return new PageImpl<>(query.fetch(), pageable, query.fetchCount());
    }
}
