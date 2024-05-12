package com.datn.atino.repository;

import com.datn.atino.domain.NewsEntity;
import com.datn.atino.repository.custom.NewsEntityCustomRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsEntityRepository extends JpaRepository<NewsEntity, Integer>, NewsEntityCustomRepository {

    NewsEntity findByIdAndIsActiveTrue(Integer id);

}
