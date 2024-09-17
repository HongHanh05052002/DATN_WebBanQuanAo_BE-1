package com.datn.atino.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBannerEntity is a Querydsl query type for BannerEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBannerEntity extends EntityPathBase<BannerEntity> {

    private static final long serialVersionUID = -909879240L;

    public static final QBannerEntity bannerEntity = new QBannerEntity("bannerEntity");

    public final QAbstractAuditingEntity _super = new QAbstractAuditingEntity(this);

    //inherited
    public final DateTimePath<java.time.Instant> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath imageBanner = createString("imageBanner");

    public final BooleanPath isActive = createBoolean("isActive");

    public final BooleanPath isVisible = createBoolean("isVisible");

    //inherited
    public final DateTimePath<java.time.Instant> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QBannerEntity(String variable) {
        super(BannerEntity.class, forVariable(variable));
    }

    public QBannerEntity(Path<? extends BannerEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBannerEntity(PathMetadata metadata) {
        super(BannerEntity.class, metadata);
    }

}

