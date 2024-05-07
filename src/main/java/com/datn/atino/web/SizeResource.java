package com.datn.atino.web;


import com.datn.atino.domain.SizeEntity;
import com.datn.atino.service.SizeService;
import com.datn.atino.service.model.PageFilterInput;
import com.datn.atino.service.respone.PageResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SizeResource {

    private final SizeService sizeService;

    public SizeResource(SizeService sizeService) {
        this.sizeService = sizeService;
    }

    @PostMapping("/api/size")
    public PageResponse<List<SizeEntity>> getAll(@RequestBody PageFilterInput<SizeEntity> input){
        return sizeService.getAll(input);
    }

}
