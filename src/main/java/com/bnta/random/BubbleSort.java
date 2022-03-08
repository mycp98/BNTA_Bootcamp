package com.bnta.random;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{4,3,1,2})));
        //System.out.println(Arrays.toString(bubbleSort(new int[]{4,3,1,2})));

    }

    //returning array of integers, and input is an array of integers named numbers
    //method name is sort
    public static int[] sort(int[] numbers){
        //1st pass
        // [4,3,1,2] --> [4,4,1,2]
        // [3,1,4,2]
        // [3,1,2,4]
        //2nd pass
        //[1,2,3,4]

        for(int i =0; i< numbers.length -1 ; i++){
            for (int j = 0; j < numbers.length -i-1 ; j++) {
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j]; //4
                    numbers[j] = numbers[j+1]; //[3,3,1,2]
                    numbers[j+1] = temp; //[3,4,1,2]
                }
            }
        }
        return numbers;
    }


    public static int[] bubbleSort(int[] numbersArray) {
    boolean sorted = false;
    int temp;
    while(!sorted) {  //continue looping while sorted is not true
        sorted = true; //when numbersArray[i] < numbersArray[i+1] then sorted =true; and the loop will stop
        for (int i = 0; i < numbersArray.length - 1; i++) {
            if (numbersArray[i] > numbersArray[i+1]) {
                temp = numbersArray[i];
                numbersArray[i] = numbersArray[i+1];
                numbersArray[i+1] = temp;
                sorted = false;
            }
        }
    }
        return numbersArray;
    }


}

