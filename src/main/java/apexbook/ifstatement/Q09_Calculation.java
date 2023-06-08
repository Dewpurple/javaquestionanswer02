package apexbook.ifstatement;

import java.util.Scanner;

public class Q09_Calculation {


    public static void main(String[] args) {

//        double num1=10;
//        double num2=5;
//
//        String mathOperation="*";
//        if(mathOperation.equals("+")){
//            System.out.println(num1 +"+" + num2 + "=" +(num1+num2));
//        }else if(mathOperation.equals("-")){
//            System.out.println(num1 +"-" + num2 + "=" +(num1-num2));
//        }else if(mathOperation.equals("*")){
//            System.out.println(num1 +"*" + num2 + "=" +num1*num2);
//        }else if(mathOperation.equals("/")) {
//            System.out.println(num1 + "/" + num2 + "=" +num1 / num2);
//        }else{
//            System.out.println(" invalid ");
//        }



        Scanner input =new Scanner(System.in);

        do {
            System.out.println("Enter a number");
            double num1 = input.nextDouble();
            System.out.println("Enter another number");
            double num2 = input.nextDouble();
            System.out.println("Write + , - , * , / ");
            String operator = input.next();

            switch (operator) {
                case "+":
                    System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                    break;
                case "-":
                    System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                    break;
                case "*":
                    System.out.println(num1 + "*" + num2 + "=" + num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
                    break;
                default:
                    System.out.println(" Invalid entries");
                    break;
            }

            System.out.println("If U want to continue write any letter, If U want to exit write E");
            String s= input.next();

            if(s.equalsIgnoreCase("E")){
                System.out.println("See u next time");
                break;
            }
        }while(true);


    }
}
