package com.example.demo.repository;
import com.example.demo.model.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BuildingRepository extends  JpaRepository<Building, Long> {

    @Query()
    List<Building> searchByAddressPart(@Param("addressPart") String addressPart);

}

