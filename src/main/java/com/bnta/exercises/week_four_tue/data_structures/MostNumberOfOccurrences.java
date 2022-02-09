package com.bnta.exercises.week_four_tue.data_structures;

import java.util.Arrays;
import java.util.HashMap;

public class MostNumberOfOccurrences {
    public static void main(String[] args) {

        String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";  //each of these will be the keys


       HashMap<String,Integer> returnedCountMap = countOccurrences(input);   //storing the HashMap we created as returnedCountMap

        System.out.println(returnedCountMap.keySet());   // prints the keys [1,3,4,5,6,7,8] of the countMap HashMap

        getMaxOccurrence(returnedCountMap);


    }

    private static void getMaxOccurrence(HashMap<String, Integer> returnedCountMap) {
        for (String key: returnedCountMap.keySet()){  //for each key within the keyset
            System.out.println(key+ " = " + returnedCountMap.get(key));  //for every key, returns the value of that key
        }


        String maxKey = null;
        int maxValue = 0;

        for (String key : returnedCountMap.keySet()){


           if(maxKey==null){
               maxKey = key;
               maxValue = returnedCountMap.get(key);
           } else if(returnedCountMap.get(key)> maxValue){
               maxKey = key;
               maxValue = returnedCountMap.get(key);
           } else if (returnedCountMap.get(key)== maxValue){
               maxKey = maxKey + " And " + key;
           }

        }

        System.out.println(maxKey + " occurs the most number of times (" + maxValue + " times)" );
    }


    private static HashMap<String, Integer> countOccurrences(String input) {
        String[] stringArray = input.split(","); //split the string by comma
        System.out.println(Arrays.toString(stringArray));  //turns string (input) to array of strings: [1,1,1,1,3,4,5,6,7,7,7,8,8]
        //Initialise HashMap to store count, key = NumberString,
        HashMap<String, Integer> countMap = new HashMap<>();

        //Loop through the splitArray, and making the keys:
        for (String keyNumber : stringArray){
            if (!countMap.containsKey(keyNumber)){     //If key doesn't exist THEN set to one

                countMap.put(keyNumber,1);
            } else{                                              //Else If key Exists
               int updatedValue = countMap.get(keyNumber) + 1;       //Increment the value by 1
              countMap.put(keyNumber, updatedValue);

            }

    }
        //Return the HashMap
        System.out.println(countMap);  //gives {1=4, 3=1, 4=1, 5=1, 6=1, 7=3, 8=2}
        return countMap;
    }

}
