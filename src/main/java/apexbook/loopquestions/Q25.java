package apexbook.loopquestions;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        /*
 A number is called an Armstrong number if it equals the sum of the cube of its every digit.
For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which equals the
cube of every digit. Type a code to check if the given number is the Armstrong number or
not.
         */

        Scanner input = new Scanner(System.in);

        do {
            System.out.println(" enter a number ");
            int num = input.nextInt();

            int sum = 0;
            for (int i = 153; i > 0; i /= 10) {

                sum += (i % 10) * (i % 10) * (i % 10);
            }
            System.out.println(sum);

            if (sum == num) {
                System.out.println(num + " is an Armstrong number");
            } else {
                System.out.println(num + " is not an Armstrong number");
            }

            System.out.println("if you want Continue press Y, if you want to Exit press E ");
            String s=input.next();

            if(s.equalsIgnoreCase("E")){
                break;

            }else if(s.equalsIgnoreCase("Y")){

            }

        }while(true);


    }
}
