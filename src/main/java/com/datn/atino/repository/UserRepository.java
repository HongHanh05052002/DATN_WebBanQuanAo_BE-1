package com.datn.atino.repository;

import com.datn.atino.domain.UserEntity;
import com.datn.atino.repository.custom.UserCustomRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer>, UserCustomRepository {

    UserEntity findByUsernameAndIsActiveTrue(String userName);

    UserEntity findByIdAndIsActiveTrue(Integer id);
}
