package com.bnta.exercises.week_two_fri.Ex9a;

public class Dealership {
    private String name;
    private int maxCars;
    private Car[] cars;

    public Dealership(String name, int maxCars, Car[] cars) {
        this.name = name;
        this.maxCars = maxCars;
        //this.cars = cars;
        this.cars = new Car[maxCars];  //create an empty array with maxCars spaces in it
    }
}
