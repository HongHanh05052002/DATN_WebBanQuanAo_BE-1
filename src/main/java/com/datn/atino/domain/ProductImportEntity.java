package com.datn.atino.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "product_import")
public class ProductImportEntity extends AbstractAuditingEntity<Integer>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne()
    @JoinColumn(name = "product_id")
    private ProductEntity productEntity;

    @Column(name = "color")
    private String color;

    @Column(name = "size")
    private String size;

    @Column(name = "quantity_import")
    private Integer quantityImport;

    @Column(name = "is_active")
    private Boolean isActive = true;


    @Override
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }



    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public Integer getQuantityImport() {
        return quantityImport;
    }

    public void setQuantityImport(Integer quantityImport) {
        this.quantityImport = quantityImport;
    }
}
