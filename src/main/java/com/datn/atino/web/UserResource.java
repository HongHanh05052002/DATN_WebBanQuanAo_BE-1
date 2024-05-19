package com.datn.atino.web;


import com.datn.atino.domain.UserEntity;
import com.datn.atino.service.UserService;
import com.datn.atino.service.respone.CommonResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public CommonResponse userLogin(@RequestBody UserEntity user){
        return userService.userLogin(user);
    }

}
