package com.bnta.exercises.easyQs.arrays;

import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        //declare an empty integer array of length 3
        int[] intArray = new int[3];

        System.out.println("\nExercise 2");
        //Printing an array to the console
        System.out.println(Arrays.toString(intArray));

        System.out.println("\nExercise 3");
        //Putting information into our array with .fill()
        Arrays.fill(intArray, 4);
        System.out.println(Arrays.toString(intArray));

        System.out.println("\nExercise 4");
        //Assigning a value to an array BY INDEX
        intArray[1] = 17;
        System.out.println(Arrays.toString(intArray));

        System.out.println("\nExercise 5");
        // Declaring and initialising a String array which holds the values "a", "b", "c", "d"
        String[] stringArray = new String[4];
        stringArray[0] = "a";
        stringArray[1] = "b";
        stringArray[2] = "c";
        stringArray[3] = "d";
        System.out.println(Arrays.toString(stringArray));

        System.out.println("\nExercise 6a");
        // Using Q5, create a second array which is initialised using your original array
//        String[] newArray = stringArray;
//        newArray[0] = "z";
//        System.out.println(Arrays.toString(newArray));
//        System.out.println(Arrays.toString(stringArray));
        //get: [z, b, c, d]
        //     [z, b, c, d]     index 0 of both arrays has been altered, because both arrays are pointing to the same                               space in memory and hence the same exact information. Instead, use Arrays.copyof() method

        System.out.println("\nExercise 6b: ");
        String[] newArray2 = Arrays.copyOf(stringArray, 6);
        newArray2[0] = "z";
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(newArray2));

        System.out.println("\nExercise 7: ");
        //create for loop which prints each item in stringArray
        for(int i = 0; i< stringArray.length ; i++){
            System.out.println(stringArray[i]);
        }

        System.out.println("\n Or using the extended for loop:");
        for(String item : stringArray){
            System.out.println(item);
        }

        System.out.println("\nExercise 8: ");
        //declare new array which can hold the numbers 1-10 (inclusive) ---> array size of 10
        int[] newIntArray = new int[10];
        //create a for loop which initialises this array with the numbers 1-10
        for(int i=0; i<newIntArray.length ;i++){
            newIntArray[i] = i+1;
        }
        //print array to console:
        System.out.println(Arrays.toString(newIntArray));

        System.out.println("\nExercise 9: ");
        //create a second for loop which reassigns each value in the array to be double the initial value
        // [1,2,3,...,9,10] --> [2,4,6,...,18,20]
        for(int number : newIntArray){
            newIntArray[number-1] = number*2;

        }
//          For i loop:
//        for(int i=0; i<newIntArray.length ; i++){
//            newIntArray[i] = newIntArray[i]*2;
//        }
        System.out.println(Arrays.toString(newIntArray));

        System.out.println("\nExercise 10: ");
        //Looping to check for a specified value:

        // create a string variable:
        String condition = "c";
        //create boolean variable which has the value false
        boolean hasC = false;
        //create for loop which goes through each item in the array (from Q5) COMPARING it against the condition variable
        // if the two are equal, change the hasC value to true
        //once the for loop concludes, print out message
        for(int i=0; i< stringArray.length; i++){
            if(stringArray[i] == condition){
                hasC = true;
                System.out.println(stringArray[i] + " has been found at index " + i);
            }
        }
        if (hasC){
            System.out.println(condition + " is in the array!");
        }
        else{
            System.out.println("The condition was not met");
        }
    }
}
