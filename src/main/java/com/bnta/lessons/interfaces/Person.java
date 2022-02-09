package com.bnta.lessons.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

    private String name;

    //A person can have anything that is a vehicle
    private List<Vehicle>vehicles;


    //constructor:
    public Person(String name, List<Vehicle> vehicles) {
        this.name = name;
        this.vehicles = vehicles;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(vehicles, person.vehicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vehicles);
    }

    //    private List<Car> car;
//    private List<Bike> bike;
//    private List<ElectricScooter> electricScooters;
}
