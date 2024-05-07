package com.datn.atino.service.dto;

import jakarta.persistence.Column;

import java.math.BigDecimal;

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


}
