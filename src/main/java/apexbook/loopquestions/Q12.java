package apexbook.loopquestions;

public class Q12 {

    /*
    Type code to draw the following image by using a for loop.
     */

    public static void main(String[] args) {
//        for (int i = 0; i <4 ; i++) {
//
//            for (int j = 0; j <8 ; j++) {
//
//                if(i>0 && j>0 && j<7){
//                    System.out.print("X ");
//                }else{
//                    System.out.print("A ");
//                }
//            }
//            System.out.println();
//        }
//        int i=0;
//
//        while(i<4){
//
//            for (int j = 0; j <8 ; j++) {
//               if(i>0 && j>0 && j<7){
//                   System.out.print("X ");
//               }else{
//                   System.out.print("A ");
//               }
//
//            }
//            System.out.println();
//            i++;
//        }

        int i=0;
        do{
            for (int j = 0; j <8 ; j++) {
                if(i>0 && j>0 && j<7){
                    System.out.print("X ");
                }else{
                    System.out.print("A ");
                }
            }
            System.out.println();
            i++;
        }while(i<4);


    }
}
