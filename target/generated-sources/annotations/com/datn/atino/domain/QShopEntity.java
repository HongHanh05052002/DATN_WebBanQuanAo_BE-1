package com.datn.atino.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QShopEntity is a Querydsl query type for ShopEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QShopEntity extends EntityPathBase<ShopEntity> {

    private static final long serialVersionUID = -1890573630L;

    public static final QShopEntity shopEntity = new QShopEntity("shopEntity");

    public final QAbstractAuditingEntity _super = new QAbstractAuditingEntity(this);

    public final StringPath address = createString("address");

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final BooleanPath isActive = createBoolean("isActive");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final StringPath shopName = createString("shopName");

    //inherited
    public final DateTimePath<java.time.Instant> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QShopEntity(String variable) {
        super(ShopEntity.class, forVariable(variable));
    }

    public QShopEntity(Path<? extends ShopEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QShopEntity(PathMetadata metadata) {
        super(ShopEntity.class, metadata);
    }

}

