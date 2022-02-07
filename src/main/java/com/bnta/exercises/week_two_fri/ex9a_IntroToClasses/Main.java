package com.bnta.exercises.week_two_fri.ex9a_IntroToClasses;



public class Main {
    public static void main(String[] args){
        Car car1 = new Car(Manufacturer.MERCEDES, 100_000, EngineType.DIESEL );
        Car car2 = new Car(Manufacturer.BMW, 150_000, EngineType.ELECTRIC);
        Car car3 = new Car(Manufacturer.MASERATI, 200_000, EngineType.HYBRID);
       Car car4 = new Car(Manufacturer.LAMBORGHINI, 500_000, EngineType.HYDROGEN);
        Car car5 = new Car(Manufacturer.BMW, 299_000, EngineType.PETROL);
        Car car6 = new Car(Manufacturer.TOYOTA, 70_000, EngineType.HYBRID);



        System.out.println(car1);

        //create array of cars containing the 3 cars
        Car[] cars = {car1, car2, car3};
    //making a new Dealership called marcyCar:
    Dealership marcyCar = new Dealership("MarcyCar", 6);
    //Creating the services - in order to use the services, it's not static, so we needed to make the new object
        CarDealershipServices marcyCarServices = new CarDealershipServices();

       // marcyCarServices.addCar(marcyCar, car1 );
        System.out.println(marcyCar);


        for (Car car : cars){
            marcyCarServices.addCar(marcyCar, car);
        }
        System.out.println(marcyCar);   //dealership after adding cars
        System.out.println("There are " + marcyCarServices.countCars(marcyCar) + " cars in this dealership.");

        String manufacturerName = "mercedes";
        Car result = marcyCarServices.findByManufacturer(marcyCar, manufacturerName);

        if (result == null){
            System.out.println("No " + manufacturerName + " found inside the dealership MarcyCar");
        } else{
            System.out.println("First car from " + manufacturerName.toUpperCase() + ": " + result);

        }



    }
}
