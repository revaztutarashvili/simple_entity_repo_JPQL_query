package com.example.demo.repository;

import com.example.demo.model.Building;
import org.hibernate.query.sqm.mutation.internal.temptable.InsertExecutionDelegate;
import org.hibernate.sql.Insert;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends  JpaRepository<Building, Long> {


}
