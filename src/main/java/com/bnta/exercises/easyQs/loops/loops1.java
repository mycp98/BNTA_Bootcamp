package com.bnta.exercises.easyQs.loops;

import java.util.Arrays;

//comment
public class loops1 {

    public static void main(String[] args) {
        System.out.println("\nExercise1: ");
        //Create a loop that prints all numbers from 0-10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\nExercise2:");
        //Create a loop that prints all numbers from 10-0
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("\nExercise3a: ");
        //Create a loop that prints all even numbers from 0-20
        for (int i = 0; i <= 20; i++) {
            if ((i == 0) || (i % 2 == 0)) {
                System.out.println(i);
            }
        }

        System.out.println("\nExercise3b");
        //a different approach
        for (int i = 0; i <= 20; i += 2) {    //i=i+2  --> 0+2=2 -> 2+2=4 -> 4+2=6...
            System.out.println(i);
        }

        System.out.println("\nExercise 4: ");
        //create a loop that puts all numbers 0 to 10 into an array and print

        //first make an array of number of size 11 (because 0,1,2,....,10) <--going to put this values into each index
        int[] numArray = new int[11];

        //for loop which goes from 0 to 10, add each value to our numArray
        for (int i = 0; i <= 10; i++) {
            numArray[i] = i;
        }

        //to print the array as a string we use Arrays.toString
        System.out.println(Arrays.toString(numArray));


        System.out.println("\nExercise 5: ");
        // Create a second for loop that prints each item in numArray to the terminal individually:
        for(int item : numArray){
            System.out.println(item);
        }

        System.out.println("\nExercise 6: ");
        //Use a for loop to add each number to a sum value. Print the sum value

        //Create a sum variable (placeholder):
        int sum =0;
        //Create a loop that goes through all the values of numArray
//        for(int i=0 ; i<= numArray.length-1 ; i++){
//            //sum = i+sum;        //add each item to the sum value
//            sum += i;
//        }
//        System.out.println(sum);    //print the total sum

        for(int item : numArray){
            sum += item;
        }
        System.out.println(sum);

        System.out.println("\nExercise 7: ");
        //Make all the words and letters capital:

        String[] stringArray = new String[]{"i", "sure", "do", "love", "bees"};

        String[] newStringArray = new String[stringArray.length];
        for(int i=0 ; i< stringArray.length ; i++){
            newStringArray[i] = stringArray[i].toUpperCase();
        }
        System.out.println(Arrays.toString(newStringArray));
        System.out.println(Arrays.toString(stringArray));


        System.out.println("\nExercise 8: ");
        // Create a loop that capitalises each word in the stringArray (first letter cap in each word)

        String[] newStringArray2 = new String[stringArray.length];
        for(int i=0; i< stringArray.length ;i++){
            char firstLetter = stringArray[i].charAt(0);
            char capLetter = Character.toUpperCase(firstLetter);
            String capWord = capLetter + stringArray[i].substring(1);
            newStringArray2[i] = capWord;
        }
        System.out.println(Arrays.toString(newStringArray2));

    }

}
