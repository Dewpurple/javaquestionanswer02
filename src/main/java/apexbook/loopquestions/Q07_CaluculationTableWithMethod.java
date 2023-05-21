package apexbook.loopquestions;

import java.util.Scanner;

public class Q07_CaluculationTableWithMethod {

    static double num1;
    static double num2;


    public static void main(String[] args) {
        System.out.println( getMathOperation());

        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        double num1=input.nextDouble();
        System.out.println("enter a number");
        double num2=input.nextDouble();

        System.out.println("addOperation(num1,num2) = " + addOperation(num1, num2));
        System.out.println("subtractionOperation(num1,num2) = " + subtractionOperation(num1, num2));
        System.out.println("multiplicationOperation(num1,num2) = " + multiplicationOperation(num1, num2));
        System.out.println("divisionOperation(num1,num2) = " + divisionOperation(num1, num2));
    }



    public static char getMathOperation() {
        Scanner input=new Scanner(System.in);
        System.out.println("Write one of math operation + , - , * , / ");
        char ch=input.next().charAt(0);

        switch (ch) {
            case '+':
                addOperation(num1, num2);
                break;
            case '-':
                subtractionOperation(num1,num2);
                break;
            case '*':
               multiplicationOperation(num1,num2);
                break;
            case '/':
                divisionOperation(num1,num2);
                break;
        }
        return ch;
    }

    public static double addOperation(double num1, double num2) {
       return (num1 + num2);
    }


    public static double subtractionOperation(double num1, double num2){

        return num1-num2;
    }

    public static double multiplicationOperation(double num1, double num2){

        return num1*num2;
    }
    public static double divisionOperation(double num1, double num2){

        return num1/num2;
    }
}
