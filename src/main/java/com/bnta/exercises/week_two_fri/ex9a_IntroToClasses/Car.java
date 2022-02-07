package com.bnta.exercises.week_two_fri.ex9a_IntroToClasses;

public class Car {
    //Properties
    //accessMod Class/datatype name
    private Manufacturer manufacturer;
    private long price;
    private EngineType engineType;

    //Constructor:
    public Car(Manufacturer manufacturer, long price, EngineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }
    //Setters, getters, toString:
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer=" + manufacturer +
                ", price=" + price +
                ", engineType=" + engineType +
                '}';
    }
}
