package apexbook.loopquestions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q07_Calculation {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=input.nextInt();

//        for (int i = 1; i <11 ; i++) {
//            System.out.println(num + "X" +i+ "=" +num*i);
//        }

//        int i=1;
//        while(i<11){
//            System.out.println(num + "X" +i+ "=" +num*i);
//            i++;
//        }

        int i=1;
        do{
            System.out.println(num + "X" +i+ "=" +num*i);
            i++;
        }while (i<11);

    }
}
