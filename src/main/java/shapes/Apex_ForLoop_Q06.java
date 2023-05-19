package shapes;

public class Apex_ForLoop_Q06 {

    public static void main(String[] args) {
        /*
        Type code to draw the following image by using a for loop.

        A
        A A
        A A A
        A A A A
         */

//        for (int i = 0; i <4 ; i++) {
//            for (int j = 0; j <=i ; j++) {
//                System.out.print("A ");
//            }
//            System.out.println();
//        }

//        int i=0;
//        while(i<4){
//
//            for (int j = 0; j <=i ; j++) {
//                System.out.print("A ");
//            }
//
//            System.out.println();
//            i++;
//        }

        int i=0;
        do{

            for (int j = 0; j <=i ; j++) {
                System.out.print("A ");
            }
            System.out.println();
            i++;

        }while(i<4);


    }
}
