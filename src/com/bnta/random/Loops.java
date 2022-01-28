package com.bnta.random;

public class Loops {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};

        // iteration 1
        // i = 0
        // i < numbers.length = 0 < 4 = true  hence the number 1 is printed

        // iteration 2
        // i = 1
        // i < numbers.length = 1 < 4 = true

        // iteration 3
        // i = 2
        // i < numbers.length = 2 < 4 = false

        // iteration 4
        // i = 3
        // i < numbers.length = 3 < 4 = true

        // iteration 5
        // i = 4
        // i < numbers.length = 4 < 4 = false

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
