package apexbook.loopquestions;

public class Q17 {

    public static void main(String[] args) {

        int num=753;
        int a=num/10;
        int sum=0;
        for (int i = 753; i >0 ; i/=10) {
            System.out.println("i = " + i);
            sum+=i%10;
            System.out.println("sum = " + sum);
        }

    }
}
