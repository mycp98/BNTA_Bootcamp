package com.bnta.exercises.week_two_mon;


import java.util.Random;
import java.util.Scanner;


public class Ex5 {
    public static void main(String[] args) {

        boolean showMore = true;

        while (showMore) { //to repeat the question when user inputs "yes"
            Scanner input = new Scanner(System.in);

            printMenu();

            String yesOrNo = input.nextLine();

            if (yesOrNo.equals("yes")){
                jokeGenerator();
            } else if (yesOrNo.equals("no")){
                System.out.println("aww ok bye");
                showMore = false; //breaks the loop and exits the program
            } else{
                System.out.println("Unknown input so I'll ask again:");
            }


        }

    }


    public static void printMenu() {
        System.out.println("Wanna hear a joke? Insert yes or no: ");

    }

    public static void jokeGenerator(){
        //Create a string array of jokes
        String[] jokes ={
                "I invented a new word...plagiarism", //index 0
                "What's Forrest Gump's password? ... 1Forrest1", //index 1
                "Why did the M&M go to school? ...He wanted to be a Smartie", //index 2
                "What do you call bears with no ears? .. B", //index 3
                "Why do French people eat snails? They don't like fast food", //index 4
                "How does a rabbi make coffee? ...Hebrews it!",  //index 5
                "Rest in peace boiling water. You will be mist!",  //index 6
                "Where does the sheep get his hair cut? The baa baa shop!",  //index 7
        };

        Random rand = new Random(); //generating a random number

        //random number between 0 and length of jokes i.e. 8
        int randomNumber = rand.nextInt(jokes.length); //ensures that the random number we generate is within the bounds of the array length and thus equal to the index of the contents in the array (usually we see it as i but in this case, it is "random")

        System.out.println(jokes[randomNumber]); //prints the joke at index random number


    }


}