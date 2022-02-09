package com.bnta.exercises.easyQs.scanners;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileScanner {
    public static void main(String[] args){
        try{
            //Create a File object from our text file:
            File file = new File("src/main/java/com/bnta/exercises/easyQs/scanners/input.txt");
            //Create a Scanner object which takes in our File object:
            Scanner scanner = new Scanner(file);

            //while loop which checks if there is another line in the text file
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch(IOException e){
            System.out.println("File not found");
        }
    }
}
