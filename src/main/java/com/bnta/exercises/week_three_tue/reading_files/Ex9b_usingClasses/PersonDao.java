package com.bnta.exercises.week_three_tue.reading_files.Ex9b_usingClasses;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PersonDao {


    private Person[] people;

    //default constructor for DAO
    public PersonDao(){
        try{
            File file = new File("src/main/java/com/bnta/exercises/week_three_tue/reading_files/Ex9b_usingClasses/People.txt");
            int numberOfPeople = getNumberOfLinesInFile(file);
            Person[] peopleArray = new Person[numberOfPeople];


//            Scanner scanner = new Scanner(file);
//            scanner.nextLine();

            //This is reading one person:
//            String onePersonInfo = scanner.nextLine();
//            System.out.println(onePersonInfo);
//            //split the string into
//            String [] onePersonInfoArray = onePersonInfo.split(",");
//            System.out.println(onePersonInfoArray[1]);
//
//            int id = Integer.parseInt(onePersonInfoArray[0]);
//            String firstName = onePersonInfoArray[1];
//            String lastName = onePersonInfoArray[2];
//            String email = onePersonInfoArray[3];
//            String gender = onePersonInfoArray[4];
//
//            Person person1 = new Person(id, firstName, lastName, email, gender);
//            System.out.println(person1);
//            //Person person2 = new Person(2, "sandra", "bullock", "randomem", "f");
//
//            //create a person array
////            Person[] personArr = new Person[3]; //array of size 3
//            people[0] = person1;  //store person1 in teh first space of the array
//


            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            int arrayPosition = 0;
            while (scanner.hasNext()){
                String onePersonInfo = scanner.nextLine();
                //System.out.println(onePersonInfo);
                //split the string into
                String [] onePersonInfoArray = onePersonInfo.split(",");
                //System.out.println(onePersonInfoArray[1]);

                int id = Integer.parseInt(onePersonInfoArray[0]);
                String firstName = onePersonInfoArray[1];
                String lastName = onePersonInfoArray[2];
                String email = onePersonInfoArray[3];
                String gender = onePersonInfoArray[4];

                Person person = new Person(id, firstName, lastName, email, gender);
                //System.out.println(person1);
                //Person person2 = new Person(2, "sandra", "bullock", "randomem", "f");

                //create a person array
//            Person[] personArr = new Person[3]; //array of size 3
                peopleArray[arrayPosition] = person;
                arrayPosition++;
            }
            people = peopleArray;
           // System.out.println(Arrays.toString(people));

        } catch(IOException e){
            System.out.println("File not found");
        }
    }


    public static int getNumberOfLinesInFile(File file){
        try{
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            int numOfLines = 0;

            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
                numOfLines = numOfLines + 1;
            }
            return numOfLines;

        } catch(IOException e) {
            System.out.println("File not found");
        }
        return 0;
    }
    //getter to access array
    public Person[] getPeople(){
        return people;
    }
}
