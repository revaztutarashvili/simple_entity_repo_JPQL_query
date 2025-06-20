package com.example.demo.repository;

import com.example.demo.model.buildingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface buildingRepository extends  JpaRepository<buildingEntity, Long> {


}
