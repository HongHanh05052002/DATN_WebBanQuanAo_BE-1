package com.datn.atino.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSizeEntity is a Querydsl query type for SizeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSizeEntity extends EntityPathBase<SizeEntity> {

    private static final long serialVersionUID = 1415377805L;

    public static final QSizeEntity sizeEntity = new QSizeEntity("sizeEntity");

    public final QAbstractAuditingEntity _super = new QAbstractAuditingEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final BooleanPath isActive = createBoolean("isActive");

    public final StringPath sizeName = createString("sizeName");

    //inherited
    public final DateTimePath<java.time.Instant> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QSizeEntity(String variable) {
        super(SizeEntity.class, forVariable(variable));
    }

    public QSizeEntity(Path<? extends SizeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSizeEntity(PathMetadata metadata) {
        super(SizeEntity.class, metadata);
    }

}

