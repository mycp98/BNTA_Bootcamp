package com.bnta.exercises.week_two_mon;

public class Ex7 {
    public static void main(String[] args){
        String[] arrayWords = {"hello",     //index = 0
                                "ola",      //index =1
                                "bye",      //index =2
                                "ciao",     //index =3
                                "hello",    //index =4
                                "bingo"};   //index =5        arrayWords.length = 6
        String result = getLongest(arrayWords);
        System.out.println(result);
    }

    static String getLongest(String[] arrayWords){
        // assign integer variable for the length of the first element in array
        int elementLength = arrayWords[0].length();
        String outcome = arrayWords[0];  //placeholder for now
        //Loop over the array
        for(int i=1; i< arrayWords.length; i++){     //loop from the second element as long as
                                                    //the index is smaller than the length of our array=6
            if (arrayWords[i].length() > elementLength){  //if the length of the i-th element in our array
                                                            //is greater than the current elementLength then
                elementLength = arrayWords[i].length();     //the elementLength becomes length of that i-th element
                outcome = arrayWords[i];                    //the outcome is that i-th element of our array
            }
            else if (arrayWords[i].length() == elementLength){  //else if the length of the i-th element in our array equals
                                                                // the current elementLength for e.g hello then hello again
                if (outcome.contains(arrayWords[i]) == false){  //and if the outcome contains the i-th element of our array
                                                                // (if they're the same word?) then false i.e don't return the same word?
                    outcome = outcome + ", " +arrayWords[i];   //the outcome is outcome PLUS the i-th element of our array
                }
            }
        }
        return outcome;
    }

   /*

    static String getlongestString(String []arrayWords){
        int index = 0;
        //assign a variable for the length of the first array element
        int elementLength = arrayWords[0].length();
        //Loop over the array, check every element with this variable, if bigger then re-assign the element value and update the index
        for(int i=1; i< arrayWords.length; i++){
            if(arrayWords[i].length() > elementLength) {
                index = i; elementLength = arrayWords[i].length();
            }
        }

        return arrayWords[index];
    }

*/



}

