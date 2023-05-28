package apexbook.loopquestions;

import java.util.Scanner;

public class Q26_extra {
    /*
Get a String and a character from user
Count the number of characters between the first occurrence and the last occurrence of the
given character in the String
Do not count the space characters
If the character which user selected is displayed just once in the String return -1
If the character which user selected does not exist in the String return -1
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str1 = input.nextLine();
        System.out.println("Enter a char");
        char ch = input.next().charAt(0);

        str1 = str1.replaceAll(" ", "");
        int flag=0;
        for (int i = 0; i < str1.length(); i++) {
         if(str1.charAt(i)==ch){
             flag++;
         }

            }

       if(flag>1){
           System.out.println( flag +" times");
       }else if(flag==0 || flag==1){
           System.out.println("-1");
       }

    }

        }


