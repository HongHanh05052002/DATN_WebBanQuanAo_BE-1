package com.datn.atino.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCollectionEntity is a Querydsl query type for CollectionEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCollectionEntity extends EntityPathBase<CollectionEntity> {

    private static final long serialVersionUID = 956136874L;

    public static final QCollectionEntity collectionEntity = new QCollectionEntity("collectionEntity");

    public final QAbstractAuditingEntity _super = new QAbstractAuditingEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final BooleanPath isActive = createBoolean("isActive");

    public final StringPath name = createString("name");

    //inherited
    public final DateTimePath<java.time.Instant> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QCollectionEntity(String variable) {
        super(CollectionEntity.class, forVariable(variable));
    }

    public QCollectionEntity(Path<? extends CollectionEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCollectionEntity(PathMetadata metadata) {
        super(CollectionEntity.class, metadata);
    }

}

