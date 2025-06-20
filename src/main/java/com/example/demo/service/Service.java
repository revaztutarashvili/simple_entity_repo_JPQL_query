package com.example.demo.service;

import com.example.demo.repository.BuildingRepository;
import com.example.demo.repository.HumanRepository;
import jakarta.annotation.PostConstruct;

public class Service {
    private final BuildingRepository buildingRepository;
    private final HumanRepository humanRepositoory;

    public Service(BuildingRepository buildingRepository, HumanRepository humanRepositoory) {
        this.buildingRepository = buildingRepository;
        this.humanRepositoory = humanRepositoory;
    }
@PostConstruct
public void tester(){
        buildingRepository.findById(1l);
    }

}

