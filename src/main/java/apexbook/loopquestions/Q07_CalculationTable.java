package apexbook.loopquestions;

import java.util.Scanner;

public class Q07_CalculationTable {

    public static void main(String[] args) {

        mathOperation();


    }

    public static void mathOperation() {
        try {
        Scanner input = new Scanner(System.in);
        System.out.println("Write one of them      +, -, *, /      ");

            char ch = input.next(".").charAt(0);

                System.out.println("enter a number");
                double num = input.nextDouble();

                switch (ch) {
                    case '+':
                        addOperation(num);
                        break;

                    case '-':
                        subtractOperation(num);
                        break;

                    case '*':
                        multiplyOperation(num);
                        break;

                    case '/':
                        divisionOperation(num);
                        break;

                }

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }

    public static void divisionOperation(double num) {
        for (int i = 1; i < 11; i++) {
            System.out.println(num +"/" +i+ "="  + num / i);
        }
    }

    public static void multiplyOperation(double num) {
        for (int i = 1; i < 11; i++) {
            System.out.println(num +"*" +i+ "=" + num * i);
        }
    }

    public static void subtractOperation(double num) {
        for (int i = 1; i < 11; i++) {
            System.out.println(num +"-" +i+ "=" + (num - i));
        }
    }

    public static void addOperation(double num) {
        for (int i = 1; i < 11; i++) {
            System.out.println(num +"+" +i+ "=" + (num + i));
        }
    }

}

