package apexbook.loopquestions;

public class Q21 {

    public static void main(String[] args) {
        /*
        Type code to find the sum of the unique digits of an integer
        */

        int p=12133455;
        String s= String.valueOf(p);

        int sum=0;
        for (int i = 0; i <s.length() ; i++) {
            String idx= s.substring(i,i+1);
            if(s.indexOf(idx)==s.lastIndexOf(idx)){

               sum+=Integer.valueOf(idx);
            }


        }
        System.out.println(sum);


    }
}
