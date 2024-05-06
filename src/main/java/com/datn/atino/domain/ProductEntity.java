package com.datn.atino.domain;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "product")
public class ProductEntity extends AbstractAuditingEntity<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "product_color")
    private String productColor;

    @Column(name = "product_form")
    private String productForm;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "total_quantity_sales")
    private Integer totalQuantitySales;

    @Column(name = "total_quantity_imported")
    private Integer totalQuantityImported;


    @Column(name = "is_visible")
    private Integer isVisible;

    @Column(name = "is_active")
    private Boolean isActive;

    @Override
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductForm() {
        return productForm;
    }

    public void setProductForm(String productForm) {
        this.productForm = productForm;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getTotalQuantitySales() {
        return totalQuantitySales;
    }

    public void setTotalQuantitySales(Integer totalQuantitySales) {
        this.totalQuantitySales = totalQuantitySales;
    }

    public Integer getTotalQuantityImported() {
        return totalQuantityImported;
    }

    public void setTotalQuantityImported(Integer totalQuantityImported) {
        this.totalQuantityImported = totalQuantityImported;
    }

    public Integer getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Integer isVisible) {
        this.isVisible = isVisible;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
