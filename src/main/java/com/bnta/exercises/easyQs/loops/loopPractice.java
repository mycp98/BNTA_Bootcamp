package com.bnta.exercises.easyQs.loops;

public class loopPractice {
    // public - can call this method from outside the class i'm currently in
    // static - when the jvm makes call to the main method, there is no object existing for the class being called
    // void -
    // main - just the name of the method
    // String args[] - the arguments of type String that the java application accepts when I run it
    public static void main(String[] args){
        //String[] names = {"Marcy", "Benjamin"};

        //using for i loop:
//        for (int i =0; i <= names.length -1 ; i++ ){
//            System.out.println(names[i]);
//
//        }
//        //now using enhanced for loop:
//        for (String i : names){
//            System.out.println(i);
//        }

//        for (int i =0; i<= 10; i++){
//            if (i<=4){
//                continue;
//            }
//            System.out.println(i);
//        }

        for(int i =0 ; i<= 5 ; i++){
            if (i>=2){      //
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-------------------");

        int[] numbers = {1,2,3,4,5};

        for ( int x : numbers){
            if(x<=1){    //skip the code inside the loop when x is less than or equal to 1
                continue;
            }
            System.out.println(x);
        }




    }
}
