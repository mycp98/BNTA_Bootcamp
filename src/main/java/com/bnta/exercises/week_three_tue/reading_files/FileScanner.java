package com.bnta.exercises.week_three_tue.reading_files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileScanner {
    public static void main(String[] args){
        try{
            File file = new File("src/main/java/com/bnta/exercises/week_three_tue/reading_files/input.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch(IOException e){
            System.out.println("File not found");
        }
    }
}
