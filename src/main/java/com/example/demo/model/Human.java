package com.example.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
//@Table(name = "humanEntity")
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private long identityNum;

    @Column(name = "personName", nullable = false)
    private String name;

    @Column(name = "Sex", updatable = true)
    private String sex;

    @Column(name = "personAge", updatable = false)
    private int age;

    @Column(name = "weight", updatable = true)
    private long weight;

    @Column(name = "address", unique = false)
    private String address;

    @OneToMany

    private List<Building> Building;
}
