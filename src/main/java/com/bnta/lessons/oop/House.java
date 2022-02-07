package com.bnta.lessons.oop;
import java.util.Arrays;

//Creating new Class House with properties like address, size, no. of bedrooms, people living in the house
public class House {
    private Address address;
    private HouseSize houseSize;
    private int numberOfBedrooms;
    private Person[] people;    //created an array of People.txt

    //constructor
    public House(Address address, HouseSize houseSize, int numberOfBedrooms, Person[] people) {
        this.address = address;
        this.houseSize = houseSize;
        this.numberOfBedrooms = numberOfBedrooms;
        this.people = people;
    }
    //getters and setters:
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public HouseSize getHouseSize() {
        return houseSize;
    }

    public void setHouseSize(HouseSize houseSize) {
        this.houseSize = houseSize;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }
    //.toString

    @Override
    public String toString() {
        return "House{" +
                "address=" + address +
                ", houseSize=" + houseSize +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", people=" + Arrays.toString(people) +
                '}';
    }
}
