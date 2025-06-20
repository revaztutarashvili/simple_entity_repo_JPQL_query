package com.example.demo.model;

import jakarta.persistence.*;

@Entity
//@Table(name = "buildingEntity")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "floors", unique = false)
    private int floor;

    @Column(name = "parking", updatable = false)
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEntrance() {
        return entrance;
    }

    public void setEntrance(int entrance) {
        this.entrance = entrance;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Human getHuman() {
        return Human;
    }

    public void setHuman(Human human) {
        Human = human;
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", floor=" + floor +
                ", hasParking=" + hasParking +
                ", address='" + address + '\'' +
                ", entrance=" + entrance +
                ", capacity=" + capacity +
                ", Human=" + Human +
                '}';
    }
}
