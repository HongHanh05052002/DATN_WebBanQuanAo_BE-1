package com.datn.atino.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCollectionProductEntity is a Querydsl query type for CollectionProductEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCollectionProductEntity extends EntityPathBase<CollectionProductEntity> {

    private static final long serialVersionUID = -627763701L;

    public static final QCollectionProductEntity collectionProductEntity = new QCollectionProductEntity("collectionProductEntity");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> idCollection = createNumber("idCollection", Integer.class);

    public final NumberPath<Integer> idProduct = createNumber("idProduct", Integer.class);

    public QCollectionProductEntity(String variable) {
        super(CollectionProductEntity.class, forVariable(variable));
    }

    public QCollectionProductEntity(Path<? extends CollectionProductEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCollectionProductEntity(PathMetadata metadata) {
        super(CollectionProductEntity.class, metadata);
    }

}

