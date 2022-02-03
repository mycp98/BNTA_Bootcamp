package com.bnta.exercises.easyQs.loops;
//comment
public class loops1 {

    public static void main(String[] args){
        System.out.println("Exercise1: ");
        //Create a loop that prints all numbers from 0-10
        for (int i = 0; i<= 10; i++){
            System.out.println(i);
        }

        System.out.println("Exercise2:");
        //Create a loop that prints all numbers from 10-0
        for (int i=10; i>= 0; i--){
            System.out.println(i);
        }

        System.out.println("Exercise3a: ");
        //Create a loop that prints all even numbers from 0-20
        for(int i=0; i<= 20; i++){
            if( (i==0) || (i%2==0)){
                System.out.println(i);
            }
        }

        System.out.println("Exercise3b");
        //a different approach
        for(int i=0; i<=20; i+=2){    //i=i+2  --> 0+2=2 -> 2+2=4 -> 4+2=6...
            System.out.println(i);
        }
    }

}
