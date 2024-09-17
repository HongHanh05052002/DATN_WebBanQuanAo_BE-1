package com.datn.atino.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QColorEntity is a Querydsl query type for ColorEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QColorEntity extends EntityPathBase<ColorEntity> {

    private static final long serialVersionUID = -1678857731L;

    public static final QColorEntity colorEntity = new QColorEntity("colorEntity");

    public final QAbstractAuditingEntity _super = new QAbstractAuditingEntity(this);

    public final StringPath color = createString("color");

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final BooleanPath isActive = createBoolean("isActive");

    //inherited
    public final DateTimePath<java.time.Instant> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QColorEntity(String variable) {
        super(ColorEntity.class, forVariable(variable));
    }

    public QColorEntity(Path<? extends ColorEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QColorEntity(PathMetadata metadata) {
        super(ColorEntity.class, metadata);
    }

}

