package com.bnta.lessons.interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();    //can change first Car to Vehicle
        Bike bike = new Bike();         //can change first Bike to Vehicle
        ElectricScooter scooter = new ElectricScooter();

        //Array of vehicle      //type is <Vehicle>
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(scooter);

        Person marcy = new Person("Marcy", vehicles);

        for (Vehicle vehicle : marcy.getVehicles()){
            vehicle.move();
            System.out.println();
        }

        for (Vehicle vehicle : marcy.getVehicles()){
            vehicle.getCurrentSpeed();
            System.out.println(vehicle.getCurrentSpeed() + " mph");
        }
    }
}
