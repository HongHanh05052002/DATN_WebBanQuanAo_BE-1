package com.datn.atino.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBillProductEntity is a Querydsl query type for BillProductEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBillProductEntity extends EntityPathBase<BillProductEntity> {

    private static final long serialVersionUID = -196362110L;

    public static final QBillProductEntity billProductEntity = new QBillProductEntity("billProductEntity");

    public final NumberPath<Integer> billId = createNumber("billId", Integer.class);

    public final StringPath color = createString("color");

    public final DatePath<java.time.LocalDate> createdAt = createDate("createdAt", java.time.LocalDate.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<java.math.BigDecimal> price = createNumber("price", java.math.BigDecimal.class);

    public final NumberPath<Integer> productId = createNumber("productId", Integer.class);

    public final NumberPath<Integer> quantity = createNumber("quantity", Integer.class);

    public final NumberPath<Integer> sales = createNumber("sales", Integer.class);

    public final StringPath size = createString("size");

    public QBillProductEntity(String variable) {
        super(BillProductEntity.class, forVariable(variable));
    }

    public QBillProductEntity(Path<? extends BillProductEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBillProductEntity(PathMetadata metadata) {
        super(BillProductEntity.class, metadata);
    }

}

