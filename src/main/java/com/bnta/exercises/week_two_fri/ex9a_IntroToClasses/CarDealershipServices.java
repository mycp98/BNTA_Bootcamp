package com.bnta.exercises.week_two_fri.ex9a_IntroToClasses;
//contains all the business logic/services of the object
// 1 add car
// 2 how many cars in the garage
// 3 Find first car wth named manufacturer
public class CarDealershipServices {

    //Input - Dealership
    //Output - int Num of Cars
    //How many cars in the garage:
    public int countCars(Dealership dealership) {
        //counter
        int numOfCars = 0;
        //Loop through number whole dealership array, and count
        for (int i = 0; i < dealership.getMaxCars(); i++) {

            //If not empty then increase the counter by 1:
            if (dealership.getCars()[i] != null) {
                numOfCars += 1;
            }
        }
        return numOfCars;
    }


    public void addCar(Dealership dealership, Car carToAdd) {             //add one car
        //Add the Car
        //dealership.getCars()[0] = carToAdd;


        // loop through the array and find an empty spot
        //for (int i = 0; i < dealership.getCars().length; i++) {
            for (int i = 0; i < dealership.getMaxCars(); i++){
            //If empty, add the car
            if (dealership.getCars()[i] == null) {
                dealership.getCars()[i] = carToAdd;
                break;  //so that the car is added to the first position only, once we have placed our new car we can stop the loop
            }
            //System.out.println("Empty position");
        }
    }
    //Write a method called findByManufacturer
    //Input is string  - ManufacturerName
    //Return First car (object) with manufacturer name

    public Car findByManufacturer(Dealership dealership, String manufacturerName) {
        //Loop through all cars
        for (Car car : dealership.getCars()) {
            if (car != null) {
                if (manufacturerName.toLowerCase().equals(car.getManufacturer().name().toLowerCase())) {
                    return car;
                }
            }
        }
        //return null if nothing found
        return null;


    }



}
