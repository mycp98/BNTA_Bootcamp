package com.bnta.exercises.easyQs.methods;
//Write a method which takes an array of strings as an argument and returns the number of items in the array.
public class methods6 {
    public static void main(String[] args){
        String [] stringArray = {"Snow White", "Rapunzel", "Cinderella", "Mulan", "Jasmine"};
        System.out.println(princessList(stringArray));
    }
    //Method
    public static int princessList(String[] disneyPrincess){
        return disneyPrincess.length;
    }
}
