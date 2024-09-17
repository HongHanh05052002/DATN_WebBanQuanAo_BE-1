package com.datn.atino.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductImportEntity is a Querydsl query type for ProductImportEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductImportEntity extends EntityPathBase<ProductImportEntity> {

    private static final long serialVersionUID = -1022058418L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductImportEntity productImportEntity = new QProductImportEntity("productImportEntity");

    public final QAbstractAuditingEntity _super = new QAbstractAuditingEntity(this);

    public final StringPath color = createString("color");

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final BooleanPath isActive = createBoolean("isActive");

    public final NumberPath<java.math.BigDecimal> priceImport = createNumber("priceImport", java.math.BigDecimal.class);

    public final QProductEntity productEntity;

    public final NumberPath<Integer> quantityImport = createNumber("quantityImport", Integer.class);

    public final StringPath size = createString("size");

    //inherited
    public final DateTimePath<java.time.Instant> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QProductImportEntity(String variable) {
        this(ProductImportEntity.class, forVariable(variable), INITS);
    }

    public QProductImportEntity(Path<? extends ProductImportEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductImportEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductImportEntity(PathMetadata metadata, PathInits inits) {
        this(ProductImportEntity.class, metadata, inits);
    }

    public QProductImportEntity(Class<? extends ProductImportEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productEntity = inits.isInitialized("productEntity") ? new QProductEntity(forProperty("productEntity"), inits.get("productEntity")) : null;
    }

}

