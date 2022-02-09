package com.bnta.lessons.interfaces;
//We need to implement: otherwise won't be a vehicle
public class Car implements Vehicle{
    @Override
    public void move() {
        System.out.println("start engine");
        System.out.println("gear");
        System.out.println("accelerate");
    }

    @Override
    public void applyBreak() {

    }

    @Override
    public double getCurrentSpeed() {

        return 60.65348;
    }





}
