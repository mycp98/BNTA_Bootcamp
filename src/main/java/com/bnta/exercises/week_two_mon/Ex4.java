package com.bnta.exercises.week_two_mon;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int input = scanner.nextInt();

        checkIfPrime(input);  //call the method

    }

    static void checkIfPrime(int num){

        boolean prime = true;

        if(num ==1){
            prime = false;
        }

        for(int i=2; i <= num/2; ++i){
            if (num % i ==0 ){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }
    }
}






    /*
int i, m=0, flag=0;
int n=5; //input number to be checked
        m=n/2;
        if(n==0 || n==1){  //if n=0 or n=1, then definitely not prime
            System.out.println("Not a prime number");
    }
        else{
            for (i=2; i<= m; i++){
                if( n%1 ==0) { //if the remainder after dividing by 2 is 0 then the number is even therefore not prime
                    System.out.println("Not a prime number");
                    flag=1;
                    break;
                }
                }
            if (flag==0)
                System.out.println("Prime number");
            } //end of else
        }
    }

*/