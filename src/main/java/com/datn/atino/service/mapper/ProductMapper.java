package com.datn.atino.service.mapper;

import com.datn.atino.domain.ProductEntity;
import com.datn.atino.service.dto.ProductDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDTO toDTO(ProductEntity productEntity){
        ProductDTO product = new ProductDTO();
        product.setId(productEntity.getId());
        product.setProductName(productEntity.getProductName());
        product.setProductForm(productEntity.getProductForm());
        product.setDescription(productEntity.getDescription());
        product.setProductColor(productEntity.getProductColor());
        product.setSales(productEntity.getSales());
        product.setAvatar(productEntity.getAvatar());
        product.setPrice(productEntity.getPrice());
        product.setQuantity(productEntity.getQuantity());
        product.setTotalQuantityImported(productEntity.getTotalQuantityImported());
        product.setTotalQuantitySales(productEntity.getTotalQuantitySales());
        return product;
    }

    public ProductEntity toEntity(ProductDTO product){
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductName(product.getProductName());
        productEntity.setProductForm(product.getProductForm());
        productEntity.setDescription(product.getDescription());
        productEntity.setProductColor(product.getProductColor());
        productEntity.setAvatar(product.getAvatar());
        productEntity.setPrice(product.getPrice());
        productEntity.setSales(product.getSales());
        return productEntity;
    }

    public void updateForm(ProductEntity productEntity, ProductDTO product){
        productEntity.setProductName(product.getProductName());
        productEntity.setProductForm(product.getProductForm());
        productEntity.setDescription(product.getDescription());
        productEntity.setProductColor(product.getProductColor());
        productEntity.setAvatar(product.getAvatar());
        productEntity.setPrice(product.getPrice());
        productEntity.setSales(product.getSales());
    }


}
