package apexbook.loopquestions;

import java.util.Scanner;

public class Q23_DoWhile {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int flag = 0;
        do {

            System.out.println(" enter a num");

            int num = input.nextInt();
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    flag++;
                }
            }

            if (num <= 0) {
                System.out.println(" enter a positive num");
            }

            if (flag == 2) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }

            System.out.println("if you want Continue press Y, if you want to Exit press E ");
            String s=input.next();

            if(s.equalsIgnoreCase("E")){
                break;

            }else if(s.equalsIgnoreCase("Y")){

            }
        }while (true) ;


    }

}