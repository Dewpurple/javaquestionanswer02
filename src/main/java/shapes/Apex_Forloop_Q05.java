package shapes;

public class Apex_Forloop_Q05 {

    public static void main(String[] args) {
        /*
        Type code to draw the following image by using a for loop.
        A A A A A
        A A A A A
        A A A A A
         */

//        for (int i = 0; i <3 ; i++) {
//            for (int j = 0; j <5 ; j++) {
//                System.out.print("A ");
//            }
//            System.out.println();
//        }


//        int i=0;
//         while(i<3){
//
//            int j=0;
//             while(j<5){
//
//                 System.out.print("A ");
//              j++;
//            }
//
//            System.out.println();
//             i++;
//        }

         int i=0;
         do{
             int j=0;
             while(j<5){
                 System.out.print("A ");
                 j++;
             }
             System.out.println();
             i++;
         }while(i<3);


    }
}
