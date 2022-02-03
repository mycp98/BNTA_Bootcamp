package com.bnta.exercises.week_one_fri;
//Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01"

public class Ex4 {
    public static void main(String[] args) {
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        String[] inputArray = input.split(","); //Returns an array of strings after splitting an input String

        double result = 0;

        for (int i = 0; i < inputArray.length; i++) {
            String number = inputArray[i];
            double numberDbl = Double.parseDouble(number); //converts each string to decimal

            //result = result + numberDbl;
            result += numberDbl;
        }

        System.out.println(result);
    }
}
