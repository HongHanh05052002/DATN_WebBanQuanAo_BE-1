package com.datn.atino.repository;

import com.datn.atino.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findByUsernameAndIsActiveTrue(String userName);
}
