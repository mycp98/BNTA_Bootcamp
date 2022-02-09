package com.bnta.exercises.easyQs.scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scanners1 {
    public static void main(String[] args) {
        //Call method:
        //1.
        takeAndPrintInput();
        //2.
        makeInputUpperCase();
        //3.
        printEachLineFromInputFile();

    }

        //Q1
        //Take an input string from the user (from the terminal) and print it back out
        public static void takeAndPrintInput(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your name:");
            String input = scanner.nextLine();

            System.out.println("Your name is: " + input);

            System.out.println("------------------------");
        }
        //Q2
        //Take an input string from the user, make the word uppercase and then print it back out
        public static void makeInputUpperCase(){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String input = scanner.nextLine();
            System.out.println("Your name in Capitals: " + input.toUpperCase());

            System.out.println("------------------------");
        }

        //Q3
        //Print each line from an input file
        public static void printEachLineFromInputFile(){
        //Create a File object from a text file
        File file = new File("src/main/java/com/bnta/exercises/easyQs/scanners/fileForQ3.txt");

        //Create a scanner object from the File object
        //Scanner ourScanner = new Scanner(file);
        Scanner scanner = null;

            try {
                scanner = new Scanner(file);
            } catch (FileNotFoundException exception) {
                exception.printStackTrace();
            }

            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }

        }



}
