package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "buildingEntity")
public class buildingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private long id;

    @Column()
    private int floor;

    @Column()
    private boolean hasParking;

    @Column()
    private String address;

    @Column()
    private int entrance;

    @Column()
    private int capacity;

    @ManyToOne
    private humanEntity humanEnt;



}
