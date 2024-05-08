package com.datn.atino.service.dto;

import jakarta.persistence.Column;

import java.math.BigDecimal;
import java.util.List;

public class ProductDTO {

    private Integer id;

    private String productName;

    private String avatar;

    private String description;

    private BigDecimal price;

    private String productColor;

    private String productForm;

    private Integer sales;

    private Integer quantity;

    private Integer totalQuantitySales;

    private Integer totalQuantityImported;

    private Integer isVisible;

    private List<FileNameDictionaryDTO> imageDescription;

    public Integer getId() {
        return id;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
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

    public List<FileNameDictionaryDTO> getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(List<FileNameDictionaryDTO> imageDescription) {
        this.imageDescription = imageDescription;
    }
}
