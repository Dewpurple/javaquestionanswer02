package apexbook.loopquestions;

public class Q17 {

    public static void main(String[] args) {

        int num=753;
        int a=num/10;
        int sum=0;//3+5+7
//        for (int i = 753; i >0 ; i/=10) {
//            System.out.println("i = " + i);
//            sum+=i%10;//753%10=3  ==>75%10=5
//          //  System.out.println("sum = " + sum);
//        }


//        while(num>0){
//            sum+=num%10;
//            num/=10;
//
//        }
//
//        System.out.println(sum);

        do{
          sum+=num%10;
            num/=10;
        }while(num>0);

        System.out.println(sum);


    }
}
