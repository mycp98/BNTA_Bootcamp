package com.bnta.exercises.week_two_fri.ex9a_IntroToClasses;
//making a Dealership Class
import java.util.Arrays;

public class Dealership {
    //Properties: Car name, max cars and all cars in stock
    private String name;
    private int maxCars;
    private Car[] cars;

    public Dealership(String name, int maxCars) {  //don't need to pass in the car array, want to start the dealership fresh
        this.name = name;
        this.maxCars = maxCars;
        //this.cars = cars; <---don't use this
        this.cars = new Car[maxCars];  //create an empty array with maxCars spaces in it
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCars() {
        return maxCars;
    }

    public void setMaxCars(int maxCars) {
        this.maxCars = maxCars;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", maxCars=" + maxCars +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
