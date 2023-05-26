package apexbook.loopquestions;

public class Q20 {

    public static void main(String[] args) {
       /*
       Type code to draw the following image by using a for loop.
        */

//* * * * * *
//* * * * *
//* * * *
//* * *
//* *
//*


//        for (int i = 0; i < 5; i++) {
//            for (int j = 5; j >i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        int i=0;
        while(i<6){
            for (int j = 6; j>i ; j--) {
                System.out.print("* ");
            }
            i++;
            System.out.println();

        }

    }
}
