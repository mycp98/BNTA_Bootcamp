package com.bnta.exercises.easyQs.methods;

import java.util.Scanner;

//Write a method to change the sign of a number
public class methods2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int givenNumber = scanner.nextInt();

        //invoke method:
        switchSigns(givenNumber);
    }

    //method:
    static void switchSigns(int number){

        int newNumber = number * (-1);

        if(newNumber <0){
            System.out.println("Number is now negative: " + newNumber);
        } else
            System.out.println("Number is now  positive: " + newNumber);
        }


    }




