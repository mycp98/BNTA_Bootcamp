package com.bnta.exercises.week_two_mon;
//Write method that reverses any String and print to console
public class Ex1 {
    public static void main(String[] args) {

        System.out.println(reverse("Hello"));
        System.out.println(reverse("yadsendeW"));
        System.out.println(reverse("Marcy"));

        }
        static String reverse(String input) {
        String output = "";
        for (int i = input.length() -1; i >= 0; i--){
            output += input.charAt(i);
        }
        return output;
        }
    }

//String day = {"Friday, Thursday, Wednesday, Tuesday, Monday"};
//String[] days ={"Friday", "Thursday", "Wednesday", "Tuesday", "Monday"};
//String[] days = new String[5];

//for (int i = days.length -1 ; i >= 0; i--){
// System.out.println(days[i]); //instead we don't want to print the character as it loops so we use return instead
//This is reversing the array not the string
//