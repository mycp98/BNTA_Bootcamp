package com.bnta.exercises.week_two_fri.object_oriented_programming;

import java.util.Arrays;

public class CarDealership {
    // Properties name,max cars and all cars in stock
    private String dealershipName;
    private int capacity;
    private Car[] cars;

    public CarDealership(String dealershipName, int capacity){};

    public CarDealership(String dealershipName, int capacity, Car[] cars) {
        this.dealershipName = dealershipName;
        this.capacity = capacity;
        this.cars = cars;
    }

    public String getDealershipName() {
        return dealershipName;
    }

    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }



    @Override
    public String toString() {
        return "CarDealership{" +
                "dealershipName='" + dealershipName + '\'' +
                ", capacity=" + capacity +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
