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

    @Column(name = "personAge", updatable = true)
    private int age;

    @Column(name = "weight", updatable = true)
    private long weight;

    @Column(name = "address", unique = false)
    private String address;

    @OneToMany

    private List<Building> Building;

//_____________________-Getters & Setters________________________

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(long identityNum) {
        this.identityNum = identityNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public List<Building> getBuilding() {
        return Building;
    }

    public void setBuilding(List<Building> building) {
        Building = building;
    }

//    _________toString_________


    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", identityNum=" + identityNum +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", address='" + address + '\'' +
                ", Building=" + Building +
                '}';
    }
}

