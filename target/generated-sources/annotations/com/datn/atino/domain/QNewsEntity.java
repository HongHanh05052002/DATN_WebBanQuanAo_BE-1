package com.datn.atino.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNewsEntity is a Querydsl query type for NewsEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNewsEntity extends EntityPathBase<NewsEntity> {

    private static final long serialVersionUID = -355485473L;

    public static final QNewsEntity newsEntity = new QNewsEntity("newsEntity");

    public final QAbstractAuditingEntity _super = new QAbstractAuditingEntity(this);

    public final StringPath author = createString("author");

    public final StringPath avatar = createString("avatar");

    public final StringPath briefDescription = createString("briefDescription");

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final BooleanPath isActive = createBoolean("isActive");

    public final BooleanPath isVisible = createBoolean("isVisible");

    public final StringPath title = createString("title");

    //inherited
    public final DateTimePath<java.time.Instant> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QNewsEntity(String variable) {
        super(NewsEntity.class, forVariable(variable));
    }

    public QNewsEntity(Path<? extends NewsEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNewsEntity(PathMetadata metadata) {
        super(NewsEntity.class, metadata);
    }

}

