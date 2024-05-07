package com.datn.atino.web;


import com.datn.atino.domain.ColorEntity;
import com.datn.atino.domain.SizeEntity;
import com.datn.atino.service.ColorService;
import com.datn.atino.service.model.PageFilterInput;
import com.datn.atino.service.respone.PageResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ColorResource {
    private final ColorService colorService;

    public ColorResource(ColorService colorService) {
        this.colorService = colorService;
    }


    @PostMapping("/api/color")
    public PageResponse<List<ColorEntity>> getAll(@RequestBody PageFilterInput<ColorEntity> input){
        return colorService.getAll(input);
    }
}
