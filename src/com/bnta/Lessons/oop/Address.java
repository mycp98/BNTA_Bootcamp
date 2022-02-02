package com.bnta.Lessons.oop;

public class Address {
    //properties of class Address:
    private String firstLine;
    private String postCode;
    private String city;

    //constructor
    public Address(String firstLine, String postCode, String city) {
        this.firstLine = firstLine;
        this.postCode = postCode;
        this.city = city;
    }

    //getters & setters for ALL properties
    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // .toString
    @Override
    public String toString() {
        return "Address{" +
                "firstLine='" + firstLine + '\'' +
                ", postCode='" + postCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
