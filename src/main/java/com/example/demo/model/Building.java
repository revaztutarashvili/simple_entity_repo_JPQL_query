package com.example.demo.model;

import jakarta.persistence.*;

@Entity
//@Table(name = "buildingEntity")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private long id;

    @Column(name = "floors", unique = false)
    private int floor;

    @Column(name = "parking_Y/N", updatable = true)
    private boolean hasParking;

    @Column(name = "address", unique = false)
    private String address;

    @Column(name = "entrance_Qntt")
    private int entrance;

    @Column(name = "Capacity")
    private int capacity;

    @ManyToOne
    @JoinColumn(name = "OwnerId")
    private Human Human;



}
