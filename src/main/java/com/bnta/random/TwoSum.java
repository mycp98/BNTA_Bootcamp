package com.bnta.random;

import java.util.Arrays;

public class TwoSum {
    public static void main (String [] args) {
        int[] numsArray = {3,2,4};
        int target =6;

        System.out.println(Arrays.toString(twoSum(numsArray, target)));
    }

    public static int [] twoSum( int [] numbers, int target) {
        //set x = numbers[0]
        //set y = target-x
        //loop through nums array
        //if numbers[i] ==y
        //then set z==numbers[i]
        //then print out array [x,z]
        for(int i = 0; i< numbers.length; i++){
            int x = numbers[i];
            int y = target-x;
            for(int j=i; j< numbers.length; j++){
               if(i!=j && numbers[j] == y){
                   int[] result = {i,j};
                   return result;

               }
            }
        }
        return null;
    }

}
