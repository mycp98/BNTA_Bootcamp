package com.bnta.exercises.week_two_wed;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import java.time.LocalDateTime;

public class WorkingWithDates {
    public static void main(String [] args){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        //month.  ---enum


        LocalDate d = LocalDate.of(2000,1,1);
        LocalDate d2 = LocalDate.of(2001,1,1);

        System.out.println(d.getDayOfMonth());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());

        System.out.println(d.isLeapYear());
        // d.
        /*
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        */


    }
}
