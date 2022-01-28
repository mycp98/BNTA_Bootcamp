package com.bnta.exercises.week_one_fri;

public class Ex2 {
    //Write a program that compares two String contents
    public static void main (String[] args){
        String name = "marcy";
        String surname = "marcy";
        // WRONG boolean result = name. == surname;
        boolean result = name.equals(surname);
        System.out.println(result);
    }
}
