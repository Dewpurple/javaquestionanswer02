package apexbook.loopquestions;

public class Q15 {

    public static void main(String[] args) {
        /*
        Type code to print characters from 'C' to 'A' on the console by using do-while loop
         */

        String s="";
      char ch='C';
//        do{
//            s+=ch+"";
//            ch--;
//        }while(ch>='A');
//
//        System.out.println("s = " + s);


//        for (char i = 'C'; i >='A' ; i--) {
//            s+=i+ " ";
//        }
//        System.out.println("s = " + s);


        while(ch>='A'){
            s+=ch;
            ch--;

        }

        System.out.println("s = " + s);

    }
}
