package com.datn.atino.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBillEntity is a Querydsl query type for BillEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBillEntity extends EntityPathBase<BillEntity> {

    private static final long serialVersionUID = -545809645L;

    public static final QBillEntity billEntity = new QBillEntity("billEntity");

    public final StringPath address = createString("address");

    public final StringPath billCode = createString("billCode");

    public final StringPath billNote = createString("billNote");

    public final DateTimePath<java.time.Instant> createdAt = createDateTime("createdAt", java.time.Instant.class);

    public final StringPath createdBy = createString("createdBy");

    public final StringPath email = createString("email");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> paymentMethod = createNumber("paymentMethod", Integer.class);

    public final StringPath phoneNumber = createString("phoneNumber");

    public final StringPath reciver = createString("reciver");

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final NumberPath<java.math.BigDecimal> totalPrice = createNumber("totalPrice", java.math.BigDecimal.class);

    public final DateTimePath<java.time.Instant> updatedAt = createDateTime("updatedAt", java.time.Instant.class);

    public final StringPath updatedBy = createString("updatedBy");

    public QBillEntity(String variable) {
        super(BillEntity.class, forVariable(variable));
    }

    public QBillEntity(Path<? extends BillEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBillEntity(PathMetadata metadata) {
        super(BillEntity.class, metadata);
    }

}

