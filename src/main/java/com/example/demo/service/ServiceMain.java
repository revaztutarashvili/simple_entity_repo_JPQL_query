package com.example.demo.service;

import com.example.demo.model.Building;
import com.example.demo.repository.BuildingRepository;
import com.example.demo.repository.HumanRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@Service
public class ServiceMain {
    private final BuildingRepository buildingRepository;
    private final HumanRepository humanRepositoory;

    public ServiceMain(BuildingRepository buildingRepository, HumanRepository humanRepositoory) {
        this.buildingRepository = buildingRepository;
        this.humanRepositoory = humanRepositoory;
    }
@PostConstruct
public void tester(){
        Optional<Building> byId = buildingRepository.findById(1L);
        if (byId.isPresent()){
            Building building = byId.get();
            System.out.println("there is tester method 1 "+building.toString());
        }
        else {
        System.out.println("Building doesn't exist");
    }
        List<Building> all = buildingRepository.findAll();
    System.out.println("here is find all "+all);

    }

}

