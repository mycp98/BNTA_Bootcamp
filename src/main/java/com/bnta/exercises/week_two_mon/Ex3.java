package com.bnta.exercises.week_two_mon;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();

        oddOrEven(input);
    }


    static void oddOrEven(int number){

        boolean odd = true;
        for(int i=0; i<number; i++){
            if(number%2 ==0){  //if remainder of the number&2 is 0 then the number is not odd
                odd = false;
                break;
            }
        }
        if(odd){
            System.out.println(number + " is odd");
        } else {
            System.out.println(number + " is even");
        }

    }
}
