package com.datn.atino.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFileNameDictionaryEntity is a Querydsl query type for FileNameDictionaryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFileNameDictionaryEntity extends EntityPathBase<FileNameDictionaryEntity> {

    private static final long serialVersionUID = 1321412841L;

    public static final QFileNameDictionaryEntity fileNameDictionaryEntity = new QFileNameDictionaryEntity("fileNameDictionaryEntity");

    public final DateTimePath<java.time.Instant> createdAt = createDateTime("createdAt", java.time.Instant.class);

    public final NumberPath<Integer> entityType = createNumber("entityType", Integer.class);

    public final StringPath fileName = createString("fileName");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final BooleanPath isDraft = createBoolean("isDraft");

    public final NumberPath<Integer> parentId = createNumber("parentId", Integer.class);

    public final StringPath savedFileName = createString("savedFileName");

    public final NumberPath<Long> size = createNumber("size", Long.class);

    public QFileNameDictionaryEntity(String variable) {
        super(FileNameDictionaryEntity.class, forVariable(variable));
    }

    public QFileNameDictionaryEntity(Path<? extends FileNameDictionaryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFileNameDictionaryEntity(PathMetadata metadata) {
        super(FileNameDictionaryEntity.class, metadata);
    }

}

