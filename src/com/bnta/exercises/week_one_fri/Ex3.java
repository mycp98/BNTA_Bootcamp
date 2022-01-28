package com.bnta.exercises.week_one_fri;

public class Ex3 {
    //Write a program that reverses an array of strings
    public static void main(String[] args){
        String[] content = {"you", "are", "how", "hello"};

        for (int i = 0; i < content.length; i++) {
            System.out.println(i + " index -> " + content[i]);
        }

        System.out.println("reverse");

        String result = ""; //="hello " -> ="hello how " .... -> "hello how are you " but we want a ? to replace the space at the end
        for (int i = content.length - 1; i >= 0; i--) {
            System.out.println(i + " index -> " + content[i]);
            result += content[i] + " ";
        }


        System.out.println(result.substring(0, result.length() - 1) + "?");
        //System.out.println(result.substring(0,17) + "?";

    }
}
