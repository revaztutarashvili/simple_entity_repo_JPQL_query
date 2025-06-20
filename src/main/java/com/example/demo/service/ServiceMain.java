package com.example.demo.service;

import com.example.demo.model.Building;
import com.example.demo.model.Human;
import com.example.demo.repository.BuildingRepository;
import com.example.demo.repository.HumanRepository;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class ServiceMain {
    private final BuildingRepository buildingRepository;
    private final HumanRepository humanRepository;


    public ServiceMain(BuildingRepository buildingRepository, HumanRepository humanRepositoory) {
        this.buildingRepository = buildingRepository;
        this.humanRepository = humanRepositoory;
    }
@PostConstruct
public void tester(){
        Optional<Building> byId = buildingRepository.findById(1L);
        if (byId.isPresent()){
            Building building = byId.get();
            System.out.println("Tester 1 :  "+building.toString());
        }
        else {
        System.out.println("Building doesn't exist");
    }


    }
    @PostConstruct
    public void tester2 (){
        List<Building> all = buildingRepository.findAll();
        System.out.println("Tester2 :  "+all);
    }

    @PostConstruct
    public void tester3 (){
        Building building = new Building();
        building.setHasParking(true);
        building.setAddress("gamziri");
        building.setCapacity(321);
        building.setFloor(24);
        building.setEntrance(6);

        buildingRepository.save(building);
        List<Building> all = buildingRepository.findAll();
        buildingRepository.deleteById(1L);
        System.out.println("Tester3:  " + all);

    }
//    @PostConstruct
//    public void tester4 (){
//        Human human = new Human();
//        human.setName("beso");
//        human.setSex("male");
//        human.setAge(21);
//        human.setIdentityNum(1293333L);
//        List<Human> all = humanRepository.findAll();
//        System.out.println("find created human:  " + all);
//        humanRepository.deleteAll();
//        System.out.println("find after delete:  " + all);
//    }

}

