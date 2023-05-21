package apexbook.loopquestions;

public class Q13 {

    public static void main(String[] args) {
        /*
        Type code to find the sum of the integers from 3 to 14
         */

//        int sum=0;
//        for (int i = 3; i <15 ; i++) {
//
//            sum+=i;
//        }
//
//        System.out.println("sum = " + sum);

        int sum=0;
        int i=3;

//        while(i<15){
//            sum+=i;
//            i++;
//
//
//        }
//        System.out.println("sum = " + sum);


        do{
           sum+=i;
            i++;
        }while(i<15);

        System.out.println("sum = " + sum);
    }
}
