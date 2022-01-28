package com.bnta.exercises.easyQs.methods;

import java.util.Scanner;

public class methods1 {

//Write a method which takes two numbers as arguments and prints their sum to the terminal.

    //the main:
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("The sum is: ");

        //here we invoke our method
        System.out.println(sumTwoNum(num1,num2));

    }

        //write our method:
        static int sumTwoNum(int number1, int number2){

            return number1 + number2;
        }

    }




