package apexbook.loopquestions;

public class Q11 {

   /*
   Type code to reverse a String. Example; Mark ==> kraM
    */

    public static void main(String[] args) {
        String name="Mark";
        String cont="";
        for (int i = name.length()-1; i >=0 ; i--) {
            String strName=name.substring(i,i+1);
            cont+=strName;

        }
        System.out.println("cont = " + cont);

        System.out.println();
        System.out.println("*******String Builder******");

        StringBuilder sb=new StringBuilder(name);
        sb= sb.reverse();
        System.out.println("sb = " + sb);
    }


}
