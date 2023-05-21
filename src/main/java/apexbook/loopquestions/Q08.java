package apexbook.loopquestions;

public class Q08 {

    public static void main(String[] args) {
        /*
        Type code to print odd integers from 20 to 3 in the same line with a space between two
        consecutive ones.
         */

        String s = "";
//        for (int i = 20; i >2 ; i--) {
//            if(i%2!=0){
//               s+=i+ " ";
//            }
//        }
//        System.out.println("s = " + s);
//   }

//        int i=20;
//        while(i>2){
//
//            if(i%2!=0){
//                s+=i+ " ";
//            }
//            i--;
//        }
//        System.out.println("s = " + s);
//    }

        int i=20;
        do {
            if(i%2!=0){
                s+=i+ " ";
            }
            i--;
        } while (i>2);

        System.out.println("s = " + s);

    }
}
