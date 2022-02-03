package com.bnta.exercises.week_two_mon.email;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your gmail address: ");
        String input = scanner.nextLine();

        validateEmail(input);
    }

   public static void validateEmail(String email ) {
            if (email.contains("@")){
                System.out.println("Thank you.");
            }
            else{
                System.out.println("Unknown email");
            }
         }





       /* boolean correctEmail = true;

        while (correctEmail) {
            if (email.contains("@")) {
                System.out.println("Thanks");
                correctEmail = false;
            } else {
                System.out.println("Unknown email");
                break;
            }
        } */


}







