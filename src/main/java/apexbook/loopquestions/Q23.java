package apexbook.loopquestions;

import java.util.Scanner;

public class Q23 {

    public static void main(String[] args) {
        /*
Ask the user to enter an integer to check if it is a prime number or not. Example: if user
enters 43 output will be “43 is a prime number”, if user enters 120 output will be “120 is not a
prime number”, if user enters negative integers output will be “Enter a positive integer”
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();

int count=0;
        if(num<=0) {
            System.out.println("it has to be positive");

        }else{
            for (int i = 1; i <=num ; i++) {
                if(num%i==0){
                    count++;

                }

            }

        }

        if(count==2){
            System.out.println( num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }

    }
}
