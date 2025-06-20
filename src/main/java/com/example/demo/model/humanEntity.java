package com.example.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "humanEntity")
public class humanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(unique = true)
    private long identityNum;

    @Column(name = "personName")
    private String name;

    @Column(name = "Sex")
    private String sex;

    @Column(name = "personAge")
    private int age;

    @Column(name = "weight")
    private long weight;

    @Column(name = "address")
    private String address;

    @OneToMany
    private List<buildingEntity> buildingEntity;
}
