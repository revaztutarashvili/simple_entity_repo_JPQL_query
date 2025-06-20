package com.example.demo.repository;

import com.example.demo.model.humanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface humanRepository extends JpaRepository<humanEntity,Long>{

}