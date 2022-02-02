package com.bnta.exercises.week_one_fri;

import java.util.Scanner;
//Write a program that compares two numbers
public class Ex1 {
    public static void main(String[] args){

        //use Scanner to get user to input
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Enter your first number: "); // prompt user to enter the first integer
        num1 = input.nextInt(); //read user's first number

        System.out.println("Enter your second number: "); // prompt user to enter the second integer
        num2 = input.nextInt(); //read user's second number


        // Comparing user's first number to second number:
        if (num1 < num2){
        System.out.println(num1 + " is less than " + num2);
        }

        else if (num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        }

        else //num1 is not greater or less than num2 therefore they are equal
        {System.out.println(num1 + " is equal to " + num2);
        }
    }
}



/*
import java.util.*;
public class com.bnta.exercises.week_one_fri.Exercise1_1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int x = input.nextInt();
        System.out.println("Enter your second number: ");
        int y = input.nextInt();

        if (x==y) {
            System.out.println("The numbers are equal.");
        }
        else {
        System.out.println("The numbers are not equal. ");
        }
    }
    }
     */