package com.bnta.exercises.week_two_mon;

public class Ex2 {
    //String input = "   b ri   ght net   work  "
    //Write a program that transforms input into: Bright Network
    public static void main(String[] args){

        String input = "   b ri   ght net   work  ";


        String start = input.substring(3,13).trim().replaceAll(" ", "");
        String start2 = start.substring(0,1).toUpperCase() + start.substring(1).toLowerCase();

        String end = input.substring(14,24).trim().replaceAll(" ", "");
        String end2 = end.substring(0,1).toUpperCase() + end.substring(1).toLowerCase();

        System.out.println(start2 + " " + end2);

    }
}
