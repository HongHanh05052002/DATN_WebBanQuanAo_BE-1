package com.datn.atino.service;


import com.datn.atino.domain.BillEntity;
import com.datn.atino.domain.BillProductEntity;
import com.datn.atino.domain.ProductEntity;
import com.datn.atino.repository.BillRepository;
import com.datn.atino.repository.ProductBillRepository;
import com.datn.atino.repository.ProductRepository;
import com.datn.atino.service.dto.BillDTO;
import com.datn.atino.service.dto.ProductBillDTO;
import com.datn.atino.service.dto.ProductDTO;
import com.datn.atino.service.exception.CustomException;
import com.datn.atino.service.mapper.ProductMapper;
import com.datn.atino.service.model.PageFilterInput;
import com.datn.atino.service.respone.CommonResponse;
import com.datn.atino.service.respone.PageResponse;
import com.datn.atino.service.util.Constants;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class BillService {

    private final BillRepository billRepository;

    private final ProductBillRepository productBillRepository;


    private final ProductRepository productRepository;

    public BillService(BillRepository billRepository, ProductBillRepository productBillRepository, ProductRepository productRepository) {
        this.billRepository = billRepository;
        this.productBillRepository = productBillRepository;
        this.productRepository = productRepository;
    }

    public PageResponse<List<BillDTO>> getAllBill(PageFilterInput<BillDTO> input){
        Pageable pageable = Constants.getPageable(input);
        List<BillDTO> result = new ArrayList<>();
        Page<BillEntity> billEntities = billRepository.getAll(input, pageable);

        for (BillEntity billEntity : billEntities.getContent()){
            BillDTO billDTO = new BillDTO();
            billDTO.setId(billEntity.getId());
            billDTO.setBillCode(billEntity.getBillCode());
            billDTO.setCreatedBy(billEntity.getCreatedBy());
            billDTO.setCreatedAt(billEntity.getCreatedAt());
            billDTO.setBillNote(billEntity.getBillNote());
            billDTO.setTotalPrice(billEntity.getTotalPrice());
            billDTO.setReciver(billEntity.getReciver());
            billDTO.setEmail(billEntity.getEmail());
            billDTO.setPhoneNumber(billEntity.getPhoneNumber());
            billDTO.setStatus(billEntity.getStatus());
            result.add(billDTO);
        }

        return new PageResponse<List<BillDTO>>().success().dataCount(billEntities.getTotalElements()).data(result);
    }

    public CommonResponse getDetail(Integer id){
        BillEntity billEntity = billRepository.findByBillId(id);
        BillDTO billDTO = new BillDTO();
        billDTO.setId(billEntity.getId());
        billDTO.setBillCode(billEntity.getBillCode());
        billDTO.setCreatedBy(billEntity.getCreatedBy());
        billDTO.setCreatedAt(billEntity.getCreatedAt());
        billDTO.setBillNote(billEntity.getBillNote());
        billDTO.setTotalPrice(billEntity.getTotalPrice());
        billDTO.setReciver(billEntity.getReciver());
        billDTO.setEmail(billEntity.getEmail());
        billDTO.setPhoneNumber(billEntity.getPhoneNumber());
        billDTO.setStatus(billEntity.getStatus());
        List<BillProductEntity> productEntities = productBillRepository.findByBillId(id);
        Map<Integer, ProductDTO> productDTOMap = productRepository.findByAllProduct()
                .stream()
                .collect(Collectors.toMap(ProductDTO::getId, Function.identity()));
        List<ProductBillDTO> productBillDTOS = new ArrayList<>();
        for (BillProductEntity billProductEntity : productEntities){
            ProductBillDTO productBillDTO = new ProductBillDTO();
            productBillDTO.setId(billProductEntity.getId());
            productBillDTO.setProduct(productDTOMap.get(billProductEntity.getProductId()));
            productBillDTO.setQuantity(billProductEntity.getQuantity());
            productBillDTO.setSales(billProductEntity.getSales());
            productBillDTO.setSize(billProductEntity.getSize());
            productBillDTO.setColor(billProductEntity.getColor());
            productBillDTO.setPrice(billProductEntity.getPrice());
            productBillDTOS.add(productBillDTO);
        }
        billDTO.setProductBill(productBillDTOS);
        return new CommonResponse().success().data(billDTO);
    }

    @Transactional
    public void saveBill(BillDTO input){
        BillEntity billEntity = new BillEntity();
        billEntity.setBillCode(input.getBillCode());
        billEntity.setCreatedBy(input.getCreatedBy());
        billEntity.setCreatedAt(Instant.now());
        billEntity.setBillNote(input.getBillNote());
        billEntity.setTotalPrice(input.getTotalPrice());
        billEntity.setReciver(input.getReciver());
        billEntity.setEmail(input.getEmail());
        billEntity.setPhoneNumber(input.getPhoneNumber());
        billEntity.setStatus(input.getStatus());
        billEntity.setAddress(input.getAddress());
        billEntity.setBillNote(input.getBillNote());
        billRepository.save(billEntity);
        BigDecimal total = BigDecimal.ZERO;
        if(CollectionUtils.isEmpty(input.getProductBill())) throw new CustomException(HttpStatus.BAD_REQUEST, "Bạn phải chọn sản phẩm");
        List<BillProductEntity> productEntitiesSave = new ArrayList<>();
        for (ProductBillDTO productBillDTO : input.getProductBill()){
            BillProductEntity productEntity = new BillProductEntity();
            productEntity.setBillId(billEntity.getId());
            productEntity.setProductId(productBillDTO.getProduct().getId());
            productEntity.setQuantity(productBillDTO.getQuantity());
            productEntity.setSales(productBillDTO.getSales());
            productEntity.setSize(productBillDTO.getSize());
            productEntity.setColor(productBillDTO.getColor());
            productEntity.setPrice(productBillDTO.getPrice());
            productEntitiesSave.add(productEntity);
            total = total.add(productBillDTO.getPrice().multiply(BigDecimal.valueOf(productBillDTO.getQuantity())));
        }
        billEntity.setTotalPrice(total);
        billRepository.save(billEntity);
        productBillRepository.saveAll(productEntitiesSave);
    }

    public void changeStatus(Integer id, Integer status){
        BillEntity billEntity = billRepository.findByBillId(id);
        billEntity.setStatus(status);
        billRepository.save(billEntity);
    }

}
