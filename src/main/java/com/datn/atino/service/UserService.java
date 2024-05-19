package com.datn.atino.service;


import com.datn.atino.domain.UserEntity;
import com.datn.atino.repository.UserRepository;
import com.datn.atino.service.dto.UserDTO;
import com.datn.atino.service.exception.CustomException;
import com.datn.atino.service.respone.CommonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;

    public UserService(UserRepository userRepository, JwtService jwtService, AuthenticationManager authenticationManager) {
        this.userRepository = userRepository;
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
    }

    public CommonResponse userLogin(UserEntity input){
        UserEntity user = userRepository.findByUsernameAndIsActiveTrue(input.getUsername());
        if(user == null) return new CommonResponse().result("403","Thông tin mật khẩu không chính xác", false);
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())
            );
        } catch (Exception ex){
            return new CommonResponse().result("403","Thông tin mật khẩu không chính xác", false);
        }
        String jwtToken = jwtService.generateToken(user);
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName(user.getUsername());
        userDTO.setEmail(user.getEmail());
        userDTO.setPhoneNumber(user.getPhoneNumber());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setToken(jwtToken);
        return new CommonResponse().success().data(userDTO);
    }



}
