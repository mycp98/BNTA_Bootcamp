package com.bnta.exercises.week_two_wed;

public class Main {
    public static void main(String[] args){
        System.out.println(Gender.FEMALE);   //Using Enums for constants
        System.out.println(Gender.MALE);

        String[] names = {};

        Gender[] gender = Gender.values();
        /* for (Gender gender1 : gender){
            System.out.println(gender.name().toLowerCase());
        }
*/
        System.out.println(Gender.MALE.equals(Gender.FEMALE));
    }
}
