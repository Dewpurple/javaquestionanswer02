package apexbook.loopquestions;

public class Q24_FibonacciNumbers {

    public static void main(String[] args) {

        //0 1 1 2 3 5 8 13

//        int f1=1;
//        int f2=1;
//        int count=0;
//
//        System.out.print(f1 + " " +f2);
//
//        for (int i = 2; i <=13 ; i++) {
//            count=f1+f2;//0+1
//
//            f1=f2;//f1=1 f2=1
//            f2=count;//1
//            System.out.print(" " + count + " ");
//        }

        int ff1=0;
        int ff2=1;
        int count =0;
        int num=5;

        System.out.print(ff1 + " " +ff2);

        for (int i = 2; i <num ; i++) {// 2 3 4
            count =ff1+ff2;//1  2   3
            ff1=ff2;//ff1=1  ff1=1
            ff2=count;//ff2=1  ff2=2
            System.out.print(" " +count + " ");

        }


    }
}
