package com.bnta.lessons.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;

    //A person can have anything that is a vehicle
    private List<Vehicle>vehicles;


    //constructor:
    public Person(String marcy, List<Vehicle> vehicles) {
    }


    //setters and getters:

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }


//    private List<Car> car;
//    private List<Bike> bike;
//    private List<ElectricScooter> electricScooters;
}
