package com.bnta.lessons.interfaces;

public class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("pedal");
    }

    @Override
    public void applyBreak() {

    }

    @Override
    public double getCurrentSpeed() {

        return 20.78331;
    }
}
