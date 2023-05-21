package apexbook.loopquestions;

public class Q14 {

    public static void main(String[] args) {

        /*
        Type code to find the multiplication of the integers from 3 to 9
         */

        int mult=1;
//        for (int i = 3; i <10 ; i++) {
//           mult*=i;
//        }
//
//        System.out.println("mult = " + mult);

        int i=3;
//        while(i<10){
//            mult*=i;
//            i++;
//        }
//
//        System.out.println("mult = " + mult);



        do{
          mult*=i;
          i++;
        }while(i<10);

        System.out.println("mult = " + mult);


    }
}
